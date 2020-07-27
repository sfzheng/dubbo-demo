/**
 * FileName: TestConsumerService
 * Author:   songfz
 * Date:     2019/2/26 10:29
 * Description: 测试
 */
package com.dubbo.provider.service;

import com.alibaba.dubbo.config.annotation.Reference;
import org.springframework.stereotype.Service;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试〉
 *
 * @author songfz
 * @create 2019/2/26
 * @since 1.0.0
 */
@Service
public class TestConsumerService {

    @Reference
    private TestService testService;


    public String  rest(String name){

        return this.testService.hello(name);
    }

}
