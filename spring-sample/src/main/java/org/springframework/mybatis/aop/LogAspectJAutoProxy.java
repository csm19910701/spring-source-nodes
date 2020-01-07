package org.springframework.mybatis.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LogAspectJAutoProxy {

	@Pointcut("@annotation(org.springframework.transaction.annotation.Transactional)")
	public void pointCut(){

	}

	/**
	 * around 前后增强
	 * @param joinPoint
	 */
	@Around(value = "pointCut()",argNames = "joinPoint")
	public Object around(ProceedingJoinPoint joinPoint) throws Throwable {
		System.out.println(joinPoint.getSignature().getName() +" 执行开始... ");
		Object object = joinPoint.proceed(joinPoint.getArgs());
		System.out.println(joinPoint.getSignature().getName() +" 执行结束... ");
		return object;
	}

}
