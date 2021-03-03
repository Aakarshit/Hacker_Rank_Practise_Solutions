import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the extraLongFactorials function below.
    static void factorials(int n) {
        BigInteger fact=new BigInteger("1");
        while(n>1){
            fact =fact.multiply(BigInteger.valueOf(n));
            n--;
        }
        System.out.print(fact);   
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        factorials(n);

        scanner.close();
    }
}