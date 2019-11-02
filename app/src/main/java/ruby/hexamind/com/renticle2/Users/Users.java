package ruby.hexamind.com.renticle2.Users;

public class Users {
    private String username;
    private String password;
    private String emailAddress;
    private String contactNumber;
    private String gender;
    private String role;

    public Users(String username, String password, String emailAddress, String contactNumber, String gender, String role) {
        this.username = username;
        this.password = password;
        this.emailAddress = emailAddress;
        this.contactNumber = contactNumber;
        this.gender = gender;
        this.role = role;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmailAddress() {
        return emailAddress;
    }

    public void setEmailAddress(String emailAddress) {
        this.emailAddress = emailAddress;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }
}
