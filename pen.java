class pen{
  public static void main(String[] args){
  pen.Trap1();
  pen.Trap2();
  pen.Trap3();
  pen.Trap4();

  }
  static void Drawline(){
System.out.println("+--------+");
  }
  static void DrawTop(){
System.out.println("  ______");
 System.out.println(" /      \\");
System.out.println("/        \\");
  }
  static void Drawbotom(){
  System.out.println("\\        /");
 System.out.println(" \\______/");
  }
  static void Trap1(){
    DrawTop();
   Drawbotom();
   
  }
  static void Trap2(){
   Drawbotom();
   Drawline();

  }
  static void Trap3(){
   DrawTop();
System.out.println("|  STOP  |");
Drawbotom();
  }
  static void Trap4(){
    DrawTop();
Drawline();
  }
}