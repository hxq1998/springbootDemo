package org.hanxq.base;

import java.util.HashMap;

import org.hanxq.Application;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)  
@SpringBootTest(classes = Application.class)
@WebAppConfiguration
public class BaseTest {
	
	@Test
	public void test() {
		System.out.println("test!");
	}
	
	@Test
	public void hasMapCont(){
		HashMap<String, String> hashMap = new HashMap<String,String>();
		
		hashMap.put("a", "abc");
		
		hashMap.put("b", "bcd");
		
		
		hashMap.put("a", "sfsfsf");
		
		char key = 'a';
		
		for (int i = 0;i < 26; i++){
			hashMap.put(String.valueOf(key + i), "value");
		}
		
	}
	
	@Test
	public void hasHCodeValue(){
		String b = "abcd";
		System.out.println(b.hashCode());
		System.out.println("abcde".hashCode());
	}

}
