eureka:注册中心
ribbon：服务消费：负载均衡 ，已手动集成断路器
feign(推荐) ：服务消费：负载均衡 自带断路器 具备可插拔的注解支持，包括Feign注解和JAX-RS注解。Feign也支持可插拔的编码器和解码器。
        Spring Cloud为Feign增加了对Spring MVC注解的支持，还整合了Ribbon和Eureka来提供均衡负载的HTTP客户端实现
services：服务提供
zuul：网关：过滤器有问题 拦截了 返回了错误码值 但是还是调用了服务
config server:配置提供 集成了 总线
config client：配置使用 集成了 总线

