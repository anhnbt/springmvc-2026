package org.example.controller;

import org.example.model.Student;
import org.example.repository.StudentRepository;
import org.example.service.StudentService;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.ArrayList;

@Controller
@RequestMapping("/students")
public class StudentController {
    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

//    @RequestMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
//    @ResponseBody
//    public ArrayList<Student> getList() {
//        ArrayList<Student> students = new ArrayList<>();
//        students.add(new Student("John Doe", "C0925L1"));
//        students.add(new Student("Jane Smith", "C0925L1"));
////        model.addAttribute("students", students);
////        return "students/list";
//        return students;
//    }


    @GetMapping
    public String search(@RequestParam(value = "name", required = false) String name, @RequestParam(value = "age", required = false) Integer age, Model model) {
        model.addAttribute("students", studentService.findAll());
        System.out.println("Search student name: " + name + ", age: " + age);
        return "students/list";
    }

    @GetMapping("/{centerId}/classes/{classId}")
    public String getListStudentFromCenterAndClasses(@PathVariable("centerId") Long centerId, @PathVariable("classId") Long classId, Model model) {
        ArrayList<Student> students = new ArrayList<>();
        students.add(new Student("John Doe", "C0925L1"));
        students.add(new Student("Jane Smith", "C0925L1"));
        model.addAttribute("students", students);
        System.out.println("Center ID: " + centerId + ", Class ID: " + classId);
        return "students/list";
    }

    @GetMapping("/create")
    public String create() {
        return "students/create";
    }

    @GetMapping("/students/{id}/edit")
    public String edit(@PathVariable("id") Long id) {
        System.out.println("Ban dang chinh sua sinh vien co id: " + id);
        return "students/create";
    }

    @PostMapping(value = "/create", consumes = MediaType.MULTIPART_FORM_DATA_VALUE)
    public String createStudent(@ModelAttribute Student student, RedirectAttributes redirectAttributes) {
        System.out.println("Creating student: " + student.getName() + " - Age: " + student.getAge() + " - Classes: " + student.getClasses());
        System.out.println(student.getAvatar().getOriginalFilename());
        redirectAttributes.addFlashAttribute("message", "Student created successfully!");
        return "redirect:/students";
    }

}
