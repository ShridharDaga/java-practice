package functions;

public class Student {
    private int marks;
    private String name;
    private int roll_no;

    public Student(String name) {
        this.name = name;
    }

    public Student(int marks, String name, int roll_no) {
        this.marks = marks;
        this.name = name;
        this.roll_no = roll_no;
    }

    public int getMarks() {
        return marks;
    }

    public void setMarks(int marks) {
        this.marks = marks;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRoll_no() {
        return roll_no;
    }

    public void setRoll_no(int roll_no) {
        this.roll_no = roll_no;
    }

    @Override
    public String toString() {
        return "Student{" +
                "marks=" + marks +
                ", name='" + name + '\'' +
                ", roll_no=" + roll_no +
                '}';
    }
}
