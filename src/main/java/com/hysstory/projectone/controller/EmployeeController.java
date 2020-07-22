package com.hysstory.projectone.controller;

import com.hysstory.projectone.entity.Employee;
import com.hysstory.projectone.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import javax.annotation.PostConstruct;
import java.util.List;

@Controller
@RequestMapping("/employees")
public class EmployeeController {
    private EmployeeService employeeService;

    @Autowired
    public EmployeeController(EmployeeService employeeService) {
        this.employeeService = employeeService;
    }

    @GetMapping("/list")
    public String listEmployees(Model model) {
        List<Employee> employees = employeeService.findAll();
        model.addAttribute("employees", employees);

        return "employees/listEmployees";
    }

    @GetMapping("/addForm")
    public String showAddForm(Model model) {

        model.addAttribute("employee", new Employee());

        return "employees/addForm";
    }

    @PostMapping("/save")
    public String saveEmployee(@ModelAttribute("employee") Employee employee) {
        employeeService.save(employee);
        return "redirect:/employees/list";
    }

    @GetMapping("/updateForm")
    public String updateEmployee(@RequestParam("id") int id, Model model) {

        model.addAttribute("employee", employeeService.findById(id));

        return "employees/addForm";
    }

    @GetMapping("/delete")
    public String deleteEmployee(@RequestParam("id") int id) {
        employeeService.deleteById(id);
        return "redirect:/employees/list";
    }
}
