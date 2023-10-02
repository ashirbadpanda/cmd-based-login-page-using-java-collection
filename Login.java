import java.util.ArrayList;
import java.util.Scanner;

public class Login {
    public static void main(String args[]){
        ArrayList<User> users = new ArrayList<>();
        users.add(new User("user1","password1"));
        users.add(new User("user2","password2"));
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Login page!");
        while(true){
            System.out.println("Enter username: ");
            String username =  sc.nextLine();

            System.out.println("Enter password: ");
            String password = sc.nextLine();

            if(isValidLogin(users,username,password)) {
                System.out.println("Login Successful");
                break;
            } else {
                System.out.println("Invalid username and password. Please try again.");
            }
        }
        sc.close();
    }
    public static boolean isValidLogin(ArrayList<User> users,String username, String password) {
        for(User user: users) {
            if(user.username.equals(username) && user.password.equals(password)){
                return true;
            }
        }
        return false;
    }
}



class User {
    public String username;
    public String password;

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }
}