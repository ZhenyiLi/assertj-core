/**
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except in compliance with
 * the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the License is distributed on
 * an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied. See the License for the
 * specific language governing permissions and limitations under the License.
 *
 * Copyright 2012-2014 the original author or authors.
 */
package org.assertj.core.api.object;

import org.assertj.core.api.ObjectAssert;
import org.assertj.core.api.ObjectAssertBaseTest;
import org.assertj.core.test.Jedi;

import static org.mockito.Mockito.verify;


/**
 * Tests for <code>{@link ObjectAssert#isEqualToComparingOnlyGivenFields(Object, String...)}</code>.
 * 
 * @author Nicolas François
 * @author Mikhail Mazursky
 */
public class ObjectAssert_isLenientEqualsToByAcceptingFields_Test extends ObjectAssertBaseTest {

  private Jedi other = new Jedi("Yoda", "Blue");

  @Override
  protected ObjectAssert<Jedi> invoke_api_method() {
    return assertions.isEqualToComparingOnlyGivenFields(other, "name");
  }

  @Override
  protected void verify_internal_effects() {
    verify(objects).assertIsEqualToComparingOnlyGivenFields(getInfo(assertions), getActual(assertions), other, "name");
  }
}
