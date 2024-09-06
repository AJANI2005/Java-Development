import java.util.Scanner;

public class Input {
    private final Scanner scanner;
    Input(){
        scanner = new Scanner(System.in);
    }
    public int getInt(){
        return scanner.nextInt();  
    }
    public void close(){
        scanner.close();
    }
}
