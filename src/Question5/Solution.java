package Question5;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		int numTests=0;
		String line= in.nextLine();
		numTests= Integer.parseInt(line);
		ArrayList <String> Tests= new ArrayList<String>();
		
		
		for(int x=0;x<numTests;x++){
			Tests.add(in.nextLine());
			int MAX = 0;
			for(int k=0;k<Tests.size();k++){
				String entries[];
				entries= Tests.get(x).split(" ");
				int numEles= Integer.parseInt(entries[0]);
				
				int mod= Integer.parseInt(entries[1]);
				
				String elements[];
				line= in.nextLine();
				elements = line.split(" ");
				
				int i = 0;
				int j = 0;
				
				while(i<numEles){
					int hold = Integer.parseInt(elements[i]);
					if((Integer.parseInt(elements[i])) % mod > MAX) {
						MAX = Integer.parseInt(elements[i]) % mod;
					}
					j++;
					while(j<numEles){
						if((hold + Integer.parseInt(elements[j])) % mod > MAX) {
							MAX = (Integer.parseInt(elements[j]) + hold) % mod;
						}
						j++;
					}
					i++;
				}
			}
			System.out.println(MAX);
		}

	}
}
