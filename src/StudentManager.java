public class StudentManager extends UserManager{
    public void takeCourse(Student student) {
        System.out.println("Course that taken by " + student.getName() + " is " + student.getTakenCourse());
    }
}
