package com.sumsung.NeModel;

import com.sumsung.Model.Student;
import com.sumsung.Model.Teacher;
import com.sumsung.Model.University;

public class DomoService {

    private University university;

    public void demo (){
        Teacher teacher1 = new Teacher ("Математика", "Иван", "Иванов", "Иванович", "+71234567");
        Teacher teacher2 = new Teacher ("Русский язык","Ирина","Иванова","Олеговна");

        Student student1 = new Student ("1", "Валера", "Иванов","Иванович", "+7800535353");
        Student student2 = new Student ("1", "Александр", "Иванов","Петрович", "+780090909");
        Student student3 = new Student ("2", "Альберт", "Александров","Александрович");

        Teacher[] teachers = new Teacher[2];
        teachers[0]  = teacher1;
        teachers[1]  = teacher2;

        Student[] students = new Student[3];
        students[0] = student1;
        students[1] = student2;
        students[2] = student3;

        University university = new University("Центральная, 1", students, teachers);
        university.printInfoToConsoleSuperKpacuBo();
    }

    public DomoService (University university){
        this.university = university;
    }

    public com.sumsung.Model.University getUniversity() {
        return university;
    }

    public void setUniversity(com.sumsung.Model.University university) {
        university = university;
    }
    public DomoService () {

    }
}
