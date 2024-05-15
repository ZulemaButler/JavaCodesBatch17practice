package class12;

public class T2MethodQuestion {

    //create a method createEmail(). Based on values of users firstName, lastName and email type, your method should return complete
    //email address. Ex:create email (John, Snow, gmail)=> JohnSnow@gmail.com

        String createEmail(String firstName, String lastName, String emailType){
            return firstName+lastName+"@" +emailType+".com";

        }
}
