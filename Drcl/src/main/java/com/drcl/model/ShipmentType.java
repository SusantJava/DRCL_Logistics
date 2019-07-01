package com.drcl.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

@Entity
@Table(name="shipmentTab")
public class ShipmentType {
	@Id
	@GeneratedValue(generator="shipment1")
	@GenericGenerator(name="shipment1",strategy="increment")
	@Column(name="sid")
	private Integer shipmentId;
	
	@Column(name="smode")
	private String shipmentMode;
	
	@Column(name="scode")
	private String shipmentCode;
	
	@Column(name="senblship")
	private String enableShipment;
	
	@Column(name="sgrd")
	private String shipmentGrade;
	
	@Column(name="sdesc")
	private String shipDesc;
	@Column(name="snote")
	private String note;

	public ShipmentType() {
		super();
	}

	public ShipmentType(Integer shipmentId) {
		super();
		this.shipmentId = shipmentId;
	}

	public Integer getShipmentId() {
		return shipmentId;
	}

	public void setShipmentid(Integer shipmentId) {
		this.shipmentId = shipmentId;
	}

	public String getShipmentMode() {
		return shipmentMode;
	}

	public void setShipmentMode(String shipmentMode) {
		this.shipmentMode = shipmentMode;
	}

	public String getShipmentCode() {
		return shipmentCode;
	}

	public void setShipmentCode(String shipmentCode) {
		this.shipmentCode = shipmentCode;
	}

	public String getEnableShipment() {
		return enableShipment;
	}

	public void setEnableShipment(String enableShipment) {
		this.enableShipment = enableShipment;
	}

	public String getShipmentGrade() {
		return shipmentGrade;
	}

	public void setShipmentGrade(String shipmentGrade) {
		this.shipmentGrade = shipmentGrade;
	}

	public String getShipDesc() {
		return shipDesc;
	}

	public void setShipDesc(String shipDesc) {
		this.shipDesc = shipDesc;
	}
	

	public String getNote() {
		return note;
	}

	public void setNote(String note) {
		this.note = note;
	}

	@Override
	public String toString() {
		return "ShipmentType [shipmentid=" + shipmentId + ", shipmentMode=" + shipmentMode + ", shipmentCode="
				+ shipmentCode + ", enableShipment=" + enableShipment + ", shipmentGrade=" + shipmentGrade
				+ ", shipDesc=" + shipDesc + ", note=" + note + "]";
	}

	
	
}
