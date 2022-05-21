package School_management_system;
import java.util.List;

/**
 * implementing teacher and student in List because we can have more of that
 * totalmoneyearned and totalmoneyspent will be integer
 */
public class school {
    private List<Teacher> teachers;
    private List<student> students;
    private static int totalmoneyearned;
    private static int totalmoneyspent;

    public school(List<Teacher> teachers, List<student> students) {
        this.teachers = teachers;
        this.students = students;
        totalmoneyearned=0;
        totalmoneyspent=0;
    }

    /**
     *
     * @return
     */
    public List<Teacher> getTeachers() {
        return teachers;
    }

    /**
     * Adds a teacher to the school
     * @param teacher
     */
    public void updateTeachers(Teacher teacher) {
        teachers.add(teacher);
    }

    public List<student> getStudents() {
        return students;
    }

    public void addStudents(student student) {
        students.add(student);
    }

    public int getTotalmoneyearned() {
        return totalmoneyearned;
    }

    public static void updatetotalmoneyearned(int moneyearned) {
        totalmoneyearned+=moneyearned;
    }

    public int getTotalmoneyspent() {
        return totalmoneyspent;
    }

    public static void updatetotalmoneyspent(int moneyspent) {
        totalmoneyearned -= moneyspent;
    }


}
