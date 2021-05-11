public class UserManager {
    public void addUser(User user) {
        System.out.println("User with a id number " + user.getId() + " is added.");
    }

    public void addMultiple(User[] users) {
        for (User user : users) {
            addUser(user);
        }
    }
}
