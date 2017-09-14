package com.tracy.client;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tracy.facade.NodeAClient;
/**
 * 
 * @author tracy
 * 2017年9月14日 下午2:54:39
 */
@RestController
public class HelloClient {
	
	@Autowired
	private NodeAClient nodeAClient;

	@RequestMapping(value = "/hello")
	public String hello() {
		String response = nodeAClient.ask();

		return "hello:" + response;
	}

}
