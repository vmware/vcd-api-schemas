# VMware vCloud Python API schemas type
# Copyright (c) 2020 VMware, Inc. All Rights Reserved.
#
# Licensed under the Apache License, Version 2.0 (the "License");
# you may not use this file except in compliance with the License.
# You may obtain a copy of the License at
#
#     http://www.apache.org/licenses/LICENSE-2.0
#
# Unless required by applicable law or agreed to in writing, software
# distributed under the License is distributed on an "AS IS" BASIS,
# WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
# See the License for the specific language governing permissions and
# limitations under the License.

import os

def package_files():
    curr_dir = os.getcwd()
    print('Current Dir..'+curr_dir)
    destination = curr_dir + '/../../../../../build-resources/'
    target_dir = destination + 'vcloud'
    print('Target Dir..'+target_dir)
    try:
        os.system('rm -rf '+target_dir)
    except BaseException as e:
        pass

    swagger_dir =  swagger_init_path.replace('.','/')
    swagger_dirs = swagger_dir.split('/')[1:]
    path_temp = curr_dir + '/vcloud/'
    for dir in swagger_dirs:
        path_temp = path_temp + dir +'/'
        with open(os.path.join(path_temp, '__init__.py'), 'w'):
            pass
    print(curr_dir +'/' + swagger_init_path + '/models/__init__.py')
    
    os.system('cp '+ curr_dir +'/' + swagger_init_path + '/models/__init__.py ' + curr_dir +'/'+swagger_dir+'/models')
    os.system('cp -r ' + curr_dir + '/vcloud/' +' '+destination)

swagger_init_path = 'vcloud.rest.openapi'
package_files()
