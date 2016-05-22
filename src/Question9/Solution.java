package Question9;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int n= in.nextInt();
		int k= in.nextInt();
		ArrayList <Integer>prices= new ArrayList<Integer>(n);
		
		for(int x=0;x<n;x++){
			prices.add(in.nextInt());
			
		}
		Collections.sort(prices);
		int numToys=0;
		
		for(int y=0;y<n;y++){
			if((k-prices.get(0))>=0){
				k-=prices.get(0);
				numToys++;
			}
			
		}
		
		System.out.println(numToys);
		

	}

}
