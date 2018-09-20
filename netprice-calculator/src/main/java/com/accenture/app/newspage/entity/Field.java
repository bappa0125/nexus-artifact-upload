package com.accenture.app.newspage.entity;

public class Field {
	
	// The key for the label for the custom field. Example is price.custom.discount[1]
	private String labelKey;
	
	// The data type for the custom field
	private Integer fieldDataType;

	public String getLabelKey() {
		return labelKey;
	}
	public void setLabelKey(String labelKey) {
		this.labelKey = labelKey;
	}
	public Integer getFieldDataType() {
		return fieldDataType;
	}
	public void setFieldDataType(Integer fieldDataType) {
		this.fieldDataType = fieldDataType;
	}
	
}
