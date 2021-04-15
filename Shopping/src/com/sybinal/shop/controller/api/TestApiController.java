package com.sybinal.shop.controller.api;


import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.sybinal.shop.common.ApiResponseEnum;
import com.sybinal.shop.common.ApiResponseObject;


@RestController
public class TestApiController extends AbstractApiController {

	@RequestMapping("/list")
	public ApiResponseObject List(Integer Userid) {
		System.err.println("成功进入"+Userid);
		return reponseJSON(ApiResponseEnum.SUCCESS.getCode(),ApiResponseEnum.SUCCESS.getName(), "Hello world!");
	}
}


