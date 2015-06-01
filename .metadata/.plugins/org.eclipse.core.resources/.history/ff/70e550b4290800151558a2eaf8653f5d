package com.msm.controller;

import javax.annotation.Resource;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.msm.model.User;
import com.msm.service.IUserService;

/**
 * 用户管理控制模块
 */
@Controller
@RequestMapping("/user")
public class UserController {

    private IUserService userService;

    public IUserService getUserService() {
        return userService;
    }

    @Resource
    public void setUserService(IUserService userService) {
        this.userService = userService;
    }

    /**
     *  用户添加
     */
    @RequestMapping(value = "/add", method = RequestMethod.GET)
    public String add(Model model) {
        model.addAttribute(new User());
        return "user/add";
    }

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public String add(@Validated User user, BindingResult br) {
        if (br.hasErrors()) {
            return "user/add";
        }
        System.out.println(user);
        userService.add(user);
            return "redirect:/user/users";
    }

    /**
     *  用户列表显示
     */
    @RequestMapping(value="/users", method=RequestMethod.GET)
    public String list(Model model) {
        model.addAttribute("pagers", userService.find());
        return "user/list";
    }

    /**
     *  用户删除
     */
    @RequestMapping(value="/delete", method=RequestMethod.GET)
    public String delete(Model model) {
        model.addAttribute("pagers", userService.find());
        return "user/delete";
    }

    @RequestMapping(value="/{staffId}/delete", method=RequestMethod.GET)
    public String delete(@PathVariable String staffId) {
        User u = userService.loadByUserStaffId(staffId);
        userService.delete(u.getUserId());
        return "redirect:/user/users";
    }

    /**
     *  用户修改
     */
    @RequestMapping(value="/update", method=RequestMethod.GET)
    public String update(Model model) {
        model.addAttribute("pagers", userService.find());
        return "user/updateInfo";
    }

    @RequestMapping(value="/{staffId}/update", method=RequestMethod.GET)
    public String update(@PathVariable String staffId, Model model) {
        System.out.println(staffId);
        model.addAttribute(userService.loadByUserStaffId(staffId));
        return "user/update";
    }

    @RequestMapping(value="/{staffId}/update", method=RequestMethod.POST)
    public String update(@PathVariable String staffId, @Validated User user, BindingResult br, Model model) {
        if (br.hasErrors()) {
            model.addAttribute(user); // 或省略此句，默认情况就存在了Model中
            return "user/update";
        }

        User u = userService.loadByUserStaffId(staffId);
        u.setPassword(user.getPassword());
        u.setStaffId(user.getStaffId());
        u.setUserDepart(user.getUserDepart());
        u.setUserPosition(user.getUserPosition());
        u.setTelephone(user.getTelephone());
        userService.update(u);
        return "redirect:/user/users";
    }

    /**
     *  用户个人信息查询
     */
    @RequestMapping(value="/show", method=RequestMethod.GET)
    public String show(Model model) {
        model.addAttribute(new User());
        return "user/showInfo";
    }

    @RequestMapping(value="/show", method=RequestMethod.POST)
    public String show(@Validated String staffId, Model model) {
        User user = userService.loadByUserStaffId(staffId);
        if (null == user) {
            System.out.println("查询验证!!!");
            model.addAttribute(new User());
            return "user/showInfo";
        }
        System.out.println("工号：" + staffId);
        System.out.println("ID:" + user.getUserId());
        model.addAttribute(userService.load(user.getUserId()));
        return "user/show";
    }
}
