#!/bin/bash
cd "$(dirname "$0")"
sed -i 's/\/1.0.0\/sessions\/{.*}/\/1.0.0\/sessions\/{id}/g' target/openapi-schemas/schemas/vcloud-openapi-schemas.yaml
