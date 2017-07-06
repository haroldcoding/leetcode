package org.haroldcoding.stack; 

import static org.junit.Assert.assertTrue;

import org.junit.Test;
import org.junit.Before; 
import org.junit.After; 

/** 
* ValidParentheses Tester. 
* 
* @author <Authors name> 
* @since <pre>07/06/2017</pre> 
* @version 1.0 
*/ 
public class ValidParenthesesTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: isValid(String s) 
* 
*/ 
@Test
public void testIsValid() throws Exception { 
//TODO: Test goes here...
    ValidParentheses vp = new ValidParentheses();
    assertTrue("true",vp.isValid("(){}[]"));
}


} 
