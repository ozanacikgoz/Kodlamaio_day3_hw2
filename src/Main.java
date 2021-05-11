public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(12345, "Ozan", "ackgozozan@gmail.com", "314");
        Instructor instructor1 = new Instructor(12346, "Engin", "engin@gmail.com", "314");

        UserManager userManager = new UserManager();
        User[] users = {instructor1,student1};
        userManager.addMultiple(users);

        StudentManager studentManager = new StudentManager();
        studentManager.takeCourse(student1);

        InstructorManager instructorManager = new InstructorManager();
        instructorManager.giveCourse(instructor1);
    }

}
