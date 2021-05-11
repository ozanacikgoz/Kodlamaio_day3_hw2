public class Instructor extends User{

    private String givenCourse;

    public Instructor(int id, String name, String email, String givenCourse) {
        super(id, name, email);
        this.givenCourse = givenCourse;
    }

    public String getGivenCourse() {
        return givenCourse;
    }

    public void setGivenCourse(String givenCourse) {
        this.givenCourse = givenCourse;
    }
}
