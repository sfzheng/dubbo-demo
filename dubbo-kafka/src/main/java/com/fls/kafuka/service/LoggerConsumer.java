/**
 * FileName: LoggerConsumer
 * Author:   songfz
 * Date:     2019/5/6 15:55
 * Description: 日志消费
 */
package com.fls.kafuka.service;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

/**
 * 〈一句话功能简述〉<br> 
 * 〈日志消费〉
 *
 * @author songfz
 * @create 2019/5/6
 * @since 1.0.0
 */
@Component
public class LoggerConsumer {
private final static Logger LOG = LoggerFactory.getLogger(LoggerConsumer.class);
    @KafkaListener(topics = "kafka-log4j")
    public void receiverMessage(ConsumerRecord<String, String> consumerRecord){
        LOG.info("结果kafka-log4j:{}",consumerRecord.value());
    }
}
