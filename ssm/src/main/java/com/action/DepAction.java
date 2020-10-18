package com.action;

import com.alibaba.fastjson.JSON;
import com.service.DepService;
import com.sun.deploy.net.HttpResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.List;

/**
 * 创建控制器
 */
@Controller
@RequestMapping("/dep.do")
public class DepAction {

    @Autowired
    private  DepService service;

    @RequestMapping( params = "findAll")
    public String findAll(HttpServletRequest request){
        List list=service.findAll();

        request.setAttribute("list",list);
        return "show.jsp";
    }
    @RequestMapping(params = "delById")
    public String deleteDep(HttpServletRequest request){
        int did= Integer.parseInt(request.getParameter("depid"));
        service.deleteDep(did);
        return "redirect:dep.do?findAll";
    }
    @ResponseBody
    @RequestMapping(params = "findbyaj",produces="application/json;charset=utf-8")
    public String findByAjax(HttpServletRequest request, HttpServletResponse response){

        List list=service.findAll();
        
        String json= JSON.toJSONString(list);
        System.out.println(json);
        return json;

    }
}
