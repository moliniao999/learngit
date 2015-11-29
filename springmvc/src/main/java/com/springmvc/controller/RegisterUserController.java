package com.springmvc.controller;
 

import java.io.File;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.multipart.MultipartFile;

import com.springmvc.model.vo.RegisterVo;



@Controller
@RequestMapping(value = "/register")
public class RegisterUserController {

	
	@RequestMapping(value = "/redirectRegisterPage", method = RequestMethod.GET)
	public String redirectRegisterPage(Model model ) {
			System.out.println("register .........");
			model.addAttribute("error","用户名或密码错误。");
			return "register";
	}

	@RequestMapping(value = "/registerCustomer", method = RequestMethod.POST)
	public String registerCustomer(RegisterVo vo ) {
		System.out.println("register .........");
		System.out.println(vo.getMobilePhone());
		return "register";
	}
	
	
    /*** 
     * 上传文件 用@RequestParam注解来指定表单上的file为MultipartFile 
     *  
     * @param file 
     * @return 
     */  
    @RequestMapping("/fileUpload")  
    public String fileUpload(Model model,RegisterVo vo,@RequestParam("file") MultipartFile file,HttpServletRequest request) {  
        //BeanUtils
    	// 判断文件是否为空  
        if (!file.isEmpty()) {  
            try {  
                // 文件保存路径  
                String filePath = request.getSession().getServletContext().getRealPath("/") + "upload/"  
                        + file.getOriginalFilename();  
                System.out.println(filePath);
                // 转存文件  
                file.transferTo(new File(filePath));  
            } catch (Exception e) {  
                e.printStackTrace();  
            }    
        } else{
        	model.addAttribute("error","文件不能为空");
        }
        // 重定向  
        return "register";
    } 
    
     
    @RequestMapping(value = "/ajax/getCity", method = RequestMethod.POST)
	@ResponseBody
    public String fileUpload(Model model,RegisterVo vo ,HttpServletRequest request) {  
	       
    	System.out.println("dssd");
      
        // 重定向  
        return "register";
    } 

}
