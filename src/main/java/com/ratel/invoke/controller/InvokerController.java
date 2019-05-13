/*
 * 天虹商场股份有限公司版权所有.
 */
package com.ratel.invoke.controller;
import com.ratel.demo.client.DemoClient;
import com.ratel.demo.dto.model.Demo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 类说明
 * <p>
 *
 * @author niexiang
 * @version 1.0.0
 * @date 2018/12/28
 */
@RestController
@RequestMapping(value = "/invoke")
public class InvokerController {
    @Autowired
    private DemoClient demoClient;

    @GetMapping("get")
    public Object met(){
        Demo demo = new Demo();
        demo.setId(201L);
        return demoClient.get(demo);
    }



}
