package com.wsj.springbootdemo.config;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import static springfox.documentation.builders.PathSelectors.regex;

/**
 * 项目名称：Swagger2Configuration;
 * 类 名 称：Swagger2Configuration;
 * 类 描 述：TODO ;
 * 创 建 人：Angus;
 * 创建时间：2020/5/7 22:23;
 *
 * @version：1.0
 **/
@Configuration
@EnableSwagger2
public class Swagger2Configuration {
    /**
     *
     * @return
     */
    @Bean
    public Docket accessToken() {
        return new Docket(DocumentationType.SWAGGER_2).groupName("api")// 定义组
                .select() // 选择那些路径和 api 会生成 document
                .apis(RequestHandlerSelectors.basePackage("com.wsj.springbootdemo.controller")) // 拦截的包 路径
                .paths(regex("/*/.*"))// 拦截的接口路径
                .build() // 创建
                .apiInfo(apiInfo()); // 配置说明
    }
    private ApiInfo apiInfo() {
        return new ApiInfoBuilder()//
                .title("springbootdemo")// 标题
                .description("spring boot 全集")// 描述
                .termsOfServiceUrl("https://javawsj.blog.csdn.net/")//
                .contact(new Contact("wsj", "https://javawsj.blog.csdn.net/",
                        "itwsj0218@126.com"))// 联系
// .license("Apache License Version 2.0")// 开源协议
// .licenseUrl("https://github.com/springfox/springfox/blob/master/LICENSE")// 地址
                .version("1.0")// 版本
                .build();
    }
}
