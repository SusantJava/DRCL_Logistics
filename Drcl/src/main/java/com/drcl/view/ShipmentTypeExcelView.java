package com.drcl.view;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.springframework.web.servlet.view.document.AbstractXlsView;

import com.drcl.model.ShipmentType;

public class ShipmentTypeExcelView extends AbstractXlsView {
	@SuppressWarnings("unchecked")
	@Override
	protected void buildExcelDocument(Map<String, Object> model, Workbook workbook, HttpServletRequest request,
			HttpServletResponse response) throws Exception {
		//Change file name
		
		response.addHeader("Content-Disposition","attachment;filename=shipments.xlsx");
		//Read data from ModelMap
		List<ShipmentType> shipmentType=(List<ShipmentType>)model.get("shipmentType");
		//Create Sheet with name shipments
		Sheet sheet=workbook.createSheet("Shipment Types");
		//Create row #0 only headings
		setHead(sheet);
		//Create Row # 1 onwards
		setBody(sheet,shipmentType);
		
	}
	private void setHead(Sheet sheet) {
		Row row = sheet.createRow(0);
		row.createCell(0).setCellValue("ID");
		row.createCell(1).setCellValue("MODE");
		row.createCell(2).setCellValue("CODE");
		row.createCell(3).setCellValue("ENABLE");
		row.createCell(4).setCellValue("GRADE");
		row.createCell(5).setCellValue("NOTE");
		
	}
	private void setBody(Sheet sheet,List<ShipmentType>shipmentType) {
		int rowNum=1;
		for(ShipmentType s:shipmentType) {
			Row row=sheet.createRow(rowNum++);
			row.createCell(0).setCellValue(s.getShipmentId());
			row.createCell(0).setCellValue(s.getShipmentMode());
			row.createCell(0).setCellValue(s.getShipmentCode());
			row.createCell(0).setCellValue(s.getEnableShipment());
			row.createCell(0).setCellValue(s.getShipmentGrade());
			row.createCell(0).setCellValue(s.getNote());
			
		}
		
	}

}
