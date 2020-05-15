package org.lx.jiaocheng427.user.controller;

import org.lx.jiaocheng427.user.entity.UserEntity;
import org.lx.jiaocheng427.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

/**
 * @author linxin
 * @data 2020/4/2719:27
 */
@Controller //@ResponseBody + @Controller
@RequestMapping("user") //浏览器上访问的路径
public class UserController {
    /*@RequestMapping("/test")
    public String test(){
        return "基础构建成功";
    }*/

    @Autowired
    UserService userService;
    //接收到map，把map给Services，调用Service的getAll()方法
    @ResponseBody
    @RequestMapping("/getAll")
    public List<UserEntity> getAll(Map map){
        return userService.getAll(map);
    }
    @RequestMapping("/delById")
    public String delById(Integer id){
        userService.delById(id);
        return "redirect:/index.html";
    }

    //保存用户接口

   /* public String save(String userName,String password){

        return null;
    }*/
    @RequestMapping("/save")
    @ResponseBody
    public String save(@RequestBody UserEntity userEntity) {

       System.out.println("用户注册："+ userEntity.toString());
       userService.save(userEntity);
       return "success";
    }

}
