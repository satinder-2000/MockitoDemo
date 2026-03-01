package com.journaldev.mockito.iterator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class MockIteratorTest {
	
	private Shipment shipment;
	private Shipment shipment2;
	
	@Mock
	private Order mockOrder1;
	@Mock
	private Order mockOrder2;
	@Mock
	private Order mockOrder3;
	@Mock
	private ArrayList<Order> mockShipmentOrders;
	@Mock
	private ArrayList<Order> mockShipmentOrders2;
	
	@Before
	public void setUp() {
		MockitoAnnotations.openMocks(this);
		mockShipmentOrders.add(mockOrder1);
		mockShipmentOrders.add(mockOrder2);
		mockShipmentOrders2.add(mockOrder3);
		shipment = new Shipment(1, Arrays.asList(mockOrder1, mockOrder2));
		shipment2 = new Shipment(2, Arrays.asList(mockOrder3));
		
	}
	
	@Test
	public void testMergeShipments() {
		shipment.mergeShipments(shipment2);
		assertEquals(3, shipment.getShipmentOrders().size());
	}

}
