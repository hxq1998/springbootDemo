package org.hanxq.contorller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ThisWillActuallyRun {
	
	/**
	 * ${system.name}对应配置文件中的内容
	 */
	@Value("${system.name}")
	private String name;
	
	/**
	 * 1024~65535 并不是每次都随机数，是服务器启动了就会随机数
	 */
	@Value("${my.number.in.range}")
	private Integer num;

	@RequestMapping("/good")
    String home() {
        return name + num.toString();
    }
}
