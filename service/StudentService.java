package less4.service;

import less4.model.Student;

public class StudentService {

    public Student createStudent(int id, String name, String last) {
        return new Student(id, name, last);
    }

}
