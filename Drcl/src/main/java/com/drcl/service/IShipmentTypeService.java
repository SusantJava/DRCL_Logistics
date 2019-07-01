package com.drcl.service;

import java.util.List;

import com.drcl.model.ShipmentType;

public interface IShipmentTypeService {
	public Integer saveShipmentType(ShipmentType shipmentType);
	public void updateShipmentType(ShipmentType shipmentType);
	public void deleteShipmentType(Integer shipmentId);
	public ShipmentType getShipmentTypeById(Integer shipmentId);
	public List<ShipmentType> getAllShipmentTypes();
	public List<Object[]> getShipmentTypeCount();
	public boolean isShipmentCodeExist(String shipmentCode);

}
