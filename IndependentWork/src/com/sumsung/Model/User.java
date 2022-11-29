package com.sumsung.Model;
import com.sumsung.NeModel.*;

 abstract public class User implements Printer {
    private String name;
    private String first_name;
    private String last_name;
    private String mobile_number;

     public void SayHello() {
     }

     public String getName() {
         return name;
     }

     public String getFirst_name() {
         return first_name;
     }

     public String getLast_name() {
         return last_name;
     }

     public String getMobile_number() {
         return mobile_number;
     }

     public void setName(String name) {
         this.name = name;
     }

     public void setFirst_name(String first_name) {
         this.first_name = first_name;
     }

     public void setLast_name(String last_name) {
         this.last_name = last_name;
     }

     public void setMobile_number(String mobile_number) {
         this.mobile_number = mobile_number;
     }
 }
