package timus;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

/**
 * Created by sherxon on 12/7/16.
 */
public class Sabotage1290 {
    public static void main(String[] args) {
        FastReader fastReader=new FastReader();
        int n=fastReader.nextInt();
        int []a =new int[n];
        for (int i = 0; i < n; i++) {
            int k=fastReader.nextInt();
            a[i]=k;
        }
        Arrays.sort(a);
        for (int i = a.length-1; i >=0 ; i--) {
            System.out.println(a[i]);
        }
    }
    private static class FastReader {
        BufferedReader bf;
        StringTokenizer st;


        public FastReader() {
            bf=new BufferedReader(new InputStreamReader(System.in));
        }
        String nextLine(){
            String st="";
            try {
                st=bf.readLine();
            } catch (IOException e) {
                e.printStackTrace();
            }
            return  st;
        }
        String next(){
            while (st==null || !st.hasMoreTokens()){
                try {
                    st= new StringTokenizer(bf.readLine());
                } catch (IOException e) {
                    e.printStackTrace();
                }

            }
            return st.nextToken();
        }
        int nextInt(){
            return     Integer.parseInt(next());
        }
    }

}
