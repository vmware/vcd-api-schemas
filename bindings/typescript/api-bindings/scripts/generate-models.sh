#!/usr/bin/env bash

# This script generates the models.js file needed for the model to compile

path="$1/vcloud/rest/openapi/model"

[ -f "$path/models.ts" ] && rm -f "$path/models.ts"

files=$(ls "$path")
for file in $files; do
  echo "export * from './$(echo "$file" | cut -d '.' -f 1)';" >> "$path/models.ts"
  done