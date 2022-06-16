#!/usr/bin/env bash

# This script cleans some binding generation error

path="$1/vcloud/api/rest/schema/ovf"

files=$(ls "$path")
for file in $files; do
    if [ ! -d "$path/$file" ]; then
      sed -i '' -E 's/extends JAXBElement.*{/{/g' "$path/$file"
    fi
done
