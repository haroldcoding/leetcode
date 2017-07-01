package org.haroldcoding.undefined; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;

/** 
* RomanToInteger Tester. 
* 
* @author <Authors name> 
* @since <pre>07/01/2017</pre> 
* @version 1.0 
*/ 
public class RomanToIntegerTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: romanToInt(String s) 
* 
*/ 
@Test
public void testRomanToInt() throws Exception { 
//TODO: Test goes here...
    RomanToInteger rt = new RomanToInteger();
    assertEquals(rt.romanToInt("i"),1);
    assertEquals(rt.romanToInt("ii"),2);
    assertEquals(rt.romanToInt("iii"),3);
    assertEquals(rt.romanToInt("iv"),4);
    assertEquals(rt.romanToInt("xi"),11);
    assertEquals(rt.romanToInt("xiv"),14);
    assertEquals(rt.romanToInt("xviii"),18);
} 


} 
