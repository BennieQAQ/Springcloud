package org.wangyu.springcloud.service;

import java.util.List;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.wangyu.springcloud.entity.Dept;

@FeignClient(value = "microservicecloud-dept")
public interface DeptServiceClient {
	
	@RequestMapping(value = "/dept/get/{id}",method = RequestMethod.GET)
	public Dept getDept(@PathVariable("id") Long id);
	
	@RequestMapping(value = "/dept/list",method = RequestMethod.GET)
	public List<Dept> getlist();
	
	@RequestMapping(value = "/dept/add",method = RequestMethod.POST)
	public boolean add(Dept dept);
}
