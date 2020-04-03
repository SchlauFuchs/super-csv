/*
 * Copyright 2007 Kasper B. Graversen
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
 */
package org.supercsv.util.reflection;

import java.lang.reflect.Method;
import org.junit.After;

import static org.junit.Assert.assertFalse;

import org.junit.Before;
import org.junit.Test;
import org.supercsv.mock.NonPublicBeanUtil;

import static org.supercsv.util.ReflectionUtils.findSetter;

/**
 * Test the ReflectionUtils class for non-public classes and methods.
 * 
 * @author Fabian Seifert
 */
public class ReflectionUtilsNonPublicTest {
	
	private Object nonPublicBean;
	private Object extendedNonPublicBean;
	
	/**
	 * Sets up before the test.
	 */
	@Before
	public void setUp() {
		nonPublicBean = NonPublicBeanUtil.getNonPublicReflectionBean();
		extendedNonPublicBean = NonPublicBeanUtil.getExtendedReflectionBean();
	}
	
	/**
	 * Tidies up after the test.
	 */
	@After
	public void tearDown() {
		nonPublicBean = null;
		extendedNonPublicBean = null;
	}
	
	/**
	 * Tests the findSetter() method.
	 */
	@Test
	public void testFindSetter() {
		Method setter = findSetter(nonPublicBean, "name", String.class);
		assertFalse(setter.canAccess(nonPublicBean));
	}
	
	/**
	 * Tests the findSetter() method.
	 */
	@Test
	public void testFindSetterExtended() {
		Method ageSetter = findSetter(extendedNonPublicBean, "age", Long.class);
		assertFalse(ageSetter.canAccess(extendedNonPublicBean));
		
		Method nameSetter = findSetter(extendedNonPublicBean, "name", String.class);
		assertFalse(nameSetter.canAccess(extendedNonPublicBean));
	}
	
}
