package Epam_gopisadi.tdd_junit;

/*import junit.framework.Test;
import junit.framework.TestCase;
import junit.framework.TestSuite;
import  org.junit.Assert.*; */

import org.junit.Before;
import static org.junit.Assert.*;



public class Removechar {
	       RemoveFun rf;
	@Before
	public void setUp() {
		rf = new RemoveFun();
	}
	
	public void testFirst1A() {
		assertEquals("BCD", rf.remove("ABCD"));
	}
	
	public void testFirst2As() {
		assertEquals("CD", rf.remove("AACD"));
	}
	
	public void testSecond1A() {
		assertEquals("BCD", rf.remove("BACD"));
	}
	
	
	public void testNoAs() {
		assertEquals("BBAA", rf.remove("BBAA"));
	}
	
	public void testAs() {
		assertEquals("BAA", rf.remove("AABAA"));
	}

}
