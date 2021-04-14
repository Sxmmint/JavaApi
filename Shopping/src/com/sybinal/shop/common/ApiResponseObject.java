package com.sybinal.shop.common;

public class ApiResponseObject {
	
	private String Code;
	private String Msg;
	private Object data;
	
	public String getCode() {
		return Code;
	}
	public void setCode(String Code) {
		this.Code = Code;
	}
	public String getMsg() {
		return Msg;
	}
	public void setMsg(String Msg) {
		this.Msg = Msg;
	}
	public Object getData() {
		return data;
	}
	public void setData(Object data) {
		this.data = data;
	}
	
	
}
