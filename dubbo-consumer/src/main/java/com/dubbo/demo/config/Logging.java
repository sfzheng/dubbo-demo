/**
 * FileName: Logging
 * Author:   songfz
 * Date:     2019/5/6 14:28
 * Description: 日志配置
 */
package com.dubbo.demo.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * 〈一句话功能简述〉<br> 
 * 〈日志配置〉
 *
 * @author songfz
 * @create 2019/5/6
 * @since 1.0.0
 */
@Configuration
@ConfigurationProperties(prefix = "logging")
public class Logging
{
//    @Value(value = "${logging.path}")
//    private String path;
//
//    public String getPath() {
//        return path;
//    }
}
