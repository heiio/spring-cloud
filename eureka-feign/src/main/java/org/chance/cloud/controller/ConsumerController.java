package org.chance.cloud.controller;

import org.apache.log4j.Logger;
import org.chance.cloud.client.ComputeClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Administrator on 2017/2/23.
 */

@RestController
@RequestMapping("/")
public class ConsumerController {

    private final Logger logger = Logger.getLogger(getClass());

    @Autowired
    private ComputeClient computeClient;

    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public Integer add(){
        System.out.println("test");
        return computeClient.add(10,20);
    }
}
