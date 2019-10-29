package com.atguigu.starter;

/**
 * @author ming
 * @create 2019-08-20 23:39
 */
public class HelloService {

    private HelloProperties helloProperties;

    public HelloProperties getHelloProperties() {
        return helloProperties;
    }

    public void setHelloProperties(HelloProperties helloProperties) {
        this.helloProperties = helloProperties;
    }

    public String sayHelloAtguigu(String name){
        return helloProperties.getPrefix() + "-" + name + helloProperties.getSuffix();
    }
}
