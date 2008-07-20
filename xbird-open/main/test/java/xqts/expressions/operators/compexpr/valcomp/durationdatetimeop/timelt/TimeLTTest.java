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
package xqts.expressions.operators.compexpr.valcomp.durationdatetimeop.timelt;

import junit.framework.TestCase;
import xqts.XQTSTestBase;

public class TimeLTTest extends TestCase {

    private static final String TEST_PATH = "((//ns:test-group[count(child::ns:test-group)=0])[69]//ns:test-case)";
    private static final String TARGET_XQTS_VERSION = "1.0.2";
    
    private final XQTSTestBase xqts;

    public TimeLTTest() {
    	super(TimeLTTest.class.getName());
        this.xqts = new XQTSTestBase(TimeLTTest.class.getName(), TARGET_XQTS_VERSION);
    }

    public void testOpTimeLessThan2args1() throws Exception {
        xqts.invokeTest(TEST_PATH + "[1]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan2args2() throws Exception {
        xqts.invokeTest(TEST_PATH + "[2]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan2args3() throws Exception {
        xqts.invokeTest(TEST_PATH + "[3]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan2args4() throws Exception {
        xqts.invokeTest(TEST_PATH + "[4]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan2args5() throws Exception {
        xqts.invokeTest(TEST_PATH + "[5]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan2args6() throws Exception {
        xqts.invokeTest(TEST_PATH + "[6]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan2args7() throws Exception {
        xqts.invokeTest(TEST_PATH + "[7]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan2args8() throws Exception {
        xqts.invokeTest(TEST_PATH + "[8]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan2args9() throws Exception {
        xqts.invokeTest(TEST_PATH + "[9]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan2args10() throws Exception {
        xqts.invokeTest(TEST_PATH + "[10]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan1() throws Exception {
        xqts.invokeTest(TEST_PATH + "[11]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan2() throws Exception {
        xqts.invokeTest(TEST_PATH + "[12]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan3() throws Exception {
        xqts.invokeTest(TEST_PATH + "[13]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan4() throws Exception {
        xqts.invokeTest(TEST_PATH + "[14]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan5() throws Exception {
        xqts.invokeTest(TEST_PATH + "[15]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan6() throws Exception {
        xqts.invokeTest(TEST_PATH + "[16]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan7() throws Exception {
        xqts.invokeTest(TEST_PATH + "[17]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan8() throws Exception {
        xqts.invokeTest(TEST_PATH + "[18]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan9() throws Exception {
        xqts.invokeTest(TEST_PATH + "[19]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan10() throws Exception {
        xqts.invokeTest(TEST_PATH + "[20]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan11() throws Exception {
        xqts.invokeTest(TEST_PATH + "[21]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan12() throws Exception {
        xqts.invokeTest(TEST_PATH + "[22]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan13() throws Exception {
        xqts.invokeTest(TEST_PATH + "[23]");
    }

    @org.junit.Test(timeout=300000)
    public void testOpTimeLessThan14() throws Exception {
        xqts.invokeTest(TEST_PATH + "[24]");
    }

    @org.junit.Test(timeout=300000)
    public void testKTimeLT1() throws Exception {
        xqts.invokeTest(TEST_PATH + "[25]");
    }

    @org.junit.Test(timeout=300000)
    public void testKTimeLT2() throws Exception {
        xqts.invokeTest(TEST_PATH + "[26]");
    }

    @org.junit.Test(timeout=300000)
    public void testKTimeLT3() throws Exception {
        xqts.invokeTest(TEST_PATH + "[27]");
    }

    @org.junit.Test(timeout=300000)
    public void testKTimeLT4() throws Exception {
        xqts.invokeTest(TEST_PATH + "[28]");
    }

    @org.junit.Test(timeout=300000)
    public void testKTimeLT5() throws Exception {
        xqts.invokeTest(TEST_PATH + "[29]");
    }

    @org.junit.Test(timeout=300000)
    public void testKTimeLT6() throws Exception {
        xqts.invokeTest(TEST_PATH + "[30]");
    }

}