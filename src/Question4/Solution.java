package Question4;

import java.util.ArrayList;
import java.util.Scanner;

public class Solution {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String line = in.nextLine();
		ArrayList<Character> key = new ArrayList<Character>();
		for (int x = 0; x < line.length(); x++){
			key.add(line.charAt(x));
		}
		
		for(int x = 0; x < key.size(); x++)
		{
			for(int y = 0; y < key.size(); y++)
			{
				if(x==y)
				{
					if(key.get(x) == key.get(y))
					{
						key.remove(y);
						key.remove(x);
					}
				}
			}
			
		}
		
		if(key.size()>=1)
		{
			System.out.println("NO");
		}
		else
		{
			System.out.println("YES");
		}
		
	}

}
