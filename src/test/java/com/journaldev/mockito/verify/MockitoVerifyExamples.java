package com.journaldev.mockito.verify;

import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.times;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.atLeastOnce;
import static org.mockito.Mockito.atMost;
import static org.mockito.Mockito.calls;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.never;
import static org.mockito.Mockito.verifyNoInteractions;
import static org.mockito.Mockito.only;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.junit.jupiter.api.Test;
import org.mockito.InOrder;
import org.mockito.Mockito;


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
		
		mockList.isEmpty();
		
		Map mockMap = mock(Map.class);
		Set mockSet = mock(Set.class);
		verify(mockList.isEmpty());
		verifyNoInteractions(mockList, mockMap, mockSet);
	
		mockMap.isEmpty();
		verify(mockMap, only()).isEmpty();
		
		// testing order of mock method calls
		// can skip methods but order should be followed
		InOrder inOrder = Mockito.inOrder(mockList, mockMap);
		inOrder.verify(mockList.add("Pankaj"));
		inOrder.verify(mockList, calls(1)).size();
	}

}
