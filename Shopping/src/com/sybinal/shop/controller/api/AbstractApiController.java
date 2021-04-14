package com.sybinal.shop.controller.api;

import com.sybinal.shop.common.ApiResponseObject;

public abstract class AbstractApiController {

	public ApiResponseObject reponseJSON(String Code, String Msg, Object resData) {
		ApiResponseObject apiResponseObject = new ApiResponseObject();
		apiResponseObject.setCode(Code);
		apiResponseObject.setMsg(Msg);
		apiResponseObject.setData(resData);
		return apiResponseObject;
	}
}
