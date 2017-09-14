package com.tracy.facade;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient(name = "server-node-a")
public interface NodeAClient {

	@RequestMapping(value = "/ask")
	public String ask();

}
