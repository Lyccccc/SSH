package com.lyccccc.web;

import com.lyccccc.model.Spittle;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.io.File;
import java.io.IOException;
import java.util.Date;

/**
 * Created by Liuyuchen on 2017/07/12.
 */
@Controller
@RequestMapping("/file")
public class FileController {
    @RequestMapping(value = "/accept",method = RequestMethod.POST)
    public String acceptFile(@RequestParam("userName") String userName , @RequestPart("file1") MultipartFile file,RedirectAttributes model){
        System.out.println("begin...");
        System.out.println(userName);
        System.out.println(file);
        System.out.println(file.getName());
        try {
            file.transferTo(new File("F:\\tmp\\uploads\\test.jpg"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        model.addAttribute("userName",userName);
        model.addFlashAttribute("spittle",new Spittle("111111",new Date(),0.0,0.0));
        return "redirect:/home/input/{userName}";
    }
}
