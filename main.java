
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {
        
        MainFrame form = new MainFrame();
        
        User[] userArray = new User[50];
        int userAmount = 0;
        try {
            File userData = new File("userData.txt");
            Scanner myReader =  new Scanner(userData);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                String[] userInfo = data.split(",");
                userArray[userAmount] = new User(Integer.parseInt(userInfo[0]),userInfo[1],userInfo[2],userInfo[3],userInfo[4]);
                userAmount++;
                
                System.out.println(userArray[userAmount-1].accountNumber);
            }
            
            
            
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
        }
        
        form.setVisible(true);
        
    }
    
}

class User {
    int accountNumber;
    String userName;
    String password;
    String firstName;
    String secondName;
    
    public User(int ac, String usr, String pass, String frs, String sec)
    {
        accountNumber = ac;
        userName = usr;
        password = pass;
        firstName = frs;
        secondName = sec;
    }
    
    public static boolean checkUser(String username, String password) {
        return true;
    }
}