/*
 * @(#)$Id$
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
package xbird.xquery.func;

import java.util.List;

/**
 * 
 * <DIV lang="en">
 * <pre>
 * Caution:
 *  - Provided function must be publicly accessible (public class) and loadable by the classloader (put in the classpath).
 *  - Provided function must have a default constructor.
 *  - Provided function must have a namespace prefix "ext:".
 *  - Provided function must be state-less. Don't override {@link BuiltInFunction#isReusable()}.
 * </pre>
 * </DIV>
 * <DIV lang="ja"></DIV>
 * 
 * @author Makoto YUI (yuin405+xbird@gmail.com)
 */
public interface FunctionProvider {

    /**
     * Provided functions are loaded as predefined functions.
     */
    List<? extends BuiltInFunction> injectedFunctions();

}
