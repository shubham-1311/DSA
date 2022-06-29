import java.util.*;
import java.io.*;
public class GoogleInputSample {
        public static void main(String[] args) {
            Scanner in = new Scanner(new BufferedReader(new InputStreamReader(System.in)));

            // Scanner has functions to read ints, longs, strings, chars, etc.
            int t = in.nextInt();
            for (int i = 1; i <= t; ++i) {
                int n = in.nextInt();
                int m = in.nextInt();
                System.out.println("Case #" + i + ": " + (n + m) + " " + (n * m));
            }
        }
    }

