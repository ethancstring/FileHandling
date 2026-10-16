import java.util.Scanner;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class Main {
    public static void main(String[] args) throws Exception{
        int choice = -1;
        while (choice != 0) {
            System.out.println("Menu");
            System.out.println("\t1. Student Data");
            System.out.println("\t2. Shopping List");
            choice = inputInt("Please enter your choice: ");
            switch (choice){
                case 1:
                    studentData();
                    break;
                case 2:
                    shop();
                    break;
            }
        }
    }

    public static void shop() throws Exception {
        FileReader fr = new FileReader("shop.txt");
        BufferedReader file = new BufferedReader(fr);
        String line = file.readLine();
        String[][] shoppingList = {{"", ""}, {"", ""}, {"", ""}, {"", ""}, {"", ""}};
        for (int row = 0; row < 5; row++){
            shoppingList[row][0] = line.substring(0, 5);
            shoppingList[row][1] = line.substring(5);
            line = file.readLine();
        }
        for(String[] listItem : shoppingList){
            for (String section : listItem){
                System.out.println(section);
            }
        }
    }

    public static void studentData() throws Exception{
        String[][] myStudents = {{"Sophie", "Stanfield", "Class 5"}, {"James", "Kitson", "Class 5"}, {"Zoe", "Lemon", "Class 1"}, {"Paul", "Johns", "Class 1"}, {"Freya", "Moore", "Class 5"}};
        FileWriter fw = new FileWriter("data.txt");
        BufferedWriter file = new BufferedWriter(fw);
        System.out.print("hehe");
        for (int row = 0; row < 5; row++){
            for (int column = 0; column < 3; column++){
                file.write(myStudents[row][column] + ",");
            }
            file.newLine();
        }
        file.close();
    }

    public static int inputInt(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextInt();
    }
    public static String inputString(String prompt) {
        Scanner input = new Scanner(System.in);
        System.out.print(prompt);
        return input.nextLine();
    }
}
