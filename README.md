# noodlerpc 

noodlerpc是一套分布式服务治理解决方案 <br><br>

DEMO: <br>

git clone https://github.com/fenglingguitar/noodlecommon.git <br>
checkout noodlecommon-2.0.0 <br>
mvn install -Dmaven.test.skip=true <br><br>

安装/启动本地MySQL，建立数据库：noodlerpc_console_dev，用户：noodlerpc，密码：noodlerpc <br><br>

git clone https://github.com/fenglingguitar/noodlerpc.git <br>
mvn package -P=dev -Dmaven.test.skip=true <br><br>

部署/运行 控制台 noodlerpc-console-web/target/noodlerpc.war <br><br>

访问http://localhost:8080/noodlerpc/ <br><br>

运行 org.fl.noodlerpc.demo.server.example.ServiceExporterDemoExampleNettyJson <br><br>

查看 控制台 -> 服务端，待状态上线后，运行 org.fl.noodlerpc.demo.client.example.ServiceProxyFactoryDemoExample <br><br>

压力测试为：<br>
org.fl.noodlerpc.demo.server.press.ServiceExporterDemoPressNettyJson <br>
org.fl.noodlerpc.demo.client.press.ServiceProxyFactoryDemoPress <br><br>

此版本支持功能：<br>
1、服务自动注册、动态发现、动态配置 <br>
2、netty、jetty、servlet服务方式 <br>
3、json、Hessian序列化方式 <br>
4、随机负载、权重负载、性能负载 <br>
5、服务分组、灰度发布 <br>
6、服务拓扑图展示与操控 <br>
7、服务自动降级和恢复 <br>
8、性能指标的透明监控与图表展示 <br>
9、轻量性、易扩展、易夸平台 <br>
