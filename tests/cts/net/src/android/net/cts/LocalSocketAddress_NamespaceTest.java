/*
 * Copyright (C) 2008 The Android Open Source Project
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package android.net.cts;

import android.net.LocalSocketAddress.Namespace;
import android.test.AndroidTestCase;
import dalvik.annotation.TestTargets;
import dalvik.annotation.TestLevel;
import dalvik.annotation.TestTargetNew;
import dalvik.annotation.TestTargetClass;

@TestTargetClass(Namespace.class)
public class LocalSocketAddress_NamespaceTest extends AndroidTestCase {

    @Override
    protected void setUp() throws Exception {
        super.setUp();
    }

    @TestTargetNew(
        level = TestLevel.TODO,
        notes = "Test valueOf(String name).",
        method = "valueOf",
        args = {java.lang.String.class}
    )
    public void testValueOf() {
        assertEquals(Namespace.ABSTRACT, Namespace.valueOf("ABSTRACT"));
        assertEquals(Namespace.RESERVED, Namespace.valueOf("RESERVED"));
        assertEquals(Namespace.FILESYSTEM, Namespace.valueOf("FILESYSTEM"));
    }

    @TestTargetNew(
        level = TestLevel.TODO,
        notes = "Test values().",
        method = "values",
        args = {}
    )
    public void testValues() {
        Namespace[] expected = Namespace.values();
        assertEquals(Namespace.ABSTRACT, expected[0]);
        assertEquals(Namespace.RESERVED, expected[1]);
        assertEquals(Namespace.FILESYSTEM, expected[2]);
    }
}

