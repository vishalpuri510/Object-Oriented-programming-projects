package School_management_system;
/*this is made by vishal puri
this student class will keep the track of all the students
track of students name,id,grades,fees paid
 */
public class student {
    private int id; //we gonna protect somebody else to get it
    private String name;
    private int grade;
    private int feespaid;
    private int feestotal;

    /**
     * for creating a new student class
     *
     * @param id    - for getting the id
     * @param name  - for setting the name of new object
     * @param grade - for giving grade of the new object created
     */
    public student(int id, String name, int grade) {
        this.feespaid = 0;
        this.feestotal = 30000;
        this.id = id;
        this.name = name;
        this.grade = grade;
    }

    //we are not going to alter the name and grade of the student

    /**
     * used to set the student's grade
     *
     * @param grade new grade of the student
     */
    public void setGrade(int grade) {
        this.grade = grade;
    }

    /**
     * keep adding the fees to the fees paid field
     * just add the fees to the fees paid.
     * the school is going to receive funds.
     *
     * @param fees it is the fees that the student pays
     */
    public void payFees(int fees) {
        feespaid = feespaid + fees;
        school.updatetotalmoneyearned(feespaid);
    }

    /**
     * all the fucntion is for getting the different entities
     *
     * @return
     */
    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }

    public int getFeespaid() {
        return feespaid;
    }

    public int getFeestotal() {
        return feestotal;
    }
    public int getremainingfees(){
        return feestotal - feespaid;
    }
    //worth it func
    public String toString(){
        return "Student name is"+name+ "total fees paid" + feespaid;
    }
}
