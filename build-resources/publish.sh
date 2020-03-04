# VMware vCloud Python API Schemas Type
#Copyright (c) 2020 VMware, Inc. All rights reserved.
#
#The BSD-2 license (the "License") set forth below applies to all parts of the
#vCloud Director API Tools project.  You may not use this file except in
#compliance with the License.
#
#BSD-2 License
#
#Redistribution and use in source and binary forms, with or without
#modification, are permitted provided that the following conditions are met:

# Redistributions of source code must retain the above copyright notice, this
#  list of conditions and the following disclaimer.

# Redistributions in binary form must reproduce the above copyright notice,
#  this list of conditions and the following disclaimer in the documentation
#  and/or other materials provided with the distribution.

#!/usr/bin/env bash

python setup.py develop
python setup.py sdist bdist_wheel
twine upload dist/*
