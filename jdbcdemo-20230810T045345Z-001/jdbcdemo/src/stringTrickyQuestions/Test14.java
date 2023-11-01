package stringTrickyQuestions;

public class Test14 {
	 public static void main(String[] args) {
	 StringBuilder sb = new StringBuilder(5);
	 sb.append("0123456789");
	 sb.delete(8, 1000);
	 System.out.println(sb);
	 }
}
