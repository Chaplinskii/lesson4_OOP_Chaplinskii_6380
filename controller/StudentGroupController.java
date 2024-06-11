package less4.controller;

import less4.model.Student;
import less4.service.StudentGroupService;

public class StudentGroupController {

    private StudentGroupService studentGroupService;

//    public StudentGroupController(StudentGroupService service) {
//        this.studentGroupService = ;
//    }

    public void addStudent(int id, Student student) {
        studentGroupService.addStudent(id, student);
    }

}
