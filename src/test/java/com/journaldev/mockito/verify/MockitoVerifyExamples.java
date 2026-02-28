package com.journaldev.mockito.verify;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.never;
import java.util.List;

import org.junit.jupiter.api.Test;


class MockitoVerifyExamples {
	
	@Test
	void test() {
		List<String> mockList = mock(List.class);
		mockList.add("Pankaj");
		mockList.size();
		
		verify(mockList.add("Pankaj"));
		//verify(mockList).add(java.util.UUID.randomUUID().toString());
		
		verify(mockList, times(1)).size();
		verify(mockList, atLeastOnce()).size();
		verify(mockList, atMost(2)).size();
		verify(mockList, atLeast(1)).size();
		verify(mockList, never()).clear();
		// all interactions are verified, so below will pass
		verifyNoMoreInteractions(mockList);
		
		
	}

}
