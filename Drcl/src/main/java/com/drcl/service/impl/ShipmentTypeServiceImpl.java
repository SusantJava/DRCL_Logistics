package com.drcl.service.impl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import com.drcl.dao.IShipmentTypeDao;
import com.drcl.model.ShipmentType;
import com.drcl.service.IShipmentTypeService;

@Service
public class ShipmentTypeServiceImpl implements IShipmentTypeService {
	@Autowired
	private IShipmentTypeDao dao;

	@Transactional
	public Integer saveShipmentType(ShipmentType shipmentType) {
		return dao.saveShipmentType(shipmentType);
	}

	@Transactional
	public void updateShipmentType(ShipmentType shipmentType) {
		dao.updateShipmentType(shipmentType);
	}

	@Transactional
	public void deleteShipmentType(Integer shipmentId) {

		dao.deleteShipmentType(shipmentId);

	}

	@Transactional(readOnly=true)
	public ShipmentType getShipmentTypeById(Integer shipmentId) {
		return dao.getShipmentTypeById(shipmentId);
	}

	@Transactional(readOnly=true)
	public List<ShipmentType> getAllShipmentTypes() {
		return dao.getAllShipmentTypes();
	}

	@Transactional(readOnly=true)
	public List<Object[]> getShipmentTypeCount() {

		return dao.getShipmentTypeCount();
	}

	@Transactional(readOnly=true)
	public boolean isShipmentCodeExist(String shipmentCode) {
		return dao.isShipmentCodeExist(shipmentCode);
	}
}
