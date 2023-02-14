import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Sorter {
    public static void main(String[] args) {
        
    }

    public static ArrayList<String> readStu(){
        ArrayList <String> arr = new ArrayList<>();

        try {
            
            File f = new File("Student List.txt");
            Scanner sc = new Scanner(f);
            while(sc.hasNextLine()){

                arr.add(sc.nextLine());
            }
        } catch (Exception e) {
            // TODO: handle exception
        }
        return arr;
    }
}