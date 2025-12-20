package com.project.designpatterns.proxydinamico;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class LoggerProxy implements InvocationHandler {
	
	private Object original;
	
	public static Object criarProxy(Object objOriginal) {
		return Proxy.newProxyInstance(
				objOriginal.getClass().getClassLoader(), 
				objOriginal.getClass().getInterfaces(), 
				new LoggerProxy(objOriginal));
	}
	
	private LoggerProxy(Object objOriginal) {
		this.original = objOriginal;
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
	
		if(args != null) {
			System.out.println("Proxy em acao no metodo: " + method.getName() + " " + args[0]);
			
		} else {
			System.out.println("Proxy em acao no metodo: " + method.getName());
		}			
		return method.invoke(original, args);
	}
	
	
}
