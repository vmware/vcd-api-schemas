#!/usr/bin/env python

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


from setuptools import setup, find_packages
import os

def package_files(path):
    curr_dir = os.getcwd()
    print('Current Dir..'+curr_dir)
    target_dir = curr_dir + '/vcloud'
    try:
        os.system('rm -rf '+target_dir)
    except BaseException as e:
        pass

    swagger_dir =  swagger_init_path.replace('.','/')
    swagger_dirs = swagger_dir.split('/')[1:]
    path_temp = path + 'vcloud/'
    for dir in swagger_dirs:
        path_temp = path_temp + dir +'/'
        with open(os.path.join(path_temp, '__init__.py'), 'w'):
            pass
    os.system('cp '+ path + swagger_init_path + '/models/__init__.py' + path+swagger_dir+'/models')
    os.system('cp -r ' + path + 'vcloud/' +' '+curr_dir)

swagger_init_path = 'vcloud.rest.openapi'
package_files('../bindings/python/api-bindings/target/generated-python-bindings/')


setup(
    setup_requires=['pbr>=1.9', 'setuptools>=17.1'],
    pbr=True,
)