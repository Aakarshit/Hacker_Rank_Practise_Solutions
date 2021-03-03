import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
    static String organizingContainers(int[][] container) {
        ArrayList<Integer> row=new ArrayList<Integer>();
        ArrayList<Integer> col=new ArrayList<>();
        for(int i=0;i<container.length;i++){
            int temp=0;
            for(int j=0;j<container.length;j++){
                temp+= container[i][j];
            }
            row.add(temp);
        }
        for(int i=0;i<container.length;i++){
            int temp=0;
            for(int j=0;j<container.length;j++){
                temp+= container[j][i];
            }
            col.add(temp);
        }
        Collections.sort(row);
        Collections.sort(col);
        boolean flag=true;
        for(int i=0;i<row.size();i++){
            int temp=row.get(i);
            int temp2=col.get(i);
            if(temp==temp2){
                flag=true;
                
            }else{
                flag=false;
                break;
            }
        }
        if(flag){
            return "Possible";
        }else{
            return "Impossible";
        }
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int q = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int qItr = 0; qItr < q; qItr++) {
            int n = scanner.nextInt();
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            int[][] container = new int[n][n];

            for (int i = 0; i < n; i++) {
                String[] containerRowItems = scanner.nextLine().split(" ");
                scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

                for (int j = 0; j < n; j++) {
                    int containerItem = Integer.parseInt(containerRowItems[j]);
                    container[i][j] = containerItem;
                }
            }

            String result = organizingContainers(container);

            bufferedWriter.write(result);
            bufferedWriter.newLine();
        }

        bufferedWriter.close();

        scanner.close();
    }
}
