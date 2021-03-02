import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the encryption function below.
    static String encryption(String s) {
        String str=s.trim().replaceAll("\\s","");
        int len=str.length();
        double q=Math.sqrt(len);
        int l=(int)Math.floor(q);
        int r=(int)Math.ceil(q);
        StringBuilder sb=new StringBuilder();
        int i=0;
        int m=0;
        int n=0;
        if(l*r < len){
            m=r;
            n=r;
        }else{
            m=l;
            n=r;
        }
        char[][] ans=new char[m][n];
        int y=0;
        while(true){
            if(i+r>=len){
                break;
            }
            String temp=str.substring(i,i+r);
            for(int x=0;x<temp.length();x++){
                ans[y][x]=temp.charAt(x);
            }
            y++;
            i=i+r;
        }
        String t=str.substring(i);
        for(int x=0;x<t.length();x++){
            ans[y][x]=t.charAt(x);
        }
        String doggy="";
        for(int p=0;p<n;p++){
           Akii:for(int j=0;j<m;j++){
                if(ans[j][p]==' '){
                     break Akii;
                }
                doggy += String.valueOf(ans[j][p]);
            }
            doggy=doggy.trim();
            doggy+=" ";  
        }
        String love = doggy.replaceAll("\\s+", " ").trim();
        
        return love;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scanner.nextLine();

        String result = encryption(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
