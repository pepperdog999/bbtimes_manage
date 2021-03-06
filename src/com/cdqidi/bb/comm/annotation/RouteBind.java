package com.cdqidi.bb.comm.annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
/**
 * @类名字：RouteBind
 * @类描述：路由绑定接口
 * @author:Carl.Wu
 * @版本信息：
 * @日期：2013-9-11
 * @Copyright 足下 Corporation 2013 
 * @版权所有
 *
 */
@Inherited //注解继承。 (我们自定义注解(Annotation)时，把自定义的注解标注在父类上不会被子类所继承，但是我们可以在定义注解时给我们自定义的注解标注一个@Inherited注解来实现注解继承。)
@Retention(RetentionPolicy.RUNTIME)
@Target({ElementType.TYPE})
public @interface RouteBind {
	//对应的路径名 已/开头
	String path() default "/";
	
	//视图所在目录
	String viewPath() default "";

}
