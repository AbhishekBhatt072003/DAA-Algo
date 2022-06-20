import java.util.*;

class Main {
	static ArrayList<String> arr = new ArrayList<String>();

	static void permute(String s, String answer) {
		if (s.length() == 0) {
			arr.add(answer);
			return;
		}
		for (int i = 0; i < s.length(); i++) {
			char ch = s.charAt(i);
			String left_substr = s.substring(0, i);
			String right_substr = s.substring(i + 1);
			String rest = left_substr + right_substr;
			permute(rest, answer + ch);
		}
	}

	public static void main(String args[]) {
		Scanner scan = new Scanner(System.in);
		String s;
		String answer = "";
		System.out.print("Enter the string : ");
		s = scan.next();
		System.out.print("\nAll possible strings are : ");
		permute(s, answer);

		Collections.sort(arr);
		System.out.println(arr);
	}
}