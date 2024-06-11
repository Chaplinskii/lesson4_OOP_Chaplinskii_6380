package less4.service;

import less4.model.Teacher;
import less4.model.TeacherGroup;

import java.util.List;

public class TeacherGroupService {
    public TeacherGroup teacherGroup;
    int index;

    public int getIndex() {
        return index;
    }

    public TeacherGroupService(TeacherGroup teacherGroup) {
        this.teacherGroup = teacherGroup;
    }

    public void addTeacher(int iD, Teacher teacher) {
        teacherGroup.teachers.add(iD, teacher);
    }

    public Teacher searchTeacher(String x) {
        for (int i = 0; i < teacherGroup.teachers.size(); i++) {
            if (teacherGroup.teachers.get(i).getName().equals(x) || teacherGroup.teachers.get(i).getLastName().equals(x)) {
//                System.out.println(teacherGroup.teachers.get(i));
                index=i;
                Teacher teacher = teacherGroup.teachers.get(i);
                return teacher;
            }
        }
        System.out.println("Нечего не найдено!");
        return null;
    }
    public List<Teacher> printAll(){
        return teacherGroup.teachers;
    }
    public void changeTeacher(int index,String name, String lastName){
        teacherGroup.teachers.get(index).setName(name);
        teacherGroup.teachers.get(index).setLastName(lastName);
    }

    public void deleteTeacher(int index) {
        teacherGroup.teachers.remove(index);
    }
}
