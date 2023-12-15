package User.Controler;

import User.Model.Student;
import User.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/student")
public class StudentControler {
    @Autowired
    StudentService studentService;

    @PostMapping("/save")

    public String addStudent(@RequestBody Student student) {
        studentService.addStudent(student);
        return "Student added sucessfully";
    }
}
