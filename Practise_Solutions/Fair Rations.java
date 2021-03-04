import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the fairRations function below.
    static void fairRations(int[] arr,int sum) {
        int n=arr.length;
        int count=0;
        if((sum&1)!=0){
            System.out.println("NO");
        }else{
        for(int i=0;i<n;i++){
            if((arr[i]&1)!=0){
                arr[i]++;
                arr[i+1]++;
                count+=2;
            }
        }
        System.out.println(count);
        }
    }

    public static void main(String[] args) throws IOException {
      Scanner sc=new Scanner(System.in);
      int n=sc.nextInt();
      int arr[]=new int[n];
      int sum=0;
      for(int i=0;i<n;i++){
          arr[i]=sc.nextInt();
          sum+=arr[i];
      }
      fairRations(arr,sum);
    }
}
