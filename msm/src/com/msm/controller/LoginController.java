package com.msm.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.SessionAttributes;
import org.springframework.web.servlet.ModelAndView;

import com.msm.constants.UserPosition;
import com.msm.model.User;
import com.msm.service.IUserService;

@Controller
@SessionAttributes("loginUser")
public class LoginController {

    @Autowired
    private IUserService userService;

    /**
     * 登录模块
     */
    @RequestMapping(value="/login", method=RequestMethod.GET)
    public String login() {
        return "login";
    }

    @RequestMapping(value="/login", method=RequestMethod.POST)
    public String login(String username, String password, Model model, HttpServletRequest req, HttpServletResponse res) {
        User user = userService.loadByUsername(username);
        if (null == user){ // 用户名和密码判断
        	System.out.println("user==null");
            return "login";
        }

        User u = userService.login(username, password);
        model.addAttribute("loginUser", u);
        String userPos = u.getUserPosition();
        if (UserPosition.ADMIN_MANAGE.desc().equals(userPos)) {
        	System.out.println("admin login in");
            return "user/admin";       // 管理员
        } else if (UserPosition.PRODUCT_CHECK_REG.desc().equals(userPos)) {
            return "sample/regi_main"; // 检品注册
        } else if (UserPosition.LOGISTICS_PERSONNEL.desc().equals(userPos)) {
        	return "reference/ref_main"; // 后勤保障
        } else if (UserPosition.PRODUCT_INSPECT.desc().equals(userPos)) {
        	return "checker/check_main"; // 检验人员
        } else if (UserPosition.FINAL_CHECK.desc().equals(userPos)) {
        	return "final/final_main";   // 最终检验
        } else if (UserPosition.JIAODUI_MANAGE.desc().equals(userPos)) {
        	return "jiaodui/jiaodui_main";   // 校对管理
        } else if (UserPosition.SIGNER_MANAGE.desc().equals(userPos)) {
        	return "shenqian/shenqian_main"; // 审签管理
        } else if (UserPosition.YEWU_MANAGE.desc().equals(userPos)) {
        	return "yewu/yewu_main";       // 业务管理
        } else if (UserPosition.QUALITY_MANAGE.desc().equals(userPos)) {
        	return "zhibaoke/zhibaoke_main"; // 质保科
        } else if (UserPosition.KESHI_ZHUREN.desc().equals(userPos)) {
        	return "zhuren/zhuren_main";     // 科室主任
        } else {
             return null;
        }

    }

    /**
     * 注销
     */
    /*
    @RequestMapping("/logout")
    public String logout(Model model, HttpSession session) {
        model.asMap().remove("loginUser"); // 从session中移除退出用户
        session.invalidate();
        return "login";
    }
    */
    @RequestMapping(value = "/logout")
    public ModelAndView logout(Model model,HttpServletRequest request, HttpServletResponse response, HttpSession session) {
//        HttpSession session = request.getSession(false);// 防止创建Session
//        if (session == null) {
//            ModelAndView mv = new ModelAndView("login");
//            return mv;
//        }
//        model.asMap().remove("loginUser");
//        session.removeAttribute("loginUser");
        ModelAndView mv = new ModelAndView("login");
//        mv.addObject("loginUser");
        return mv;
    }

}
