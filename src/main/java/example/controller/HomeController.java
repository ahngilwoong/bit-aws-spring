package example.controller;
import example.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
    private final StudentService studentService;

    @Autowired
    public HomeController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping("/")
    public String index() {
        System.out.println("index 호출");
        studentService.loginChecked();
        return "index";
    }

}

