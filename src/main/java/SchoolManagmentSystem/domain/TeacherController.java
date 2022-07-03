package SchoolManagmentSystem.domain;

import SchoolManagmentSystem.repository.TeacherRepository;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
@AllArgsConstructor
public class TeacherController {

    private final TeacherRepository teacherRepository;

    @GetMapping
    public List<Teacher> findAll() {
        return teacherRepository.findAll();
    }

}
