package stringTrickyQuestions;

public class Test5 {
	 public static void main(String[] args) {
	 StringBuilder sb = new StringBuilder("Good"); //Line 3
	 change(sb); //Line 4
	 System.out.println(sb); //Line 5
	 }
	 
	 private static void change(StringBuilder s) {
	 s.append("_Morning"); //Line 9
	 }
}
