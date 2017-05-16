package com.llhc.video.aop;

import java.util.Date;

import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

/**
 * 日志记录的AOP类
 * 1. 定义一个类 LogAOP, 写Spring AOP的注解
 * 2. 定义方法
 * 3. 在方法上写入Spring AOP注解
 * 
 * 关联的jar包
 * 1. spring-aop.jar
 * 2. aspectj.jar
 * 3. aopalliance.jar
 * 4. spring-aspect.jar
 * 
 * AOP类中方法其实就是共有代码，方法有一个执行顺序（建议分类）
 * 1. 前置建议
 * 2. 后置建议
 * 3. 环绕建议
 * @author caleb
 *
 */

@Component
@Aspect
public class LogAOP {
	
	@Before("execution(* com.gxa.spring.service.*.*(..))")
	public void logBefore() {
		System.out.println("===="+new Date()+"===");
	}
	
	/**
	 * 保证方法正常执行成功后再执行切面方法
	 */
	@AfterReturning("execution(* com.gxa.spring.service.*.*(..))")
	public void logAfterReturing() {
		System.out.println("===Hello World===");
	}
	
	/**
	 * 当方法报错则执行切面方法
	 */
	@AfterThrowing("execution(* com.gxa.spring.service.*.*(..))")
	public void logAfterThrowing() {
		System.out.println("====exception====");
	}
}
