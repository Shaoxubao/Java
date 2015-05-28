<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<link rel="stylesheet" href="css/authority/login_css.css" type="text/css" />
<title>智能药监管理系统</title>
<style type="text/css">
    h1 {font-family: Georgia;
        font-size:50px;
        font-style:oblique;}
</style>

</head>
<body>
    <h1 align="center" style="color:black"><br>智能药监管理系统</h1>
    <div id="login_area">
        <div id="login_box">
            <div id="login_form">
              <form method="post">
                  <div>
                                                             用户名:<input type="text" name="username" class="username" id="name" /><br/>
                  </div>
                  <div>
                                                            密&nbsp;&nbsp;&nbsp;&nbsp;码:<input type="password" name="password" class="pwd" id="pwd"/><br/>
                  </div>
                  <br>
                  <div id="pos_area">
                                                                  身&nbsp;&nbsp;&nbsp;&nbsp;份:
                      <select style="width: 210px">
                          <option>管理员</option>
                          <option>检品登记人员</option>
                          <option>检品检验人员</option>
                          <option>质保科管理人员</option>
                          <option>后勤保障人员</option>
                          <option>报告打印人员</option>
                      </select>
                  </div>
                  
                  <div id="btn_area">
                     <input type="submit" class="login_btn" id="login_sub"  value="登  录">
                     <input type="reset" class="login_btn" id="login_ret" value="重 置">
                  </div>        
              </form>
            </div>
        </div>
          <br><br>
           <div align="center" class="foot_last">
              <p class="ftnav">
                <a href="" target="_blank">关于我们</a>|
                   <a href="" target="_blank">联系我们</a>|
                  <a href="" target="_blank">资质许可</a>|
                  <a href="" target="_blank">在线客服</a>|
                  <a href="" target="_blank">在线招聘</a>|
                  <a href="" target="_blank">全部商品</a>|
                  <a href="" target="_blank">全部品牌</a>|
                  <a href="" target="_blank">热门关键词</a>|
                  <a href="" target="_blank">全部分类</a>|
                  <a href="" target="_blank">金象导航</a>
              </p>
              <p>版权所有：北京金象大药房医药连锁有限责任公司&nbsp;北京金象在线网络科技有限公司</p>
            <p>Copyright? 制药厂 2014-2015， All Rights Reserved</p>
          </div>
   </div>  
</body>
</html>