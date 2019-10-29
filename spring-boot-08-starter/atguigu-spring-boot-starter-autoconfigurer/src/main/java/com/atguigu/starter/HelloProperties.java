package com.atguigu.starter;

import org.springframework.boot.context.properties.ConfigurationProperties;

/**
 * @author ming
 * @create 2019-08-20 23:42
 */
@ConfigurationProperties(prefix = "atguigu.hello")
public class HelloProperties {
    private String prefix;
    private String suffix;

    public String getPrefix() {
        return prefix;
    }

    public void setPrefix(String prefix) {
        this.prefix = prefix;
    }

    public String getSuffix() {
        return suffix;
    }

    public void setSuffix(String suffix) {
        this.suffix = suffix;
    }
}
