package com.letunnel.controllers;

import com.letunnel.services.CommonProceduresService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/commonprocedures")
public class CommonProceduresController {

    private final CommonProceduresService commonProceduresService;

    public CommonProceduresController(CommonProceduresService commonProceduresService) {
        this.commonProceduresService = commonProceduresService;
    }

    @RequestMapping({"", "/", "/index", "/index.html"})
    public String listCommonProcedures(Model model){

        model.addAttribute("commonprocedures", commonProceduresService.findAll());

        return "commonprocedures/index";

    }

}
