#spring-cloud-eureka


1、建立eureka服务工程
	
	步骤：
	
		step1：添加依赖包
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-starter-eureka-server</artifactId>
			</dependency>
			
		step2：服务启动添加注解@EnableEurekaServer
		
		step3:服务配置
		
			#服务端口
			server.port=8761
			#对外提供的注册地址
			eureka.client.serviceUrl.defaultZone=http://localhost:${server.port}/eureka/
			#是否可向eureka注册服务。该应用为服务注册中心，不需要自注册，设为false
			eureka.client.registerWithEureka=false
			#是否检索服务。职责为注册和发现服务，无需检索服务
			eureka.client.fetchRegistry=false

			#关闭保护机制，以确保注册中心可以将不可用的实例剔除.(注意：自我保护模式是一种应对网络异常的安全保护措施,使用自我保护模式，可以让Eureka集群更加的健壮、稳定)
			eureka.server.enableSelfPreservation=false
			#eureka server清理无效节点的时间间隔，默认60000毫秒，即60秒
			eureka.server.evictionIntervalTimerInMs: 30000
		
		step4：访问localhost:port

2、服务注册

	step1：新建服务节点（简单的spring-boot工程）  server-node-a
	
	step2:  添加依赖:
		   <dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-starter-eureka</artifactId>
				<version>1.2.3.RELEASE</version>
			</dependency>
	step3：服务启动时，添加注解：@EnableDiscoveryClient或@EnableDiscoveryClient
	
	step4：配置：
	
			#注册到eureka
			#eureka服务端口
			eureka.server.port=8761
			#eureka注册地址
			eureka.client.serviceUrl.defaultZone=http://localhost:${eureka.server.port}/eureka/

			#服务实例配置
			#server-node-a服务端口
			server.port=8081
			#服务名称
			spring.application.name=server-node-a
			eureka.instance.prefer-ip-address=true
			eureka.instance.instanceId=true
	
			
			
			