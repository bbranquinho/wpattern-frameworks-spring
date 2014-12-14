package br.com.wpattern.frameworks.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import br.com.wpattern.frameworks.spring.interfaces.IApplication;

public class Main {

	private static final String APPLICATION_CONTEXT = "ctx-wpattern-frameworks-spring.xml";

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(APPLICATION_CONTEXT);

		IApplication application = context.getBean(IApplication.class);

		application.start();
	}

}
