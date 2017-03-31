package com.java.spring.serviceImpl;

import javax.annotation.Resource;
import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.TextMessage;

import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import com.java.spring.service.ConsumerService;

/**
* @author 作者:zhaofq
* @version 创建时间：2017年3月28日 上午10:29:24
* 类说明
*/
@Service
public class ConsumerServiceImpl implements ConsumerService{
	
	/*//Queue消息目的地
	@Resource(name = "demoQueueDestination")
	Destination destination;
	
	//Topic消息目的地
	@Resource(name = "activeMQTopicDestination")
	Destination topicdestination;
	*/
	/*@Resource(name="jmsTemplateTopic")
    JmsTemplate jmsTemplate;
*/
	@Override
	public TextMessage receive() {
		// TODO Auto-generated method stub
		return null;
	}
	

	/*//指定消息目的地的发送方法
		@Resource(name="jmsTemplateTopic")
	    private JmsTemplate jmsTemplateTopic;

    public TextMessage receive(){
        TextMessage textMessage = (TextMessage) jmsTemplate.receive(destination);
        try{
            System.out.println("从队列" + destination+ "收到了消息：\t"+ textMessage.getText().toString());
        } catch (JMSException e) {
            e.printStackTrace();
        }
        return textMessage;
    }
    
    public TextMessage receiveTopic(){
        TextMessage textMessage = (TextMessage) jmsTemplateTopic.receive(topicdestination);
        try{
            System.out.println("从队列" + topicdestination+ "收到了消息：\t"+ textMessage.getText().toString());
        } catch (JMSException e) {
            e.printStackTrace();
        }
        return textMessage;
    }*/
}
