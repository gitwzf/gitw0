package com.glj.view;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.glj.model.Pojo;

/** 
 * @ClassName: GeneralController 
 * @Description: TODO(这里用一句话描述这个类的作用) 
 * @author gulijiang
 * @date 2012-6-6 上午10:47:42 
 *  
 */
@Controller
public class GeneralController {
	
	@RequestMapping(value="index")  
	 public void index_jsp(Model model){  
	      //  model.addAttribute("liming", "黎明你好");
	        System.out.println("index1.jsp");  
	        
	    }
	
	@RequestMapping(value="demo.do")
	public void model_jsp(Model model){
		model.addAttribute("gul", "helloworld");
	}
	
	@RequestMapping(value="hao.do")
	public void hao_jsp(@ModelAttribute("pojo") Pojo pojo,HttpServletResponse response) throws IOException{
		//model.addAttribute("gul", "helloworld");
//		String a = request.getParameter("a");
//		String b = request.getParameter("b");
		System.out.println(pojo.getA()+" "+pojo.getB());
		response.sendRedirect("success.jsp");
	}
}
