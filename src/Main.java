import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        FindLucasSequence fls=new FindLucasSequence();
        while (true){
            String menu="(press 'q' for exit program)";
            System.out.println("Enter number: ");
            System.out.println(menu);
            Scanner scanner=new Scanner(System.in);
            String input=scanner.nextLine();
            //check input character
            if (input.equals("q")){
                System.out.println("<exit program>");
break;

            }
            //call method
        fls.Lucas();

    }}
}
