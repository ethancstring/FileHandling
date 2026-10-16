import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;

public class Names {
    public static void main(String[] args) throws Exception{
        Scanner input = new Scanner(System.in);
        FileWriter fw = new FileWriter("names.txt", true);
        BufferedWriter file = new BufferedWriter(fw);
        System.out.print("How many students?\n>");
        int noStudents = input.nextInt();
        String name = "";
        input.nextLine();
        for (int i = 0; i < noStudents; i++){
            System.out.print("Enter a name: ");
            name = input.nextLine();
            file.write(name);
            file.newLine();
        }
        file.close();
    }
}
