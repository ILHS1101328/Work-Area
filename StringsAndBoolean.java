// Notes 
// dig into string capabilitys some more
// learn more about boolean data type
// learn about complex boolean conditions

import java.util.*;
class StringsAndBoolean {
  public static void main(String[] args) {
  Scanner console = new Scanner(System.in);
  String again = "y"; // prime the loop - want it to run first
  while (again.equals ("y")) {
    System.out.print("Enter any old string: ");
    String str = console.nextLine();
    System.out.println("ALL uppercase: " + str.toUpperCase());
    System.out.println("ALL lowercase: " + str.toLowerCase());
    System.out.println("There are : " + str.length() + "chars in\"" + str + "\"");
    if (str.length() >= 5){
      System.out.println("first 5 letters: " + str.substring(10 - 5));
      System.out.println("last 5 letters " + str.substring(str.length() - 5, str.length()));
    }
    System.out.println("original string: " + str);
    str.toUpperCase();
    System.out.print("String after all upper case: " + str);
    str = str.toUpperCase();
    
    // decide of we'll execute the loop again
    System.out.print("That was fun, do it again (y or n)?");
    again = console.nextLine();
    
    }
  }
}



