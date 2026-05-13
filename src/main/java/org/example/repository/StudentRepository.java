package org.example.repository;

import org.example.model.Student;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class StudentRepository {

    public List<Student> findAll() {
        // Giả sử chúng ta có một danh sách sinh viên tĩnh
        return List.of(
                new Student("John Doe", 20, "C0925L1"),
                new Student("Jane Smith", 22, "C0925L1")
        );
    }
}
