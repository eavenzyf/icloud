package com.cx.service_provider.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("service-hi")
public interface ISayHiService {
    @RequestMapping("hello")
    String sayHi(String name);
}
