package com.action;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.core.metadata.IPage;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.domain.Dep;
import com.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.HashMap;
import java.util.Map;

@Controller
@RequestMapping("/dep.do")
public class DepAction {
    @Autowired
    private DepService service;


    @RequestMapping(params = "fenye")
    public String fenye(HttpServletRequest request, HttpServletResponse response){
        IPage<Dep> iPage=new Page<Dep>(1,2);
        QueryWrapper queryWrapper=new QueryWrapper();
        IPage page=service.fenye(iPage,queryWrapper);
        request.setAttribute("page",page);
        return "show.jsp";
    }

    @RequestMapping(params = "fenye2")
    public String fenye2(HttpServletRequest request, HttpServletResponse response){
        IPage<Map> iPage=new Page<Map>(1,1);
        QueryWrapper queryWrapper=new QueryWrapper();
        Map map=new HashMap();
        map.put("depid",1);
        IPage<Map> page=service.fenye2(iPage,map);
        request.setAttribute("page",page);
        return "show.jsp";
    }


}
