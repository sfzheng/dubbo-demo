/**
 * FileName: TestController
 * Author:   songfz
 * Date:     2019/2/26 10:32
 * Description: Test
 */
package com.dubbo.demo.controller;

import com.dubbo.demo.service.TestConsumerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * 〈一句话功能简述〉<br> 
 * 〈Test〉
 *
 * @author songfz
 * @create 2019/2/26
 * @since 1.0.0
 */
@RestController
public class TestController {

    @Autowired
    private TestConsumerService testConsumerService;



    @RequestMapping("test")
    public String rest(){
        return this.testConsumerService.rest("start");
    }
}
