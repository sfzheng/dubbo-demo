/**
 * FileName: Cousle
 * Author:   songfz
 * Date:     2019/4/30 13:23
 * Description:
 */
package com.dubbo.demo.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Configuration;


/**
 * 〈一句话功能简述〉<br>
 * 〈〉
 *
 * @author songfz
 * @create 2019/4/30
 * @since 1.0.0
 */
@Configuration
//@ConfigurationProperties(prefix = "consul")
public class ConsulConfig {

    @Value(value = "${consul.config.key}")
    private String key ;
    @Value(value = "${consul.host}")
    private String host;
    @Value(value = "${consul.port}")
    private Integer port;
    @Value(value = "${consul.token}")
    private String token;
    @Value(value = "${consul.config.data_key}")
    private String data_key;



    public String getKey() {
        return key;
    }

    public String getHost() {
        return host;
    }

    public Integer getPort() {
        return port;
    }

    public String getToken() {
        return token;
    }

    public String getData_key() {
        return data_key;
    }


}
