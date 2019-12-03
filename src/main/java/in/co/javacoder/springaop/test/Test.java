package in.co.javacoder.springaop.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import in.co.javacoder.springaop.ProductService;

public class Test {

	public static void main(String[] args) {

		ApplicationContext context = new ClassPathXmlApplicationContext("in/co/javacoder/springaop/test/config.xml");
		ProductService productService = context.getBean("productService", ProductService.class);
		System.out.println(productService.multiply(4, 8));
	}

}
