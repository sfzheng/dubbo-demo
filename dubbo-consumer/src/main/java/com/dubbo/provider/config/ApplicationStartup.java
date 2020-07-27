/**
 * FileName: LoadConfig
 * Author:   songfz
 * Date:     2019/4/29 16:29
 * Description: 加载配置
 */
package com.dubbo.provider.config;

import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;

/**
 * 〈一句话功能简述〉<br> 
 * 〈加载配置〉
 *
 * @author songfz
 * @create 2019/4/29
 * @since 1.0.0
 */
public class ApplicationStartup implements ApplicationListener<ContextRefreshedEvent> {

    @Override
    public void onApplicationEvent(ContextRefreshedEvent var1){
       new ConsulProperties().startup();
    }
}
