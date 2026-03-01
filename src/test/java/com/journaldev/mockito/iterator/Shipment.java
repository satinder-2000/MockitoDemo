package com.journaldev.mockito.iterator;

import java.util.List;

public class Shipment {
	@SuppressWarnings("unused")
	private long shipmentId;
	private List<Order> shipmentOrders;
	
	public Shipment(long shipmentId, List<Order> shipmentOrders) {
		super();
		this.shipmentId = shipmentId;
		this.shipmentOrders = shipmentOrders;
	}

	public List<Order> getShipmentOrders() {
		return shipmentOrders;
	}
	
	public void mergeShipments(Shipment shipment2){     
	    List<Order> existingShipment = shipment2.getShipmentOrders();
	    for (Order order : existingShipment){
	        shipmentOrders.add(order);
	    }
	}

}
