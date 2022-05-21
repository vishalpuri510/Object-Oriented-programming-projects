package School_management_system;

import java.util.ArrayList;
import java.util.List;

public class main{
    public static void main(String[] args) {
        Teacher lizzyy = new Teacher(1001,"lizzy",5000);
        Teacher milisa = new Teacher(1002,"milisa",7000);
        Teacher wender = new Teacher(2001,"wendwe",10000);
        List<Teacher> li = new ArrayList<>();
        li.add(lizzyy);
        li.add(milisa);
        li.add(wender);

        student shivangi = new student(1,"shivangi shukla",12);
        student vishal = new student(2,"vishal puri",12);
        student vaibhav = new student(3,"vaibhav sharma",10);
        List<student> lis = new ArrayList<>();
        lis.add(shivangi);
        lis.add(vishal);
        lis.add(vaibhav);

        school GNIOT = new school(li,lis);
        //System.out.println(GNIOT.getTotalmoneyearned());

        shivangi.payFees(1000);
        System.out.println(GNIOT.getTotalmoneyearned());

        vishal.payFees(6000);
        System.out.println(GNIOT.getTotalmoneyearned());


        //GNIOT is paying salary

        lizzyy.receive_salary(lizzyy.getSal());
        System.out.println(GNIOT.getTotalmoneyearned());

        System.out.println(vishal);
        System.out.println(lizzyy);
    }
}
