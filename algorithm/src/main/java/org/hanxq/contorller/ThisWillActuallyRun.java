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

	@RequestMapping("/good")
    String home() {
        return name;
    }
}
