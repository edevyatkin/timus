import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;

public class Problem1226 {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		Deque<Character> word = new ArrayDeque<>();
		List<Character> strings = new ArrayList<>();

		int ch;
		while ((ch = br.read()) != -1) {
			if (Character.isAlphabetic(ch))
				word.addFirst((char) ch);
			else {
				while (!word.isEmpty())
					strings.add(word.removeFirst());
				strings.add((char) ch);
			}
		}

		for (Character character : strings) {
			System.out.print(character);
		}
	}

}
