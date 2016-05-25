import java.util.List;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Scanner;
import java.util.SortedMap;
import java.util.TreeMap;

/*
 * http://acm.timus.ru/problem.aspx?space=1&num=1024
 */

public class Problem1126 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int m = scanner.nextInt();
		int count, i = 0;
		int next, forRemove;
		SortedMap<Integer, Integer> treeMap = new TreeMap<>();
		Deque<Integer> deque = new ArrayDeque<>();
		List<Integer> list = new ArrayList<>();

		while (scanner.hasNextInt()) {
			next = scanner.nextInt();
			if (next == -1)
				break;
			i++;
			count = treeMap.getOrDefault(next, 0);
			treeMap.put(next, ++count);
			deque.push(next);
			if (i >= m) {
				int max = treeMap.lastKey();
				list.add(max);
				forRemove = deque.pollLast();
				count = treeMap.get(forRemove);
				if (count == 1) 
					treeMap.remove(forRemove, 1);
				else
					treeMap.replace(forRemove, --count);
			}
		}
		scanner.close();
		list.stream().forEach(System.out::println);
	}

}
