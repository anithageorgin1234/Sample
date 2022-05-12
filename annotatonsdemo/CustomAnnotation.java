package com.greatlearning.annotatonsdemo;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.lang.reflect.Method;

@Retention(RetentionPolicy.RUNTIME)
@Target(ElementType.METHOD)
@interface MyAnnotation
{
	int value();
}

class Hello
{
	@MyAnnotation(value=30)
	public void saHello()
	{
		System.out.println("Hello");
	}
}

public class CustomAnnotation {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException {
		Hello h=new Hello();
		Method m=h.getClass().getMethod("saHello");
		MyAnnotation mm=m.getAnnotation(MyAnnotation.class);
		System.out.println(mm.value());

	}

}
