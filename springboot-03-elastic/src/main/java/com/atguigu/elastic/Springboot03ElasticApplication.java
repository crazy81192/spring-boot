package com.atguigu.elastic;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * SpringBoot默认支出两种技术来和ES交互
 * 1.Jest(默认不生效)
 * 	需要导入jest的工具包：io.searchbox.client.JestClient
 * 2.SpringData ElasticSearch
 * 		1).Client clusterNodes;clusterName
 * 		2).ElasticsearchTemplate操作es
 * 		3).编写一个ElasticsearchRepository的子接口来操作es
 * 两种用法：https://github.com/spring-projects/spring-data-elasticsearch
 * 1.编写一个ElasticsearchRepository的子接口
 */

@SpringBootApplication
public class Springboot03ElasticApplication {

	public static void main(String[] args) {
		SpringApplication.run(Springboot03ElasticApplication.class, args);
	}

}
