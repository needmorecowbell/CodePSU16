package Questionz10;

import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int numCases= Integer.parseInt(in.nextLine());
		
		for(int i=0;i<numCases;i++){
			int D= in.nextInt();
			int P= in.nextInt();
			
			if(D<0){
				System.out.println(0);
			}else if(D==0){
				if(isPerfect(P)){
					System.out.println(2);
                }else{
                    System.out.println(0);
                                    }
					
				
			}else{
				int counter=0;
				int x=(-1*P);
				int y=(-1*P);		
				while(x<P+1){
					if(x*y == P) {
						while(y<P+1){
							if(Math.abs(x-y)==D && (x*y)==P){
								counter++;
							}
						}
					}
				}	
				System.out.println(counter);
			}

		}
	}
	
	public static boolean isPerfect(int num){
		double sqrt= (double)Math.sqrt(num);
		
		if(sqrt%1 == 0.00){
			return true;
		}else{
			return false;
		}
	}

}