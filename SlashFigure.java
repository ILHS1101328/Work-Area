public class SlashFigure{
  public static void main(String[] args){
    //6 rows 
    for (int line = 1; line <= 6; line = line + 1) {
      //Some BackSlashes and Some Explanation Points 
      //Example: \\\\\\!!!!!!!!!!//////
      int numSlashes = 2 * line - 2;
      System.out.print(numSlashes + " \\s, ");
      // after table you're outputting looks good, replace numbers with actual output
      // for (int slashesDrawn = 0; slashesDrawn < numSlashes; slashesDrawn = slashesDrawn + 1) {
      //   System.out.print("\\");
      // }
      int numMarks = -4 * line + 26;
      System.out.print(numMarks + " !s, ");
      System.out.print(numSlashes + " /s");
/*
      // some \s (0, then 2, then 4, ...)
      for (int slashesDrawn = 0; slashesDrawn < 2*line-2; slashesDrawn = slashesDrawn + 1) {
        System.out.print("\\");
      }
      // some !s (22, 18, 14 ...)
      for (int marksDrawn = 0; marksDrawn < -4*line+26; marksDrawn = marksDrawn + 1) {
          System.out.print("!");
      }

      // some /s (0, then 2, then 4, ...)
      for (int slasheDrawn = 0; slasheDrawn < 2*line-2; slasheDrawn = slasheDrawn + 1) {
        System.out.print("/");
      }
*/
      // remember to end the line and go to the next one!
      System.out.println();
    }
  }
}