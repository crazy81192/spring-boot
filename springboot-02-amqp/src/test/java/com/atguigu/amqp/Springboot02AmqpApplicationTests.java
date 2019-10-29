package com.atguigu.amqp;

import com.atguigu.amqp.entity.Book;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.amqp.core.AmqpAdmin;
import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.DirectExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

@RunWith(SpringRunner.class)
@SpringBootTest
public class Springboot02AmqpApplicationTests {

	@Autowired
	RabbitTemplate template;

	@Autowired
	AmqpAdmin amqpAdmin;

	@Test
	public void createExchange(){
//		amqpAdmin.declareExchange(new DirectExchange("amqpAdmin.exchange"));
//		System.out.println("创建完成");
//		amqpAdmin.declareQueue(new Queue("amqpAdmin.queue",true));
		amqpAdmin.declareBinding(new Binding("amqpAdmin.queue", Binding.DestinationType.QUEUE,"amqpAdmin.exchange","amqp.haha",null));
	}

	/**
	 * 1.单播(点对点)
	 */
	@Test
	public void contextLoads() {
//		Message需要自己构造一个，定制消息体内容和消息头
//		template.send(exchange,routeKey,message);
//		object默认当成消息体，只需要传入要发送的对象，自动序列化发送给rabbitmq
//		template.convertAndSend(exchange,routeKey,object);

		Map<String,Object> map = new HashMap<>();
		map.put("msg","这是我的第一个消息");
		map.put("data", Arrays.asList("Helloworld",123,true));
		//对象被默认序列化以后发送
		template.convertAndSend("exchange.direct","atguigu.news",map);
	}
	//接收数据，如何将数据自动转为json
	@Test
	public void receive(){
		Object o = template.receiveAndConvert("atguigu.news");
		System.out.println(o.getClass());
		System.out.println(o);

	}

	/**
	 * 广播
	 */
	@Test
	public void sendMsg(){
		template.convertAndSend("exchange.fanout","",new Book("红楼梦","曹雪芹"));
	}

}
