/**
 * FileName: LoggerProduer
 * Author:   songfz
 * Date:     2019/5/7 14:55
 * Description: 生产者
 */
package com.dubbo.provider.service.impl;

import com.dubbo.provider.service.Produer;
import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈生产者〉
 *
 * @author songfz
 * @create 2019/5/7
 * @since 1.0.0
 */
@Component
public class LoggerProduer implements Produer {

    private static Logger LOG = Logger.getLogger(LoggerProduer.class);

    @Autowired
    private KafkaTemplate kafkaTemplate;

    @Override
    public void send(String topic, String message) {
        kafkaTemplate.send(topic, message);
        LOG.setLevel(Level.INFO);
        LOG.info("Producer->topic:{}, message:{}"+ topic+ message);
        LOG.debug("这是一条debug级别的日志！");
        LOG.info("这是一条info级别的日志！");
        LOG.error("这是一条error级别的日志！");
    }
}
