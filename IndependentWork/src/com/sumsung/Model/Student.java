package com.sumsung.Model;


public class Student extends User {
    private String group;
    @Override
    public void SayHello (){
        System.out.println("Привет! Я студен, мое имя ....");
    }

    public Student(String group, String name, String last_name, String first_name, String mobile_number) {
        this.group = group;
        this.setName(name);
        this.setLast_name(last_name);
        this.setFirst_name(first_name);
        this.setMobile_number(mobile_number);
    }

    public Student(String group, String name, String last_name, String first_name) {
        this.group = group;
        this.setName(name);
        this.setLast_name(last_name);
        this.setFirst_name(first_name);
        this.setMobile_number("");
    }

    public Student(Student student) {
        this.group = student.group;
        this.setName(student.getName());
        this.setLast_name(student.getLast_name());
        this.setFirst_name(student.getFirst_name());
        this.setMobile_number(student.getMobile_number());
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        System.out.println(
                "--------------------------------------\n" +
                "Ф.И.О студента: \n" + getFirst_name() + " " + getName() + " " + getLast_name() + "\n\n" +
                        "Номер группы студента: \n" + group + "\n\n" +
                        "Номер телефона студента (пусто, если номер не указан): \n" + getMobile_number() + "\n\n" +
                "--------------------------------------\n"
        );
    }
}
