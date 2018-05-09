

import java.util.Random;
import java.io.*;
import java.util.Scanner;

class ShuffleWord{
	
	public static void main(String[] args)throws Exception/*BAD, SHOULD USE TRY CATCH.*/{


		File file = new File("words.txt");
		Scanner reader = new Scanner(file);
		String[] scrambledWord;
		char placeHolder = '0';

		Random randGenerator = new Random();
		String word=""; 

		for(int i=0; i<randGenerator.nextInt(7)+1;i++){

			if(reader.hasNext()){
				word= reader.nextLine();
			}
		}
		scrambledWord = word.split("");

		System.out.println(word);
		int randomIndex=randGenerator.nextInt(word.length());

		for(int i=0; i<word.length(); i++){
			
		}


	}
}