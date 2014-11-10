/*
 *  Licensed to the Apache Software Foundation (ASF) under one or more
 *  contributor license agreements.  See the NOTICE file distributed with
 *  this work for additional information regarding copyright ownership.
 *  The ASF licenses this file to You under the Apache License, Version 2.0
 *  (the "License"); you may not use this file except in compliance with
 *  the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing, software
 *  distributed under the License is distributed on an "AS IS" BASIS,
 *  WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 *  See the License for the specific language governing permissions and
 *  limitations under the License.
 *
 */

package org.owasp.dependencycheck.org.apache.tools.ant.types.resources;

import java.io.File;

/**
 * This is an interface that resources that can provide a file should implement.
 * This is a refactoring of {@link FileResource}, to allow other resources
 * to act as sources of files (and to make components that only support
 * file-based resources from only support FileResource resources.
 * @since Ant 1.8
 */
public interface FileProvider {
    /**
     * Get the file represented by this Resource.
     * @return the file.
     */
    File getFile();
}
