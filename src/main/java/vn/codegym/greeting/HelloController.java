package vn.codegym.greeting;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {

    @RequestMapping("/hello")
    public ModelAndView hello(@RequestParam("name") String name) {
        ModelAndView modelAndView = new ModelAndView("hello");
        modelAndView.addObject("name", name);
        return modelAndView;
    }
}
