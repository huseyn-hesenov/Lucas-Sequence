import java.util.Scanner;

public class FindLucasSequence {
    public void Lucas(){
        Scanner sc=new Scanner(System.in);
        //get value from console
        int number=sc.nextInt();
       int first_number=1;
       int second_number=2;
       int third_number;
       //go to limit valur
       for (int i=0;i<number;i++){
           System.out.println(first_number);
           //chang locate(swap)
           third_number=first_number+second_number;
           first_number=second_number;
           second_number=third_number;

       }

    }





}
