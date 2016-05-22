package Question3;

import java.awt.List;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in= new Scanner(System.in);
		String line=in.nextLine();
		int numCases= Integer.parseInt(line);
		ArrayList<String>inputs= new ArrayList<String>();
		
		for(int x=0;x<numCases;x++){
			line=in.nextLine();
			inputs.add(line);
		}
		for(int x=0;x<numCases;x++){

			ArrayList<Character>sorted= new ArrayList<Character>();
			for( char m : inputs.get(x).toCharArray()){
				sorted.add(m);
			}
			Collections.sort(sorted);
			
			if(sorted.isEmpty()){
				System.out.println("no answer");
			}else{
				System.out.println(sorted.toString());
			}
		}

	}

}
