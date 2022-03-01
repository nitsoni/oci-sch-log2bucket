## Copyright (c) 2020, Oracle and/or its affiliates.
## All rights reserved. The Universal Permissive License (UPL), Version 1.0 as shown at http://oss.oracle.com/licenses/upl

variable "tenancy_ocid" {}
variable "current_user_ocid" {}
# variable "fingerprint" {}
# variable "private_key_path" {}
variable "compartment_ocid" {}
variable "region" {}

variable "ocir_user_name" {}
variable "ocir_user_password" {}

variable "bucket_name" {
  default = "LogArchivalbucket"
}

variable "VCN-CIDR" {
  default = "10.0.0.0/16"
}

variable "fnsubnet-CIDR" {
  default = "10.0.1.0/24"
}

variable "ocir_repo_name" {
  default = "functions"
}

variable "log_group_id" {
  type = string
  default = "_Audit"
}

variable "service_connector_tasks_batch_size_in_kbs" {
  default = 512
}

variable "service_connector_tasks_batch_time_in_sec" {
  default = 60
}

data "oci_identity_regions" "oci_regions" {
  
  filter {
    name = "name" 
    values = [var.region]
  }

}

# OCIR repo name & namespace

locals {
  ocir_docker_repository = join("", [lower(lookup(data.oci_identity_regions.oci_regions.regions[0], "key")), ".ocir.io"])
  ocir_namespace =  data.oci_identity_tenancy.current_user_tenancy.name 
}
