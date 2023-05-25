/*Reverse Char Pattern
Send Feedback
Print the following pattern for the given N number of rows.
Pattern for N = 5
E
ED
EDC
EDCB
EDCBA
Input format :
Integer N (Total no. of rows)
Output format :
Pattern in N lines
Constraints
0 <= N <= 50
Sample Input 1:
7

Sample Output 1:
G
GF
GFE
GFED
GFEDC
GFEDCB
GFEDCBA
Sample Input 1:
6
Sample Output 1:
F
FE
FED
FEDC
FEDCB
FEDCBA*/
public class ReverseCharPattern {
    public static void alphabetPattern(int n) {
        // Write your code here
        char element= (char)('A'+n-1);
        for(int row=1; row <=n; row++){
            for(int col=1; col<=row; col++){
                char colValue=(char) (element-col+1);
                System.out.print(colValue);
            }
            System.out.println();
        }
    }
}
