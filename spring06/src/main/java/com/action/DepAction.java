package com.action;

import com.domain.Dep;
import com.service.DepService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.UnsupportedEncodingException;
import java.util.List;

@Controller
@RequestMapping("/dep.do")
public class DepAction {

    @Autowired
    private DepService service;

    @Autowired
    private HttpServletRequest request;


    private HttpServletResponse response;

    @RequestMapping(params = "findAll")
    public String  findAll() throws UnsupportedEncodingException {

        request.setCharacterEncoding("utf-8");

        List<Dep> deps = service.findAll();
        request.setAttribute("list",deps);




        return "show.jsp";
    }
}
