import java.util.Scanner;
public class Cold {
    public static void main(String []args) {


        System.out.println("How is the weather?");
        Scanner sc = new Scanner(System.in);
        String answer = sc.nextLine();


            if (answer.equalsIgnoreCase("rain")) {
                System.out.println("Take your umbrella!");
            }


       else if(answer.equalsIgnoreCase("windy")) {
            System.out.println("Wear your jacket!");

        }
       else if(answer.equalsIgnoreCase("snow")) {
           System.out.println("Wear a coat and take a shovel!");

       }  else
          System.out.println("Enjoy your day!");
        }
}

