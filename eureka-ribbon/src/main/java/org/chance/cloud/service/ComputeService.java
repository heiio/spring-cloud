package org.chance.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/2/24.
 */

@Service
public class ComputeService {

    @Autowired
    RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "addServiceFallback")
    public String addService(){
        System.out.println("service!");
        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=20&b=10", String.class)
                .getBody();
    }

    public String addServiceFallback(){
        System.out.println(">>>>>>>>>>>>>>>>");
        return "error";
    }

}
