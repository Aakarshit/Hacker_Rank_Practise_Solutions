import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    static String biggerIsGreater(String w) {
        char arr[]=w.toCharArray();
        int n=w.length();
        boolean flag=true;
        int i=0;
        for(i=arr.length-1;i>0;i--){
            if(arr[i]>arr[i-1]){
                flag=false;
                break;
            }
        } 
        if(flag){
            return "no answer";
        }else{
            int temp=i;
            char c=arr[i-1];
            for(int j=i+1;j<n;j++){
                if(arr[j]>c && arr[j]<arr[temp]){
                    temp=j;
                }
            }
            swap(arr,i-1,temp);
            Arrays.sort(arr,i,n);
            return String.valueOf(arr);
        }
    }
    public static void swap(char []arr,int i,int j){
        char c=arr[i];
        arr[i]=arr[j];
        arr[j]=c;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int T = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int TItr = 0; TItr < T; TItr++) {
            String w = scanner.nextLine();

            String result = biggerIsGreater(w);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
