package jp.ditgroup.kazuaki.algorithm;

import static org.junit.Assert.*;

import org.junit.Test;

public class RounderTest {

	@Test
	public void test() {
		assertEquals(12.35, Rounder.modRound(12.3456, 3), 2);
		assertEquals(12.346, Rounder.modRound(12.3456, 4), 3);
		assertEquals(1.235, Rounder.modRound(1.23456, 4), 3);
		assertEquals(1.2, Rounder.modRound(1.23456, 1), 2);
		assertEquals(1.2, Rounder.modRound(1.15, 1), 2);
		// assertEquals(2.0, Rounder.modRound(1.5, 0), 0); 
	}

}
