package src.Oops010_13Jan.encapsulation;

public class Lab072 {

    public static void main(String[] args) {

        //hidden
        LoginFixed login = new LoginFixed("admin","admin");

        boolean check =  login.ifLoggedIn("admin","admin");
        System.out.println(check);

        String user_details = login.getUsername();
        System.out.println(user_details);

        login.setUsername("new_admin");

        System.out.println("----------------");
        boolean check2 = login.ifLoggedIn("new_admin","admin");
        System.out.println(check2);

    }


}
class LoginFixed
{

    private String username;
    private String password;


    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void avijeet()
    {
        System.out.println("This is a private Method");
    }

    public LoginFixed(String user, String pass) {
        this.username = user;
        this.password = pass;
    }

    boolean ifLoggedIn(String username, String password) {
        avijeet();
        if (this.username.toLowerCase().equals(username) && this.password.toLowerCase().equals(password)) {
            System.out.println("You are logged in!!");
            return true;
        } else {
            System.out.println("Wrong Credentials");
            return false;
        }
    }

}
