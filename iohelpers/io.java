import java.util.*;
import java.io.*;

class Main {

    public static void main (String[] args) {
        Scanner sc = new Scanner(System.in);

        // Integer
        int i = sc.nextInt();
        System.out.println("Integer: " + i);

        // Float
        float f = sc.nextFloat();
        System.out.println("Float: " + f);

        // String/ Next line 
        String str = sc.next();
        System.out.println("String: " + str);

        // Keep going while has next integer 
        while (sc.hasNextInt()) {
            i = sc.nextInt();
            System.out.println("Next int: " + i);
        }

        // Read from File
        try {
            Scanner fsc = new Scanner(new File("test.txt"));

            while (fsc.hasNextLine()) {
                int nextInt = fsc.nextInt();
                System.out.print(nextInt + " ");
            }

            fsc.close();
        } catch (Exception e) {}

        sc.close();
        System.out.println();

    }
}
