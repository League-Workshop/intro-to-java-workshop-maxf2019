package section4;

import javax.swing.JOptionPane;

public class QuizGame {
	
	public static void main(String[] args) {
		
		// 1.  Create a variable to hold the user's score 
		int score = 0;
		
		// 2.  Ask the user a question 
		String a =JOptionPane.showInputDialog("What is 1+1?");
		
		// 3.  Use an if statement to check if their answer is correct
		if(a.equals("2")) {
			score ++;
			System.out.println("Your score is now "+score+". Congartulations, you have 99999999999 to go!");
		}
		String b =JOptionPane.showInputDialog("What is 10+9?");
		if(b.equals("21")) {
			score ++;
			System.out.println("Hey stinky! Your score is now "+score+"");
			
		}
		String c= JOptionPane.showInputDialog("3rd Question. Baby Shark Doo Doo Doo Doo ___?");
		if(c.equals("Doo")) {
			score ++;
			System.out.println("Wow! You passed your meme test. Your score is now "+score+"");
			}
		String d= JOptionPane.showInputDialog("When you try your best and ___ chungus doesn't suceed.");
		if(d.equals("big")) {
			score ++;
			System.out.println("You passed question 4.Your score is "+score+" Very Good.");
		}
		String e= JOptionPane.showInputDialog("What is 3 times 4 divided 2 times 3?");
		if(e.equals("18")) {
			score ++;
			System.out.println("Hey, you passed question number 5! Your score is "+score+"");
		}
		String f= JOptionPane.showInputDialog("What am I trying to say? SKiTolz. Answer without capitals please.");
		if(f.equals("skittles")) {
			score ++;
			System.out.println("Awesome. Your score is now "+score+".");
		}
		String g=JOptionPane.showInputDialog("Harder Version: What am I trying to say? (No capitals please) 4t-nait");
		if(g.equals("fortnite")) {
			score ++;
			System.out.println("Wow, your score is now"+score+".");
		}
		String  h=JOptionPane.showInputDialog("Typo");
		if(h.equals("o")) {
			score ++;
			System.out.println("Amazing! Your score increased by 1 and is now "+score+".");
		}
		
		
		
    	// 4.  if the user's answer is correct
		
		// -- add one to their score 
		
		// 5.  Create more questions by repeating steps 1, 2, and 3 below. 
		
		// 6.  After all the questions have been asked, print the user's score 
		
	}
}
