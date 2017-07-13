package com.lyccccc.web;

import com.lyccccc.model.Spittle;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Created by Lenovo on 2017/07/10.
 */
@Controller
@RequestMapping(value = "/home")
public class HomeController {
    @RequestMapping(method = RequestMethod.GET)
    public String home(){
        return "home";
    }

    @RequestMapping(value = "show",method = RequestMethod.GET)
    public String show(Model model){
        List<Spittle> list = new ArrayList<Spittle>();
        list.add(new Spittle("1111111111111",new Date(),0.1,0.2));
        list.add(new Spittle("2222222222222",new Date(),0.1,0.2));
        list.add(new Spittle("33333333333333",new Date(),0.1,0.2));
        model.addAttribute("list",list);
        return "data";
    }

    @RequestMapping(value = "input/{name}",method = RequestMethod.GET)
    public String input(@PathVariable String name,Model model){
        System.out.println(name);
        model.addAttribute("userName",name);
        return "data";
    }
}
