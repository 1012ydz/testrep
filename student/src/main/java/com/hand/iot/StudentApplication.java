package com.hand.iot;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@MapperScan("com.hand.iot.mapper")
@EnableDiscoveryClient
public class StudentApplication {

	public static void main(String[] args) {

		SpringApplication.run(StudentApplication.class, args);


		/*new Thread(()-> System.out.println("你好啊！")).start();
		List<String> list=new ArrayList<>();
		list.add("1");
		list.add("3");
		list.add("4");
		list.add("5");
		Collections.sort(list,(o1,o2)->{
			if(o1.equals(o2)){
				return 1;
			}
			return 1;
		});*/

	}

}
