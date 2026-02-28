package com.journaldev.mockito.spy;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.spy;
import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;

import org.junit.jupiter.api.Test;

public class MockitoSpyExample {
	
	@Test
	void test() {
		
		List<String> list = new ArrayList<String>();
		List<String> spyOnList = spy(list);
		
		spyOnList.add("A");
		assertEquals(1, spyOnList.size());
		assertEquals("A", spyOnList.get(0));
		
		spyOnList.add("E");
		assertEquals(2, spyOnList.size());
		assertEquals("E", spyOnList.get(1));
		
		when(spyOnList.size()).thenReturn(10);
		assertEquals(10, spyOnList.size());
		
	}

}
