import java.util.*;
import java.io.*;

public class Main {

    static int count = 0;
    public static void main(String[] args) throws IOException {

        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        StringBuilder sb = new StringBuilder();

        int Num = Integer.parseInt(bf.readLine());

        for(int i = 0; i < Num; i++) {
            count = 0;
            sb.append(isPalindrome(bf.readLine())).append(" ").append(count).append("\n");
        }
        System.out.print(sb);
    }

    public static int recursion(String s, int l, int r){
        count++;
        if(l >= r) return 1;
        else if(s.charAt(l) != s.charAt(r)) return 0;
        else return recursion(s, l+1, r-1);
    }

    public static int isPalindrome(String s){
        return recursion(s, 0, s.length()-1);
    }

}