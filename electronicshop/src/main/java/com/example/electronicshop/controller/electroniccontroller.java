package com.example.electronicshop.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import com.example.electronicshop.domain.electronic;
import com.example.electronicshop.service.electronicservice;

@RestController
public class electroniccontroller {
	 @Autowired
	    private electronicservice service;

	    @GetMapping("/")
	    public String viewHomePage(Model model) {
	        List<electronic> listelectronic = service.listAll();
	        model.addAttribute("listelectronic", listelectronic);
	        System.out.print("Get / ");	
	        return "index";
	    }

	    @GetMapping("/new")
	    public String add(Model model) {
	        model.addAttribute("electronic", new electronic());
	        return "new";
	    }

	    @RequestMapping(value = "/save", method = RequestMethod.POST)
	    public String saveelectronic(@ModelAttribute("electronic") electronic std) {
	        service.save(std);
	        return "redirect:/";
	    }

	    @RequestMapping("/edit/{id}")
	    public ModelAndView showEditelectronicPage(@PathVariable(name = "id") int id) {
	        ModelAndView mav = new ModelAndView("new");
	        electronic std = service.get(id);
	        mav.addObject("electronic", std);
	        return mav;
	        
	    }
	    @RequestMapping("/delete/{id}")
	    public String deleteelectronic(@PathVariable(name = "id") int id) {
	        service.delete(id);
	        return "redirect:/";
	    }
	

}
