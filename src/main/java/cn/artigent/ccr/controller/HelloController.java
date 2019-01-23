package cn.artigent.ccr.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.text.DateFormat;
import java.util.Date;
import java.util.List;
import java.util.Map;

/**
 * @Description:视图跳转控制器
 * @author: ZengKai
 * @Date: 2019/1/21
 */
@Controller
public class HelloController {

    @Value("${name}")
    private String name;
    @RequestMapping("/hello")
    public String hello(@RequestParam(name="list") List<Map<String,Object>> msglist, HttpServletRequest request) {
        request.getSession().setAttribute("now", DateFormat.getDateTimeInstance().format(new Date()));
        return "ATY_SQ_";
    }
}