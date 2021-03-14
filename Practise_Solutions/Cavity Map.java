import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

    

public class Solution {

    // Complete the cavityMap function below.
    static void cavityMap(String[] grid) {
        int n=grid.length;
        for(int i=1;i<n-1;i++){
            for(int j=1;j<n-1;j++){
        int left = Character.getNumericValue(grid[i].charAt(j-1));
            int right = Character.getNumericValue(grid[i].charAt(j+1));
            int up = Character.getNumericValue(grid[i-1].charAt(j));
            int down = Character.getNumericValue(grid[i+1].charAt(j));
            int middle = Character.getNumericValue(grid[i].charAt(j));
            char mid = grid[i].charAt(j);

            if(left<middle && up<middle && right<middle && down<middle){

                    StringBuilder sb = new StringBuilder(grid[i]);
                    sb.setCharAt(j, 'X');
                    grid[i] = sb.toString();
            }}}
            
for(int grid_i=0; grid_i < n; grid_i++){
        System.out.println(grid[grid_i]);
    }
    }

    
    public static void main(String[] args) throws IOException {
        FastReader in=new FastReader();
        
    int n = in.nextInt();
    String grid[] = new String[n];
    for(int grid_i=0; grid_i < n; grid_i++){
        grid[grid_i] = in.next();
    } 
    cavityMap(grid);
    
    }
        static class FastReader 
    { 
        BufferedReader br; 
        StringTokenizer st; 
  
        public FastReader() 
        { 
            br = new BufferedReader(new
                     InputStreamReader(System.in)); 
        } 
  
        String next() 
        { 
            while (st == null || !st.hasMoreElements()) 
            { 
                try
                { 
                    st = new StringTokenizer(br.readLine()); 
                } 
                catch (IOException  e) 
                { 
                    e.printStackTrace(); 
                } 
            } 
            return st.nextToken(); 
        } 
  
        int nextInt() 
        { 
            return Integer.parseInt(next()); 
        } 
  
        long nextLong() 
        { 
            return Long.parseLong(next()); 
        } 
  
        double nextDouble() 
        { 
            return Double.parseDouble(next()); 
        } 
  
        String nextLine() 
        { 
            String str = ""; 
            try
            { 
                str = br.readLine(); 
            } 
            catch (IOException e) 
            { 
                e.printStackTrace(); 
            } 
            return str; 
        } 
    }
}
