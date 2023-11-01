package projects;
import java.util.Scanner;

public class funHelloWorld {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m"; // Red color
        
        System.out.println(ANSI_RED + "Enter your input: " + ANSI_RESET);
        String s = sc.nextLine();
        printHelloWorld(s);
    }

    public static void printHelloWorld(String s) {
        String x = "";
        String c = "09yvC1{Ak~]XaV#PwGTrHW!FMOh5]8LI/}Emd^B+&4jDle?(%ZpSifzK7o$Xc_6[bYUsQ3NnuJ|q2gtORxf?vLA<sybY.(W}z)\r\n" + //
                "12YhN6Ef+3Cn8?z7}sT4oVm&|G^S(Q/dM@kj1UyFuRcv*bW!ixDP)w~KXaZ9[A]I{B<0-#pLlqtoe_hXJXYn/</%gL<<OqwYt\r\n" + //
                "09yvC1{Ak~]XaV#PwGTrHW!FMOh5]8LI/}Emd^B+&4jDle(%ZpSifzK7o$Xc_6[bYUsQ3NnuJ|q2gtORxf?vLA<sybY.(W}z)/;):,.<>+_-=` ";
        
        // ANSI escape codes for text formatting
        String ANSI_RESET = "\u001B[0m";
        String ANSI_RED = "\u001B[31m"; // You can change the color code as needed
        String ANSI_GREEN = "\u001B[32m"; // Green color
        String ANSI_YELLOW = "\u001B[33m"; // Yellow color
        while (!x.equals(s)) {
            for (int j = 0; j < s.length(); j++) {
                for (int i = 0; i < c.length(); i++) {
                    try {
                        Thread.sleep(5);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    if (c.charAt(i) == s.charAt(j)) {
                        x += c.charAt(i);
                        break;
                    } else
                        System.out.println(ANSI_GREEN + x + c.charAt(i) + ANSI_RESET);
                }
            }
        }
        System.out.println(ANSI_YELLOW+x+ANSI_RESET);
    }
}
