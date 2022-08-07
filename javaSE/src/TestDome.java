import java.nio.file.attribute.UserPrincipal;
import java.util.Scanner;

public class TestDome{
    public static void main(String[] args) {
        Scanner scanner =new Scanner(System.in);
        System.out.println("shuru");
        String username = scanner.next();
        System.out.println("shuru");
        String userpassword = scanner.next();
        if("admin".equals(username)&&"admin".equals(userpassword)){
            System.out.println("success");
        }else {
            System.out.println("finy");
            
        }
    }
}