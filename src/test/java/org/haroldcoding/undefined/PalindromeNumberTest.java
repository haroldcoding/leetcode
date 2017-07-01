package org.haroldcoding.undefined; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

/** 
* PalindromeNumber Tester. 
* 
* @author <Authors name> 
* @since <pre>06/30/2017</pre> 
* @version 1.0 
*/ 
public class PalindromeNumberTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: isPalindrome(int x) 
* 
*/ 
@Test
public void testIsPalindrome() throws Exception { 
//TODO: Test goes here...
    PalindromeNumber p = new PalindromeNumber();
    assertFalse(p.isPalindrome(-2147447412));
} 


} 
