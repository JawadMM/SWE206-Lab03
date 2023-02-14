import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
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

    public static void randomGroups(ArrayList<String> arr , int numGroups){

        Collections.shuffle(arr);

        ArrayList<ArrayList<String>> groups = new ArrayList<>();
        for(int i = 0 ; i<numGroups;i++){
            groups.add(new ArrayList<>());
        }
        
        for(int i = 0 ; i<arr.size();i++){
            groups.get(i%numGroups).add(arr.get(i));
        }
        System.out.println(groups);
    }
}