package Question2;

import java.math.BigInteger;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in= new Scanner(System.in);
		int T= Integer.parseInt(in.nextLine());
		for(int x=0;x<T;x++){
			BigInteger N= new BigInteger(in.nextLine());
			int numSteps = 0;
			int counter = 1;
			BigInteger currentStone = new BigInteger("0");
			boolean keepGoing = true;
			boolean works = false;
			while(keepGoing){
				if(currentStone.compareTo(N)==0){
					keepGoing = false;
					works = true;
				}
				else if(currentStone.compareTo(N)==1){
					System.out.println("Better Luck Next Time");
					keepGoing = false;
				}
				else{
					currentStone = currentStone.add(new BigInteger(new Integer(counter).toString()));
					counter++;
					numSteps++;
				}
			}
			if(works){
				System.out.println("Go On Bob "+numSteps);
			}
		}
		in.close();
	}
}
