package com.sumsung.Model;

import com.sumsung.NeModel.Printer;

public class University implements Printer {

    private String adress;
    private Student[] students;
    private Teacher[] teachers;

    public University (String adress, Student[] students, Teacher[] teachers){
        this.adress = adress;
        this.students = students;
        this.teachers = teachers;
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        System.out.println("Адрес университета:\n " +  adress + "\nСписок студентов: \n");
        for (int i = 0; i < students.length; i++)
                    students[i].printInfoToConsoleSuperKpacuBo();
        System.out.println("Список преподавателей: \n");

        for (int i = 0; i < teachers.length; i++)
            teachers[i].printInfoToConsoleSuperKpacuBo();
    }

    public String getAdress() {
        return adress;
    }

    public Student[] getStudents() {
        return students;
    }

    public Teacher[] getTeachers() {
        return teachers;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public void setTeachers(Teacher[] teachers) {
        this.teachers = teachers;
    }


}
