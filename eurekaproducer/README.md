# Getting Started

1. 引入依赖
    ```
    <dependency>
                <groupId>org.springframework.cloud</groupId>
                <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
            </dependency>
    
            <dependency>
                <groupId>org.springframework.boot</groupId>
                <artifactId>spring-boot-starter-web</artifactId>
            </dependency>
    ```

2. 配置yml文件
    ```
    spring:
      application:
      name: spring-cloud-producer
    server:
      port: 9000
    
    eureka:
      client:
        service-url:
          defaultZone: http://eureka-7901:7901/eureka/
      instance:
        hostname: localhost
        instance-id: spring-cloud-producer
    ```
  
  #### 完成1,2两步配置 启动项目即可在eureka管理后台观察到服务已经注册到注册中心