/*Descending order Pattern
        Send Feedback
        Print the following pattern for the given N number of rows.
        Pattern for N = 5
        5
        5 4
        5 4 3
        5 4 3 2
        5 4 3 2 1
        Input format :
        Integer N (Total no. of rows)
        Output format :
        Pattern in N lines
        Constraints
        0 <= N <= 50
        Sample Input 1:
        7
        Sample Output 1:
        7
        7 6
        7 6 5
        7 6 5 4
        7 6 5 4 3
        7 6 5 4 3 2
        7 6 5 4 3 2 1
        Sample Input 2:
        6
        Sample Output 2:
        6
        6 5
        6 5 4
        6 5 4 3
        6 5 4 3 2
        6 5 4 3 2 1*/

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.StringTokenizer;

public class DescendingOrderPattern {
    public static void trianglePattern(int n) {
        // Write your code here

        for(int row=1; row <=n; row++){
            for(int col=1; col<=row; col++){
                System.out.print(n+1-col);
                System.out.print(" ");
            }
            System.out.println();
        }
    }

    /********************Main Class
     *
     *
     */

    public static class FastReader {

        BufferedReader br;
        StringTokenizer root;

        public FastReader() {
            br = new BufferedReader(new InputStreamReader(System.in));
        }

        String next() {
            while (root == null || !root.hasMoreTokens()) {
                try {
                    root = new StringTokenizer(br.readLine());
                } catch (Exception r) {
                    r.printStackTrace();
                }
            }
            return root.nextToken();
        }

        int nextInt() {
            return Integer.parseInt(next());
        }
    }

    public static PrintWriter out = new PrintWriter(new BufferedOutputStream(System.out));
    public static FastReader sc = new FastReader();

    private static int t;
    private static int []n;

    private static void takeInput() {
        t = sc.nextInt();
        n = new int[t];
        for (int i = 0; i < t; ++i) {
            n[i] = sc.nextInt();
        }
    }

    private static void execute() {
        for (int i = 0; i < t; ++i) {
            trianglePattern(n[i]);
        }
    }

    private static void executeAndPrintOutput() {
        for (int i = 0; i < t; ++i) {
            trianglePattern(n[i]);
        }
    }

    public static void main(String[] args) {
        takeInput();
        executeAndPrintOutput();
        out.close();
    }
}
