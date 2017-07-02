package org.haroldcoding.undefined; 

import org.junit.Test; 
import org.junit.Before; 
import org.junit.After;

import static org.junit.Assert.assertEquals;

/** 
* LongestCommonPrefix Tester. 
* 
* @author <Authors name> 
* @since <pre>07/02/2017</pre> 
* @version 1.0 
*/ 
public class LongestCommonPrefixTest { 

@Before
public void before() throws Exception { 
} 

@After
public void after() throws Exception { 
} 

/** 
* 
* Method: longestCommonPrefix(String[] strs) 
* 
*/ 
@Test
public void testLongestCommonPrefix() throws Exception { 
//TODO: Test goes here...
    String[] strs = {"abcde","abcdefg","abcdefgh"};
    String[] strs2 = {"abcdef","abcdeh","abcdefgh"};
    LongestCommonPrefix lc = new LongestCommonPrefix();
    assertEquals("abcde",lc.longestCommonPrefix(strs));
    assertEquals("abcde",lc.longestCommonPrefix(strs2));
} 


} 
