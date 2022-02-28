// plan for Size 3, in pseudocode

// McT - 2021-10-21
// This program produces a piece of ASCII art with nice patterns
// in it. We will later make this scale to different sizes
public class Hourglass {
  public static void main(String[] args) {
    drawTopHalf();
    drawBottomHalf();
  }

  /* Draws top half of our "Hourglass" shape
  +------+
  |\..../|
  | \../ |
  |  \/  |
  */
  static void drawTopHalf() {
    System.out.println("+------+");

    // multiple lines like | \../ |
    for (int line = 1; line <= 3; line++) {
      System.out.print("|");
      // some spaces (0, then 1, then 2)
      for (int space = 1; space <= line - 1; space = space + 1) {
        System.out.print(" ");
      }
      
      System.out.print("\\");
      // some .s (4, then 2, then 0)
      System.out.print("/");
      // some spaces (same as earlier)
      System.out.print("|");
      // remember to go to the next line!!
      System.out.println();
    }
  }

  // Draws bottom half of our "Hourglass" shape
  // basically, top half, upside down
  static void drawBottomHalf() {
    // multiple lines like | /..\ |
    // +------+
  }
}
