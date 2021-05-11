public class Student extends User{

    private String takenCourse;

    public Student(int id, String name, String email, String takenCourse) {
        super(id, name, email);
        this.takenCourse = takenCourse;
    }

    public String getTakenCourse() {
        return takenCourse;
    }

    public void setTakenCourse(String takenCourse) {
        this.takenCourse = takenCourse;
    }
}
