package cn.springcloud.bamboo.feign.config;

import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

import com.netflix.loadbalancer.ILoadBalancer;

import feign.Feign;

/**
 * Created by saleson on 2017/11/9.
 */
@ConditionalOnClass(value = {ILoadBalancer.class, Feign.class})
@Configuration
@EnableFeignClients(defaultConfiguration = {BambooFeignClientsConfiguration.class})
public class BambooFeignConfiguration {


}
