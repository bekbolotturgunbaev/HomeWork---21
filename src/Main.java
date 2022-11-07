import java.io.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        FileWriter file = new FileWriter("File.txt");
        for (char i = 'A'; i <= 'Z'; i++) {
            file.write(i + "\n");
            }for (int j = 0; j <= 9; j++) {
                file.write(j+"\n");
        }
        file.close();

            FileReader reader = new FileReader("File.txt");
            Scanner scanner = new Scanner(reader);
            while (scanner.hasNext()) {
                System.out.println(scanner.next());
            }


        }

}
