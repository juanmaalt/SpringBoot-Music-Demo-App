package com.google.DemoApp.controllers;

import com.google.DemoApp.services.SongService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class SongController {

    private SongService songService;

    @Autowired
    public SongController(SongService songService) {
        this.songService = songService;
    }

    @RequestMapping({"/",""})
    public String showText(Model model){
        model.addAttribute("song", songService.getSong());

        return "view";
    }
}
