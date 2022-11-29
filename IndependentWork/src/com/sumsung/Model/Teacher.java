package com.sumsung.Model;

public class Teacher extends User{

    private String subject;

    @Override
    public void SayHello () {
        System.out.println("Здравствуйте! Я преподаватель, мое имя ....");
    }

    public Teacher (String subject ,String name, String first_name, String last_name, String mobile_number){
        this.subject = subject;
        this.setName(name);
        this.setLast_name(last_name);
        this.setFirst_name(first_name);
        this.setMobile_number(mobile_number);
    }

    public Teacher (String subject ,String name, String first_name, String last_name){
        this.subject = subject;
        this.setName(name);
        this.setLast_name(last_name);
        this.setFirst_name(first_name);
        this.setMobile_number("");
    }

    public Teacher (Teacher teacher) {
        this.subject = teacher.subject;
        this.setName(teacher.getName());
        this.setLast_name(teacher.getLast_name());
        this.setFirst_name(teacher.getFirst_name());
        this.setMobile_number(teacher.getMobile_number());
    }

    @Override
    public void printInfoToConsoleSuperKpacuBo() {
        System.out.println(
                "--------------------------------------\n" +
                "Ф.И.О учителя: \n" + getFirst_name() + " " + getName() + " " + getLast_name() + "\n\n" +
                        "Предмет обучения: \n" + subject + "\n\n" +
                        "Номер телефона преподавателя (пусто, если номер не указан): \n" + getMobile_number() + "\n\n" +
                        "--------------------------------------\n"
        );
    }
}
