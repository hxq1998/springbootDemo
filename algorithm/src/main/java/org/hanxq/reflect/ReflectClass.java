/**
 * 反射使用
 */
package org.hanxq.reflect;

import java.lang.reflect.Field;

import org.hanxq.pojo.User;
import org.hanxq.reflect.annotation.Obj;

public class ReflectClass {

	public static <T> void reflectMethod(Class<T> t) {
		Class<T> t2 = t;

	}

	public static <T> void reflectField(Class<T> t) {
		Class<T> t2 = t;
		Field[] declaredFields = t2.getDeclaredFields();
		// 循环属性
		for (Field f : declaredFields) {
			// Obj类型
			if(f.isAnnotationPresent(Obj.class)){
				Obj annotation = f.getAnnotation(Obj.class);
				long length = annotation.length();
				System.out.println(length);
			}
		}

	}
	
	public static void main(String[] args) {
		User u = new User();
		u.setId(55);
		u.setName("/*/*/*");
		ReflectClass.reflectField(u.getClass());
	}

}
