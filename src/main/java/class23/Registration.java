package class23;
/* Create Registration Class in which you would have variable as email, userName, and password that have an access scope only
within its own class. After creating an object of the class user should be able to call methods and in each method separately
pass values to set users email, username password.
Requirements:
A. Valid email consider to be only yahoo.
> Valid username and password cannot be empty and should be of length larger than 6 characters. Also valid password cannot
contain userName.
 */
public class Registration {

    private String email;
    private String userName;
    private String password;

    public Registration(String email, String userName, String password) {
        this.email = email;
        this.userName = userName;
        this.password = password;
    }


    public void setEmail(String email) {

        if (email.contains("yahoo")) {
            this.email = email;

        } else {
            System.out.println("error");
        }
    }

    public void setUserName(String userName) {

        if (!userName.isEmpty() && userName.length() > 6) {
            this.userName=userName;
        } else {
            System.out.println("User name does not meet the requirements");
        }
    }

    public void setPassword(String password) {

        if (!password.isEmpty() && password.length() > 6 && password != userName) {
            this.password = password;
        } else {
            System.out.println("Password does not meet requirements");
        }

    }

    public String getEmail() {
        return email;
    }

    public String getUserName() {
        return userName;
    }

    public String getPassword() {
        return password;
    }
}

