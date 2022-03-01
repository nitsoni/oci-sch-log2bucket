## Copyright (c) 2020, Oracle and/or its affiliates.
## All rights reserved. The Universal Permissive License (UPL), Version 1.0 as shown at http://oss.oracle.com/licenses/upl

resource "null_resource" "Login2OCIR" {
  depends_on = [
  oci_functions_application.fn_application
  ]

  provisioner "local-exec" {
    command = "echo '${var.ocir_user_password}' |  docker login ${local.ocir_docker_repository} --username ${local.ocir_namespace}/${var.ocir_user_name} --password-stdin"
  }
}

resource "null_resource" "function_Push2OCIR" {
  depends_on = [null_resource.Login2OCIR, oci_functions_application.fn_application]

  provisioner "local-exec" {
    command     = "image=$(docker images | grep cloud-sch-demo-fn | awk -F ' ' '{print $3}') ; docker rmi -f $image &> /dev/null ; echo $image"
    working_dir = "functions/cloud-sch-demo-fn"
  }

  provisioner "local-exec" {
    command     = "fn build --verbose"
    working_dir = "functions/cloud-sch-demo-fn"
  }

  provisioner "local-exec" {
    command     = "image=$(docker images | grep cloud-sch-demo-fn | awk -F ' ' '{print $3}') ; docker tag $image ${local.ocir_docker_repository}/${local.ocir_namespace}/${var.ocir_repo_name}/cloud-sch-demo-fn:0.0.1"
    working_dir = "functions/cloud-sch-demo-fn"
  }

  provisioner "local-exec" {
    command     = "docker push ${local.ocir_docker_repository}/${local.ocir_namespace}/${var.ocir_repo_name}/cloud-sch-demo-fn:0.0.1"
    working_dir = "functions/cloud-sch-demo-fn"
  }

}

