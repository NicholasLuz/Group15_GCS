import java.io.IOException;
import java.util.Scanner;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        Locale.setDefault(Locale.ENGLISH);
        Scanner in = new Scanner(System.in);
        
        String palavra = "";
        
        while (in.hasNextLine()) {
            
            palavra = in.nextLine();
            while (palavra.length() > 20) {
                palavra = in.nextLine();    
            }
        
            palavra = palavra.toLowerCase();
            
            if (palavra.length() >= 10) {
                System.out.println("palavrao");
            } else {
                System.out.println("palavrinha");
            }
        }
    }
}