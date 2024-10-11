import java.util.Scanner;

public class Main{
    public static void main(String[] args){
      Scanner scanner = new Scanner(System.in);
      boolean validInput = false;
      while (!validInput){
      System.out.println("Hello thank you for using our calculator and converter.");
      System.out.println(" would you like to use the basic calculator or the unit converter");
      String choice = scanner.nextLine().toLowerCase();
      
      if (choice.equals("basic calculator")){
        System.out.println("Running calculator......");
        Calculator.main(new String[0]);
        validInput = true;
      }else if (choice.equals("unit converter")){
       System.out.println("Running UnitConverter....");
        UnitConverter.main(new String[0]);
        validInput = true;
      } else {
      System.out.println("you have to choose between the 'basic calculator' or the 'unit converter' ");
        //return;
        validInput = false;
      }
      
      //System.out.println("thank you for using our calculator and converter.");
     // break;
      
      
      }
      System.out.println("thank you for using our calculator and converter.");
      //break;

    }

}