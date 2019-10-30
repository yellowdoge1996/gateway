package com.example.getway.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.cloud.client.discovery.ReactiveDiscoveryClient;
import org.springframework.cloud.gateway.discovery.GatewayDiscoveryClientAutoConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * <p>
 * 無
 * </p>
 *
 * @author NWT)hxl
 * @version 1.0
 * <p>
 * 変更履歴:
 * 2019/10/30 ： NWT)hxl ： 新規作成
 * @date 2019/10/30 15:45
 */
@Configuration
@AutoConfigureAfter(GatewayDiscoveryClientAutoConfiguration.class)
public class TestConfig {

    Logger logger = LoggerFactory.getLogger(TestConfig.class);

    @Bean
    @ConditionalOnBean(ReactiveDiscoveryClient.class)
    public void reactiveDiscoveryClientExist(){
        logger.info("--------------ReactiveDiscoveryClient.class exist!-----------");
    }
    @Bean
    @ConditionalOnMissingBean(ReactiveDiscoveryClient.class)
    public void reactiveDiscoveryClientNoExist(){
        logger.info("--------------ReactiveDiscoveryClient.class not exist!-----------");

    }
    @Bean
    @ConditionalOnProperty(name = "spring.cloud.gateway.discovery.locator.enabled")
    public void lovatorEnabled(){
        logger.info("--------------spring.cloud.gateway.discovery.locator.enabled=true-----------");
    }
}
