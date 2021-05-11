public class InstructorManager extends UserManager{
    public void giveCourse(Instructor instructor) {
        System.out.println("Course that given by " + instructor.getName() + " is " + instructor.getGivenCourse());
    }
}
