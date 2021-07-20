package com.jinw0909.spring.lesson01;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@RequestMapping("/lesson01/test01")
@Controller
public class Test01Controller {
	
	@RequestMapping("/1")
	@ResponseBody
	public String printString() {
		
		return "해당 프로젝트를 통해서 문제풀이를 진행합니다.";
	}
}
