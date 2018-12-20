[![Build Status](https://travis-ci.org/vmware/vcd-api-schemas.svg?branch=master)](https://travis-ci.org/vmware/vcd-api-schemas)

# vCloud Director API Schemas

## Overview
The schemas that represent all public interfacing into vCloud Director, including the XSD-based REST API at `/api`, the new OpenAPI endpoints at `/cloudapi`, and the object extensibility schemas for communication with specific phases of vCloud Director operations. There are also language bindings available for Java and Typescript.

## Try it out
The schemas are available in XSD and YAML formats for direct consumption in whatever project you prefer. They are also available as Maven packages for integrating into Maven or Gradle-based projects.

To build the language-specific bindings, execute `mvn install` from the root directory.

## Contributing

The vcd-api-schemas project team welcomes contributions from the community. Before you start working with vcd-api-schemas, please read our [Developer Certificate of Origin](https://cla.vmware.com/dco). All contributions to this repository must be signed as described on that page. Your signature certifies that you wrote the patch or have the right to pass it on as an open-source patch. For more detailed information, refer to [CONTRIBUTING.md](CONTRIBUTING.md).
