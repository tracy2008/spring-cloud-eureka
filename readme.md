#spring-cloud-eureka


1������eureka���񹤳�
	
	���裺
	
		step1�����������
			<dependency>
				<groupId>org.springframework.cloud</groupId>
				<artifactId>spring-cloud-starter-eureka-server</artifactId>
			</dependency>
			
		step2�������������ע��@EnableEurekaServer
		
		step3:��������
		
			#����˿�
			server.port=8761
			#�����ṩ��ע���ַ
			eureka.client.serviceUrl.defaultZone=http://localhost:${server.port}/eureka/
			#�Ƿ����eurekaע����񡣸�Ӧ��Ϊ����ע�����ģ�����Ҫ��ע�ᣬ��Ϊfalse
			eureka.client.registerWithEureka=false
			#�Ƿ��������ְ��Ϊע��ͷ��ַ��������������
			eureka.client.fetchRegistry=false

			#�رձ������ƣ���ȷ��ע�����Ŀ��Խ������õ�ʵ���޳�.(ע�⣺���ұ���ģʽ��һ��Ӧ�������쳣�İ�ȫ������ʩ,ʹ�����ұ���ģʽ��������Eureka��Ⱥ���ӵĽ�׳���ȶ�)
			eureka.server.enableSelfPreservation=false
			#eureka server������Ч�ڵ��ʱ������Ĭ��60000���룬��60��
			eureka.server.evictionIntervalTimerInMs: 30000
