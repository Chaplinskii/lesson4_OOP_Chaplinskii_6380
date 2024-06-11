package less4.service;

import less4.controller.TeacherController;
import less4.controller.TeacherGroupController;
import less4.model.Teacher;
import less4.model.TeacherGroup;

import java.util.List;
import java.util.Scanner;

public class MenuService {
    public TeacherGroup teacherGroup = new TeacherGroup();

    public TeacherController teacherController = new TeacherController();
    public TeacherGroupService teacherGroupService = new TeacherGroupService(teacherGroup);
    public TeacherGroupController teacherGroupController = new TeacherGroupController(teacherGroupService);
    private int iD = 0;

    public boolean createTeacher() {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите name:");
        String name = scanner.next();
        System.out.println("Введите lastName:");
        String lastName = scanner.next();
        Teacher teacher = teacherController.creatTeacher(iD, name, lastName);
        System.out.println(teacher);
        teacherGroupController.addTeacher(iD, teacher);
        iD++;
        return true;
    }

    public Teacher searchTeacher() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите name или lastName:");
        String name = scanner.next();
        return teacherGroupController.searchTeacher(name);
    }

    public boolean changeTeacher() {
        if (searchTeacher() != null) {

            Scanner scanner = new Scanner(System.in);

            System.out.println("Введите новое name: ");
            String name = scanner.next();
            System.out.println("Введите новое lastName: ");
            String lastName = scanner.next();
            teacherGroupController.changeTeacher(name, lastName);
            System.out.println(teacherGroupService.teacherGroup.teachers.get(teacherGroupService.getIndex()));
            return true;
        }
        return false;
    }

    public List<Teacher> printAll() {
        return teacherGroupController.printAll();
    }

    public void deleteTeacher() {
        if (searchTeacher() != null) {
            System.out.println(teacherGroupService.teacherGroup.teachers.get(teacherGroupService.getIndex()));
            teacherGroupController.deleteTeacher(teacherGroupService.getIndex());
        }
    }
}
