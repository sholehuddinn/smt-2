import java.util.Arrays;
import java.util.Scanner;

public class App3 {
    private static final char[] CHARACTERS = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789".toCharArray();
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Memasukkan panjang maksimum password
        System.out.print("Masukkan panjang maksimum password: ");
        int maxLength = scanner.nextInt();
        scanner.nextLine();  // Membersihkan buffer scanner
        
        // Memasukkan password target
        System.out.print("Masukkan password target: ");
        String targetPassword = scanner.nextLine();
        
        App3(targetPassword, maxLength);
    }
    
    public static void App3(String targetPassword, int maxLength) {
        char[] attempt = new char[maxLength];
        Arrays.fill(attempt, CHARACTERS[0]);
        
        // Mencoba semua kombinasi hingga panjang maksimal
        for (int length = 1; length <= maxLength; length++) {
            if (tryPassword(attempt, length, 0, targetPassword)) {
                System.out.println("Password ditemukan: " + new String(attempt, 0, length));
                return;
            }
        }
        System.out.println("Password tidak ditemukan dalam batas panjang yang diberikan.");
    }
    
    private static boolean tryPassword(char[] attempt, int length, int position, String targetPassword) {
        if (position == length) {
            return new String(attempt, 0, length).equals(targetPassword);
        }
        
        for (char c : CHARACTERS) {
            attempt[position] = c;
            if (tryPassword(attempt, length, position + 1, targetPassword)) {
                return true;
            }
        }
        return false;
    }
}
