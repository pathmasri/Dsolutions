/**
 * @autor pathmasri
 * Aug 8, 2014 3:15:47 PM
 */
package com.dsolutions.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.dsolutions.model.Job;
import com.dsolutions.service.JobService;

@Controller  
public class JobController {
	
	@Autowired
	JobService jobService;
	
	 @RequestMapping("/submitjob") 
    public ModelAndView showMessage() {  
        System.out.println("from controller");  
        return new ModelAndView("hello", "message", "test");  
       
    } 
	
	@RequestMapping("form")
	 public ModelAndView getForm(@ModelAttribute Job Job) {
	  return new ModelAndView("form");
	 }

	 @RequestMapping("register")
	 public ModelAndView registerUser(@ModelAttribute Job Job) {
	  jobService.insertRow(Job);
	  return new ModelAndView("redirect:list");
	 }

	 @RequestMapping("list")
	 public ModelAndView getList() {
	  List JobList = jobService.getList();
	  return new ModelAndView("list", "JobList", JobList);
	 }

	 @RequestMapping("delete")
	 public ModelAndView deleteUser(@RequestParam int id) {
	  jobService.deleteRow(id);
	  return new ModelAndView("redirect:list");
	 }

	 @RequestMapping("edit")
	 public ModelAndView editUser(@RequestParam int id,
	   @ModelAttribute Job Job) {
	  Job JobObject = jobService.getRowById(id);
	  return new ModelAndView("edit", "JobObject", JobObject);
	 }

	 @RequestMapping("update")
	 public ModelAndView updateUser(@ModelAttribute Job Job) {
	  jobService.updateRow(Job);
	  return new ModelAndView("redirect:list");
	 }

}
