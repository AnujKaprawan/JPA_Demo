package User.Service;

import User.Model.Student;
import User.Reepository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public void  addStudent(Student s){
        studentRepository.save(s);
    }
}
