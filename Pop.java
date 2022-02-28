public class Pop {
    public static void main(String[] args) {
        for (int b = 99 ;b >= 1 ;b = b - 1) {
            System.out.println(b + " bottles of pop on the wall, " + b);
            System.out.println("Take one down, pass it around, " + (b - 1));
        }
    }
}

