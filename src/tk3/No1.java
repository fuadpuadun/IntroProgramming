package tk3;

import java.util.Scanner;

public class No1 {
	  public static void main(String[] args) {
		  boolean next = true;
		  int score=0;
		  
		  Scanner input = new java.util.Scanner(System.in);
		  
		  
		  label:
		  while(next) {
			  System.out.println(""
		                +"Coepoe Word Puzzle"+"\n"
		                +"=================="+"\n"
		                +""+"\n"+"Rules : "+"\n"
		                +"1. Create a word using given characters, min 3characters & max 6 characters."+"\n"
		                +"2. Each level, You have 10 chances to answer correctly."+"\n"
		                +"3. To get through to next level, you have to score 70points each level."+"\n"
		                +"\n"
		                +"Press Enter to START!");
			  
			  //get enter
			  input.nextLine();
			  
			  score = level1(score);
			  //Test
			  //System.out.print (score);
			  
			  if(score > 70) {
				  score = 0;
			  }
			  
			  //develop to level 2
			  //score = level2(score);
			  
			  if(score > 70) {
				  score = 0;
			  }
			  
			  //develop to level 3
			  //score = level3(score);
			  
		      System.out.print ("\n Anda mau ulang [y/t] : ");
		      String check = input.nextLine();
		      
		      if (check.equalsIgnoreCase ("Y"))
					next = true;
				else if (check.equalsIgnoreCase ("T"))
					next = false;
				else {
					System.out.print ("Input yang diberikan salah !\n");
					continue label;
				}
		  }
	  }
	  
	  public static int level1(int score) {
		  //init KJ
		  String[] level1={"","die","led","lei","let","lid","lie","lit","tie","deli","diet","\n",
                  "edit","idle","lied","tide","tied","tile","tilt","tilde","tiled","title","\n",
                  "tilted","titled"};
		  String[] checker = new String[10];
		  int x=0;
		  boolean test;
		  
		  Scanner scan = new java.util.Scanner(System.in);
		  
		  String guess="";
		  
		  for(int i= 1; i<=10;i++) {
			  System.out.print(i+"> Your Answer: ");
			  guess=scan.nextLine();
			  
			  //check strLength
			  if(guess.length()>=3 && guess.length()<=6) {
				  for(int j= 0; j<= level1.length - 1;j++) {
					  if(guess.equals(level1[j])) {						  
						  for(int k= 0; k<= checker.length - 1;k++) {
							  if(guess.equals(checker[k])) {
								  System.out.println("You had already type this word before..");
								  k=checker.length;
							  } else if(k==checker.length-1) {
								  score+=10;
								  System.out.println("#Right. Score : " + score);
								  checker[x] = guess;
								  k=checker.length;
								  x++;
							  }
						  }
					  }
				  }
			  } else System.out.println("Answer too short");
		  }
		  return score;
	  }
}