package com.innolux.springboot;

import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Arrays;

/**
 * @author wei.li
 */
@SpringBootApplication
public class SpringbootApplication implements CommandLineRunner ,ApplicationRunner{

	public static void main(String[] args) {
		//SpringApplication.run(SpringbootApplication.class, args);
		SpringApplication application = new SpringApplication(SpringbootApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);
	}


    /*CommandLineRunner和ApplicationRunner共同点和区别；
     *共同点：其一执行时机都是在容器启动完成的时候进行执行；其二这两个接口中都有一个run()方法；他们的执行时机为容器启动完成的时候；
     *不同点：ApplicationRunner中run方法的参数为ApplicationArguments，而CommandLineRunner接口中run方法的参数为String数组。
     * http://blog.csdn.net/gebitan505/article/details/55047819
     */
    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println("ApplicationRunner!");

    }
    @Override
    public void run(String... args) throws Exception {
        System.out.println("CommandLineRunner!");
    }
}
