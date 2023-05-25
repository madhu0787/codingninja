/*Has Path?
Send Feedback
Given an undirected graph G(V, E) and two vertices v1 and v2 (as integers), check if there exists any path between them or not. Print true if the path exists and false otherwise.
Note:
1. V is the number of vertices present in graph G and vertices are numbered from 0 to V-1.
2. E is the number of edges present in graph G.
Input Format :
The first line of input contains two integers, that denote the value of V and E.
Each of the following E lines contains two integers, that denote that there exists an edge between vertex 'a' and 'b'.
The following line contain two integers, that denote the value of v1 and v2.
Output Format :
The first and only line of output contains true, if there is a path between v1 and v2 and false otherwise.
Constraints :
0 <= V <= 1000
0 <= E <= 1000
0 <= a <= V - 1
0 <= b <= V - 1
0 <= v1 <= V - 1
0 <= v2 <= V - 1
Time Limit: 1 second
Sample Input 1 :
4 4
0 1
0 3
1 2
2 3
1 3
Sample Output 1 :
true
Sample Input 2 :
6 3
5 3
0 1
3 4
0 3
Sample Output 2 :
false*/
import java.util.LinkedList;
import java.util.*;


import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
public class HasPath {
    public static void main(String[] args) throws NumberFormatException, IOException {
        /* Write Your Code Here
         * Complete the Rest of the Program
         * You have to take input and print the output yourself
         */
        Scanner s= new Scanner(System.in);
        int v= s.nextInt();
        int e= s.nextInt();
        int[][] edges= new int[v][v];
        for(int i=0; i<e; i++){
            int sv=s.nextInt();
            int ev= s.nextInt();
            edges[sv][ev]=1;
            edges[ev][sv]=1;
        }
        int v1=s.nextInt();
        int v2= s.nextInt();
        System.out.println(hasPath(edges, v1, v2));
    }
    public static boolean hasPath(int[][] edges, int v1, int v2){
        if(v1 >edges.length-1 || v1<0|| v2 >edges.length-1 || v2<0 ){
            return false;
        }
        boolean[] visited=new boolean[edges.length];
        boolean result = false;
        for(int i=0;i<edges.length; i++){
            if(!visited[i]){
                result = hasPathHelper(edges, v1, v2, visited, 0);
                if(result){
                    break;
                }
            }
        }
        return result;
    }

    public static boolean hasPathHelper(int[][] edges, int v1, int v2, boolean[] visited, int src ){

        Queue<Integer> pendingVertices= new LinkedList<>();
        pendingVertices.add(src);
        visited[src] = true;
        while(!pendingVertices.isEmpty()){
            if(visited[v1] && visited[v2]){
                return true;
            }
            int front = pendingVertices.remove();
            for(int i=0; i<edges.length; i++){
                if(edges[front][i]==1 && !visited[i]){
                    pendingVertices.add(i);
                    visited[i]=true;
                }
            }
        }
        return false;
    }
}
