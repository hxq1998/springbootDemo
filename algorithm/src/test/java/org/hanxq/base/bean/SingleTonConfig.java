package org.hanxq.base.bean;

import org.hanxq.base.bean.singleton.IBook;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class SingleTonConfig {

	@Bean
	@Scope(value = BeanDefinition.SCOPE_SINGLETON)
	public IBook book(){
		return new IBookImpl();
	}
	
}
