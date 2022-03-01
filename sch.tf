

resource "oci_sch_service_connector" "this" {
  compartment_id = var.compartment_ocid
  display_name   = "LogsArchivingConnector"
  state          = "ACTIVE"

  source {
    kind = "logging"

    log_sources {
      compartment_id = var.compartment_ocid
      log_group_id   = var.log_group_id
    }
  }

  target {
    kind                       = "objectStorage"
    compartment_id             = var.compartment_ocid
    bucket                     = oci_objectstorage_bucket.this.name
    namespace                  = oci_objectstorage_bucket.this.namespace
    object_name_prefix         = "logs"
    batch_rollover_size_in_mbs = 2
    batch_rollover_time_in_ms  = 60000
  }

  tasks {
    kind = "function"
    function_id = oci_functions_function.function.id
    batch_size_in_kbs = var.service_connector_tasks_batch_size_in_kbs
    batch_time_in_sec = var.service_connector_tasks_batch_time_in_sec
  }
}

resource "oci_objectstorage_bucket" "this" {
  compartment_id        = var.compartment_ocid
  namespace             = data.oci_identity_tenancy.current_user_tenancy.name
  name                  = var.bucket_name
  access_type           = "NoPublicAccess"
  object_events_enabled = false
}


