
## 基于consul为注册中心
 1. 运行consul
    docker run --name consul1 -d -p 8500:8500 -p 8600:8600/udp  consul
 2. 引入spring-cloud-starter-consul-all -服务注册和发现功能 --consul的配置中心功能- --消息总线，提供配置实时刷新，不再依赖中间件--
    
