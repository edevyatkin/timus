import java.io.IOException;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Stack;

public class Problem1226 {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		Stack<Character> word = new Stack<>();
		List<Character> strings = new ArrayList<>();

		while (sc.hasNextLine()) {
			String n = sc.nextLine();
			StringReader sr = new StringReader(n);
			int ch;
			while ((ch = sr.read()) != -1) {
				if (Character.isAlphabetic(ch))
					word.push((char) ch);
				else {
					while (!word.isEmpty())
						strings.add(word.pop());
					strings.add((char) ch);
				}
			}
			strings.add((char) Character.LINE_SEPARATOR);
		}
		sc.close();

		for (Character character : strings) {
			System.out.print(character);
		}
	}

}
