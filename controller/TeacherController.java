package less4.controller;

import less4.model.Teacher;
import less4.model.User;
import less4.service.TeacherService;

public class TeacherController implements UserController {
    public TeacherService teacherService = new TeacherService();


    public Teacher creatTeacher(int id, String name, String lastName) {
        return teacherService.createTeacher(id, name, lastName);
    }

    @Override
    public <T extends User> User create(T user) {
        return user;
    }
}
