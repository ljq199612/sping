package com.xxx.config;

import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.SpringApplicationRunListener;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;

/**
 * 自定义 SpringApplicationRunListener,
 * 注意 ： spring.factories 需要配置
 * -------------------------------------------------------
 * 具体生效的代码位置为启动类SpringApplication.run 方法中
 * SpringApplicationRunListeners listeners = getRunListeners(args);
 */
public class MySpringApplicationListener implements SpringApplicationRunListener {

	private final SpringApplication springApplication;

	private final String[] args;

	// 必须
	public MySpringApplicationListener(SpringApplication springApplication, String[] args) {
		this.springApplication = springApplication;
		this.args = args;
	}

	/**
	 * Called immediately when the run method has first started. Can be used for very
	 * early initialization.
	 */
	@Override
	public void starting() {
		System.out.println("\n[LJQ] 服务器启动 -> starting()");
	}


	/**
	 * Called once the environment has been prepared, but before the
	 * {@link ApplicationContext} has been created.
	 *
	 * @param environment the environment
	 */
	@Override
	public void environmentPrepared(ConfigurableEnvironment environment) {
		System.out.println("\n[LJQ] 服务器启动 -> environmentPrepared()");
	}

	/**
	 * Called once the {@link ApplicationContext} has been created and prepared, but
	 * before sources have been loaded.
	 *
	 * @param context the application context
	 */
	@Override
	public void contextPrepared(ConfigurableApplicationContext context) {
		System.out.println("\n[LJQ] 服务器启动 -> contextPrepared()");

	}

	/**
	 * Called once the application context has been loaded but before it has been
	 * refreshed.
	 *
	 * @param context the application context
	 */
	@Override
	public void contextLoaded(ConfigurableApplicationContext context) {
		System.out.println("\n[LJQ] 服务器启动 -> contextLoaded()");

	}

	/**
	 * The context has been refreshed and the application has started but
	 * {@link CommandLineRunner CommandLineRunners} and {@link ApplicationRunner
	 * ApplicationRunners} have not been called.
	 *
	 * @param context the application context.
	 */
	@Override
	public void started(ConfigurableApplicationContext context) {
		System.out.println("\n[LJQ] 服务器启动 -> Started()");
	}

	/**
	 * Called immediately before the run method finishes, when the application context has
	 * been refreshed and all {@link CommandLineRunner CommandLineRunners} and
	 * {@link ApplicationRunner ApplicationRunners} have been called.
	 *
	 * @param context the application context.
	 */
	@Override
	public void running(ConfigurableApplicationContext context) {
		System.out.println("\n[LJQ] 服务器启动 -> running()");

	}

	/**
	 * Called when a failure occurs when running the application.
	 *
	 * @param context   the application context or {@code null} if a failure occurred before
	 *                  the context was created
	 * @param exception the failure
	 */
	public void failed(ConfigurableApplicationContext context, Throwable exception) {
		System.out.println("\n[LJQ] 服务器启动 -> failed()");
	}

}
