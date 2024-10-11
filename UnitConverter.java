
import java.util.Scanner;
public class UnitConverter{
    public static void main(String[] arg){
       
       Scanner scanner = new Scanner(System.in);
      boolean validInput = false;
      while (!validInput){
      System.out.println(" would you like to convert from meters to feet (press 'a') or from celsius to fahrenheit (press 'b'):  ");
       char choice = scanner.nextLine().toLowerCase();
       
       if (choice.equals('a')){
        convertMetresToFeet();
        validInput = true;
       } else if (choice.equals('b')) {
       convertCelsiusToFahrenheit();
       validInput = true;
       } else {
        System.out.println("invalid choice choose between a or b");
        validInput = false;
       }
    }
    }
    public static void convertMetresToFeet(){
      Scanner scanner = new Scanner(System.in);
      boolean validInput = false;
      while (!validInput){

      System.out.println("pls would you like too convert from Meters or feet? ");
      String choiceMorF = scanner.nextLine().toLowerCase();
      
      if (choiceMorF.equals("meters")){

      System.out.println("how many meters would you like to convert? ");
       float meters = scanner.nextFloat();
       
       //float Feetvar = 3.28084;
       //calculation to convert meters to feet which is to multiply the meteres by 3.38084
        float  Feetcalc = meters * 3.28084f;
        //printing out result statement
        System.out.println(meters + "meter is " + Feetcalc + "feet.");
      validInput = true;
     } else if (choiceMorF.equals("feet")){
        System.out.println("how many feet would you like to convert? ");
       float feet = scanner.nextFloat();

       //double Feetvar = 3.28084;
       //calculation to convert feet to meters which is to divide the feet by 3.38084
        double  Feetcalc = feet / 3.28084f;
       // printing out result statement
        System.out.println(feet + "feet is "+  Feetcalc + "meters.");
       validInput = true;
     } else {
      //default statemet
        System.out.println("invalid input. Please type'meters' or 'feet'.");

     }
      }

    }


// method for tempuratue conversion


    
    public static void convertCelsiusToFahrenheit(){
    Scanner scanner = new Scanner(System.in);
      boolean validInput = false;
      while (!validInput){

      System.out.println("pls would you like too convert from celsius or fahrenheit? ");
      String choiceCorF = scanner.nextLine().toLowerCase();
      
      if (choiceCorF.equals("celsius")){

      System.out.println("how many celsius would you like to convert? ");
       float celsius = scanner.nextFloat();
       
       //float Feetvar = 3.28084;
       //calculation to convert celsius to fahrenheit which is to multiply the celcius by (9/5) + 32
        float  Farhcalc = (celsius * 9/5) +32;
        //printing out result statement
        System.out.println(celsius + " C is " + Farhcalc+ "Fahrenheit.");
      validInput = true;
     } else if (choiceCorF.equals("fahrenheit")){
        System.out.println("how many Fahrenheit would you like to convert? ");
       float Fahrenheit = scanner.nextFloat();

       //double Feetvar = 3.28084;
       //calculation to convert fahrenheit to celsius which is to  minus the fahrenheit by 32 then multily by 5/9
        double  celcalc = (Fahrenheit - 32) * 5/9;
       // printing out result statement
        System.out.println( Fahrenheit+ "f is "+  celcalc + "C.");
       validInput = true;
     } else {
      //default statemet
        System.out.println("invalid input. Please type'meters' or 'feet'.");

     }
      }
    }
}