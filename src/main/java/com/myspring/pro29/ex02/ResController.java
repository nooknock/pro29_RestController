package com.myspring.pro29.ex02;

import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;


//��Ʈ�ѷ����� @RestController�� �̿��Ͽ� �޼��忡�� ��û url�� ��û�ϸ� JSP�� ���� �丮������ ������ �� �������� ��� ǥ��
// ������ �׳� @Controller�� �ϰ� Ư�� �޼��忡 @ResponseBody�� �����ϸ� JSP�� �ƴ� �ؽ�Ʈ�� JSON���� ����� ������ �� �ִ�. !!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!
@Controller
public class ResController {

	@RequestMapping("/res1")
	@ResponseBody//Annotation that indicates a method return value should be bound to the web response body. Supported for annotated handler methods in Servlet environments. 
	public Map<String, Object> res1(){
		Map<String, Object> map=new HashMap<String, Object>();
		map.put("id", "hong");
		map.put("name", "ȫ�浿");
		return map;
	}
	
	@RequestMapping("/res2")
	public ModelAndView res2() {
		ModelAndView mav=new ModelAndView("home");
		return mav;
	}
}