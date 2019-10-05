#配置一个feign远程调用

1. 添加依赖
    ```xml
      <dependency>
         <groupId>org.springframework.cloud</groupId>
         <artifactId>spring-cloud-starter-openfeign</artifactId>
     </dependency>

     <dependency>
         <groupId>org.springframework.boot</groupId>
         <artifactId>spring-boot-starter-web</artifactId>
     </dependency>
    <!--由于feign需要取注册中心中的信息，所以必须要有netflix-eureka-client依赖 -->
     <dependency>
         <groupId>org.springframework.cloud</groupId>
         <artifactId>spring-cloud-starter-netflix-eureka-client</artifactId>
     </dependency>
    ```
    
2. yml配置

    ```
    eureka:
      client:
        serviceUrl:
          defaultZone: http://eureka-7901:7901/eureka/
        instance:
          hostname: localhost
          instance-id: eureka-consumer
    ```
 3. 编写代码
    
    1. 在启动类上添加@EnableFeignClients  @EnableEurekaClient注解
    2. 编写feign调用接口：如
    ```java
        @FeignClient(name="spring-cloud-producer")
        @Service
        public interface HelloService {
        
            @RequestMapping(value = "hello")
            String hello(@RequestParam("name") String name);
        }
    ```
    @FeignClient注解中的name属性是eurek注册中心中注册的application-name 属性的值
    
