/**
 * FileName: CousleProperties
 * Author:   songfz
 * Date:     2019/4/29 15:18
 * Description: cousle初始化
 */
package com.dubbo.demo.config;

import com.ecwid.consul.v1.ConsulClient;
import com.ecwid.consul.v1.Response;
import com.ecwid.consul.v1.kv.model.GetValue;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.util.StringUtils;

import java.io.StringReader;
import java.util.Map;
import java.util.Properties;

/**
 * 〈一句话功能简述〉<br> 
 * 〈cousle初始化〉
 *
 * @author songfz
 * @create 2019/4/29
 * @since 1.0.0
 */
public class ConsulProperties {
private final static Logger LOG = LoggerFactory.getLogger(ConsulProperties.class);

public void startup(){
    try{
        ConsulConfig consulConfig = ApplicationContextHolder.getBean(ConsulConfig.class);
        ConsulClient client = new ConsulClient(consulConfig.getHost(),consulConfig.getPort());

        Response<GetValue> response;
        if(StringUtils.isEmpty(consulConfig.getToken())){

            response =  client.getKVValue(consulConfig.getKey()+ consulConfig.getData_key() );
        }else{
            response =  client.getKVValue(consulConfig.getKey()+ consulConfig.getData_key()  );
        }
//        存储cousle 数据
        Properties properties =   new Properties();
        if(response.getValue() != null){

            StringReader reader = new StringReader(response.getValue().getDecodedValue());
            properties.load(reader);
            for(Map.Entry<Object,Object> entry : properties.entrySet()){

                properties.setProperty(String.valueOf(entry.getKey()),String.valueOf(entry.getValue()));
            }
        }
        LOG.info("结果：{}",properties);
    }catch (Exception e){
        LOG.error(e.getMessage(),e);
    }
}

    public ConsulProperties() {

    }

    private String getHttpUrl(String ip, String url) {
		String httpUrl =  System.getProperty("consul.http") + ip + ":"
						+ System.getProperty("server.port")
						+ url;
		return httpUrl;
	}

}
