package ruby.hexamind.com.renticle2;

import java.util.ArrayList;

public class UserDataSource {
    public ArrayList<User> users = new ArrayList<>();
    private static final UserDataSource ourInstance = new UserDataSource();

    public static UserDataSource getInstance() {
        return ourInstance;
    }

    private UserDataSource() {
        User user = new User();
        user.fname = "Ha";
        user.lname = "r";
        user.username = "i";
        this.users.add(user);
    }

    public ArrayList<User> getUsers (){
        return users;
    }
}
