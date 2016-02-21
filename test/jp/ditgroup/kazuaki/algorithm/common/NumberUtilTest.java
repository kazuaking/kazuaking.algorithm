package jp.ditgroup.kazuaki.algorithm.common;

import static org.junit.Assert.*;

import org.junit.Test;

public class NumberUtilTest {

	@Test
	public void testModPow() {
		
		assertEquals(100, NumberUtil.modPow(10, 2));
		assertEquals(1000, NumberUtil.modPow(10, 3));
		assertEquals(1024, NumberUtil.modPow(2, 10));
		assertEquals(65536, NumberUtil.modPow(2, 16));
	}

}
