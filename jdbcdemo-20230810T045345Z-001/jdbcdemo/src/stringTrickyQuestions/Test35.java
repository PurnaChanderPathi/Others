package stringTrickyQuestions;

public class Test35 {
	 public static void main(String[] args) {
	 String str = "Game on"; //Line n1
	 StringBuilder sb = new StringBuilder(str); //Line n2
	 
	 System.out.println(str.contentEquals(sb)); //Line n3
	 System.out.println(sb.contentEquals(str)); //Line n4
	 System.out.println(sb.equals(str)); //Line n5
	 System.out.println(str.equals(sb)); //Line n6
	 }
	}