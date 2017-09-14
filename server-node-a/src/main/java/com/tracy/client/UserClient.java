package com.tracy.client;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracy.facade.NodeAClient;

/**
 * 
 * @author tracy
 * 2017年9月14日 下午2:52:53
 */
@RestController
public class UserClient implements NodeAClient{

	@RequestMapping(value = "/ask")
	public String ask() {
		return "tracy";
	}
}
