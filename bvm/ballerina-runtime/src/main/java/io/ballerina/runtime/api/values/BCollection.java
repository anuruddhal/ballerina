/*
 * Copyright (c) 2019, WSO2 Inc. (http://www.wso2.org) All Rights Reserved.
 *
 * WSO2 Inc. licenses this file to you under the Apache License,
 * Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing,
 * software distributed under the License is distributed on an
 * "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 * KIND, either express or implied.  See the License for the
 * specific language governing permissions and limitations
 * under the License.
 */
package io.ballerina.runtime.api.values;

import io.ballerina.runtime.api.types.semtype.SemType;

/**
 * <p>
 * {@link BCollection} represents a collection in Ballerina.
 * </p>
 * 
 * @since 1.1.0
 */
public interface BCollection {

    /**
     * Create new Iterator for this collection.
     *
     * @return iterator created.
     */
    BIterator<?> getIterator();

    default SemType shapeOf() {
        return null;
    }

    default void cacheShape(SemType semType) {

    }
}
