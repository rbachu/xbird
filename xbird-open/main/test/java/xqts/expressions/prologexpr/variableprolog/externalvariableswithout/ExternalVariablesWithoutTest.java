/*
 * @(#)$Id: XQTSTest.template 946 2006-09-14 03:31:56Z yui $
 *
 * Copyright 2006-2008 Makoto YUI
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 * 
 * Contributors:
 *     Makoto YUI - initial implementation
 */
package xqts.expressions.prologexpr.variableprolog.externalvariableswithout;

import junit.framework.TestCase;
import xqts.XQTSTestBase;

public class ExternalVariablesWithoutTest extends TestCase {

    private static final String TEST_PATH = "((//ns:test-group[count(child::ns:test-group)=0])[144]//ns:test-case)";
    private static final String TARGET_XQTS_VERSION = "1.0.2";
    
    private final XQTSTestBase xqts;

    public ExternalVariablesWithoutTest() {
    	super(ExternalVariablesWithoutTest.class.getName());
        this.xqts = new XQTSTestBase(ExternalVariablesWithoutTest.class.getName(), TARGET_XQTS_VERSION);
    }

    public void testExtvardeclwithouttype1() throws Exception {
        xqts.invokeTest(TEST_PATH + "[1]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype2() throws Exception {
        xqts.invokeTest(TEST_PATH + "[2]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype3() throws Exception {
        xqts.invokeTest(TEST_PATH + "[3]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype4() throws Exception {
        xqts.invokeTest(TEST_PATH + "[4]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype5() throws Exception {
        xqts.invokeTest(TEST_PATH + "[5]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype6() throws Exception {
        xqts.invokeTest(TEST_PATH + "[6]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype7() throws Exception {
        xqts.invokeTest(TEST_PATH + "[7]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype8() throws Exception {
        xqts.invokeTest(TEST_PATH + "[8]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype9() throws Exception {
        xqts.invokeTest(TEST_PATH + "[9]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype10() throws Exception {
        xqts.invokeTest(TEST_PATH + "[10]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype11() throws Exception {
        xqts.invokeTest(TEST_PATH + "[11]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype12() throws Exception {
        xqts.invokeTest(TEST_PATH + "[12]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype13() throws Exception {
        xqts.invokeTest(TEST_PATH + "[13]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype14() throws Exception {
        xqts.invokeTest(TEST_PATH + "[14]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype15() throws Exception {
        xqts.invokeTest(TEST_PATH + "[15]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype16() throws Exception {
        xqts.invokeTest(TEST_PATH + "[16]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype17() throws Exception {
        xqts.invokeTest(TEST_PATH + "[17]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype18() throws Exception {
        xqts.invokeTest(TEST_PATH + "[18]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype19() throws Exception {
        xqts.invokeTest(TEST_PATH + "[19]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype20() throws Exception {
        xqts.invokeTest(TEST_PATH + "[20]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype21() throws Exception {
        xqts.invokeTest(TEST_PATH + "[21]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype22() throws Exception {
        xqts.invokeTest(TEST_PATH + "[22]");
    }

    @org.junit.Test(timeout=300000)
    public void testExtvardeclwithouttype23() throws Exception {
        xqts.invokeTest(TEST_PATH + "[23]");
    }

}