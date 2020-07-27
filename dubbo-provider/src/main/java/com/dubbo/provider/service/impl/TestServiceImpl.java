/**
 * FileName: TestServiceImpl
 * Author:   songfz
 * Date:     2019/2/26 10:19
 * Description: 测试
 */
package com.dubbo.provider.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.dubbo.provider.service.Produer;
import com.dubbo.provider.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * 〈一句话功能简述〉<br> 
 * 〈测试〉
 *
 * @author songfz
 * @create 2019/2/26
 * @since 1.0.0
 */
@Service
public class TestServiceImpl implements TestService {

    @Autowired
    private Produer produer;
    @Override
    public String hello(String name) {
        this.produer.send("log","kafka 传输第一个数据"+name);
        return "Hello World! " + name;
    }
}
