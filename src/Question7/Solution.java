package Question7;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

    public static void insertionSort(int[] A){
        ArrayList<Integer>temp=new ArrayList<Integer>();

        for(int i = 0; i < A.length; i++){
            temp.add(A[i]);
        }
        Collections.sort(temp);
        
        for(int x=0;x<temp.size();x++){
        	A[x]=temp.get(x);
        }
        printArray(A);
    }


    static void printArray(int[] ar) {
        for(int n: ar){
            System.out.print(n+" ");
        }
    }
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] ar = new int[n];
        for(int i=0;i<n;i++){
            ar[i]=in.nextInt();
        }
        insertionSort(ar);
    }
}
