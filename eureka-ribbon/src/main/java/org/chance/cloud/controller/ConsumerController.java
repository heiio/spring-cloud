package org.chance.cloud.controller;

import org.apache.log4j.Logger;
import org.chance.cloud.service.ComputeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * Created by Administrator on 2017/2/23.
 */

@RestController
public class ConsumerController {

    private final Logger logger = Logger.getLogger(getClass());

//    @Autowired
//    private RestTemplate restTemplate;

    @Autowired
    private ComputeService computeService;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(){
        System.out.println("test");
//        return restTemplate.getForEntity("http://COMPUTE-SERVICE/add?a=20&b=10", String.class)
//                .getBody();
        return computeService.addService();
    }


}
