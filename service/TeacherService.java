package less4.service;

import less4.model.Teacher;
import less4.model.TeacherGroup;

public class TeacherService {


    public Teacher createTeacher(int id, String name, String lastName) {
        return new Teacher(id, name, lastName);
    }
}
