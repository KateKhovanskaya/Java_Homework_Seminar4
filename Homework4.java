import java.util.ArrayDeque;
import java.util.NoSuchElementException;
import java.util.Scanner;
public class Homework4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayDeque<String> storage = new ArrayDeque<String>();
        String input;
        while (!(input = sc.nextLine()).equals("exit")) {
            if ("print".equals(input)){
                System.out.println(storage);
            } else if("revert".equals(input)){
                try{
                storage.removeFirst();
                } catch(NoSuchElementException e){
                    System.out.println(e.getMessage());
                }
            } else {storage.addFirst(input);}
        }
    }
}
