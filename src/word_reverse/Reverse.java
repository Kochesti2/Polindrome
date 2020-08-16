package word_reverse;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		Scanner scr = new Scanner(System.in);
		System.out.println("Insert the word(min 4 chars) : ");
		String word = scr.nextLine().toString().toLowerCase();
		String mainword = word;
		if(word.length() < 4)
		{
			System.err.println("Your string is too short. Exit...");
			System.exit(0);
		}
		String hword = null;
		String found = null;
		int max = 0;
		int k = word.length();
		System.out.println(word);
		while(k>0)
		{
			for(int i=0;i<word.length();i++)
			{
				for(int j=i+2;j<word.length()+1;j++)
				{
					hword = word.substring(i, j);					
					if(string_reverse.rev(hword).equals(hword) && hword.length() > max)
					{
						max = hword.length();
						found = hword;
					}
				}
			}
			k--;
			word = word.substring(1);
		}
		System.out.println("match found : " + found );
		System.out.println("match length : " + max);
	}
}
