package vn.kyo;

import static org.junit.Assert.*;

import org.junit.Test;

public class ToolsTest {

	@Test
	public void test() {
//		assertEquals("Joined string didn't match", "1 2 3", Tools.validateMail(""));
		assertTrue("True email", Tools.validateMail("longta@gmail.com"));
//		fail("Not yet implemented");
	}
	
	@Test
	public void notEmail() {
		assertFalse("False email", Tools.validateMail("longta@gmailcom"));
	}

}
