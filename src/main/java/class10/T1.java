package class10;

public class T1
{

    public static void main(String[] args) {

        String userName="User123";
        String password="Pass12345";
        String confirmsPassword="Pass12345";
                if(userName.isEmpty()||password.isEmpty()){
                    System.out.println("Username or Password cannot be empty");

                }else if(password.length()<8){
                        System.out.println("Password is too short");
                }else if(password.contains(userName)){
                       System.out.println("Password cannot contain username");
                }else if (!password.equals(confirmsPassword)){
                       System.out.println("Passwords do not match");
                }else System.out.println("Your username and password has been created");

    }
}
