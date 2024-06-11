package less4.controller;

import less4.model.Teacher;
import less4.service.TeacherGroupService;

import java.util.List;

public class TeacherGroupController {
    private TeacherGroupService teacherGroupService;

    public TeacherGroupController(TeacherGroupService teacherGroupService) {
        this.teacherGroupService = teacherGroupService;
    }

    public void addTeacher(int iD, Teacher teacher) {
        teacherGroupService.addTeacher(iD, teacher);
    }

    public Teacher searchTeacher(String x) {
        return teacherGroupService.searchTeacher(x);
    }

    public List<Teacher> printAll() {
        return teacherGroupService.printAll();
    }

    public void changeTeacher(String name, String lastName) {
        teacherGroupService.changeTeacher(teacherGroupService.getIndex(), name, lastName);

    }

    public void deleteTeacher(int index) {
        teacherGroupService.deleteTeacher(index);
    }
}
