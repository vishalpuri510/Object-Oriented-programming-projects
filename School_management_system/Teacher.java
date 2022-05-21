package School_management_system;

public class Teacher {
    private int id;
    private String name;
    private int sal;

    private int salaryearned;

    public Teacher(int id, String name,int sal){
        this.id = id;
        this.name = name;
        this.sal = sal;
        this.salaryearned = 0;
    }

    public int getId(){
        return id;
    }
    public String getName(){
        return name;
    }
    public int getSal(){
        return sal;
    }
    public void setsal(int sal){
        this.sal = sal;
    }

    public void receive_salary(int sall){
        salaryearned+=sall;
        school.updatetotalmoneyspent(sall);
    }

    @Override
    public String toString() {
        return "name " + name + "salary is "+ sal;
    }
}
