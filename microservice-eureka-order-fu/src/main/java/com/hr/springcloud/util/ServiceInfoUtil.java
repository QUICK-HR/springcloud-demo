package com.hr.springcloud.util;

import org.springframework.boot.context.embedded.EmbeddedServletContainerInitializedEvent;
import org.springframework.context.ApplicationListener;
import org.springframework.context.annotation.Configuration;

/**
 * 演示负载均衡的实现效果，监听服务端实例端口的工具类
 * @author 刘焕燃 🐇
 * @date 2021/2/18 18:20
 */
@Configuration
public class ServiceInfoUtil implements ApplicationListener<EmbeddedServletContainerInitializedEvent> {
    /**
     * 声明event对象，该对象用于获取运行服务器的本地端口
     * @param embeddedServletContainerInitializedEvent
     */
    private static EmbeddedServletContainerInitializedEvent event;
    @Override
    public void onApplicationEvent(EmbeddedServletContainerInitializedEvent embeddedServletContainerInitializedEvent) {
        ServiceInfoUtil.event = embeddedServletContainerInitializedEvent;
    }
    /**
     * 获取端口号
     */
    public static int getPort(){
        int port = event.getEmbeddedServletContainer().getPort();
        return port;
    }
}
