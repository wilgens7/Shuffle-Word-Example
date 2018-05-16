

import java.util.Random;
import java.io.*;
import java.util.Scanner;
import java.util.Arrays;

class ShuffleWord{

	//swaps values at given indeces i and j. 
	private static void swap(Comparable[] array, int i, int j){

		Comparable holder=array[i];
		array[i]=array[j];
		array[j]=holder;

	}
	
	public static void main(String[] args)throws Exception/*BAD, SHOULD USE TRY CATCH.*/{


		
		File file = new File("words.txt");
		Scanner reader = new Scanner(file);
		String[] scrambledWord;

		Random randGenerator = new Random();
		String word=""; 

		//picks a random line in the file
		for(int i=0; i<randGenerator.nextInt(7)+1;i++){

			if(reader.hasNext()){
				word= reader.nextLine();
			}
		}
		//prints out word, should be taken out in real program.
		System.out.println(word);

		//scramples word
		scrambledWord = word.split("");
		for(int i=0; i<word.length(); i++){
			int randomIndex=randGenerator.nextInt(i+1);
			swap(scrambledWord,i,randomIndex);
			
		}
		
		//prints array in form of a string. 
		for(String letters:scrambledWord){
			System.out.print(letters);
		}
		System.out.println("\n");


	}
}