/*
 *  Copyright (c) 2023, WSO2 LLC. (https://www.wso2.com).
 *
 *  WSO2 LLC. licenses this file to you under the Apache License,
 *  Version 2.0 (the "License"); you may not use this file except
 *  in compliance with the License.
 *  You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 *  Unless required by applicable law or agreed to in writing,
 *  software distributed under the License is distributed on an
 *  "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY
 *  KIND, either express or implied. See the License for the
 *  specific language governing permissions and limitations
 *  under the License.
 */
package io.ballerina.types.typeops;

import io.ballerina.types.BasicTypeBitSet;
import io.ballerina.types.SemType;

import java.util.Iterator;

/**
 * Ballerina iterator is similar to an iterable in Java.
 * This class implements the iterable for `SubtypePairIteratorImpl`
 *
 * @since 2201.8.0
 */
public class SubtypePairs implements Iterable<SubtypePair> {

    private final SemType t1;
    private final SemType t2;
    private final BasicTypeBitSet bits;

    public SubtypePairs(SemType t1, SemType t2, BasicTypeBitSet bits) {
        this.t1 = t1;
        this.t2 = t2;
        this.bits = bits;
    }

    @Override
    public Iterator<SubtypePair> iterator() {
        return new SubtypePairIterator(t1, t2, bits);
    }
}
