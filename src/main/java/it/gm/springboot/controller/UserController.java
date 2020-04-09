package it.gm.springboot.controller;

import it.gm.springboot.pojo.User;
import it.gm.springboot.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;

    @RequestMapping("/page")
    public ModelAndView page(){
        return new ModelAndView("redirect:index");
    }

    @RequestMapping("/addUser")
    public String addUser(User user){
        int i = this.userService.addUser(user);
        if (i > 0){
            System.out.println("增加成功");
        }else {
            System.out.println("增加失败");
        }
        return "index";
    }












}
