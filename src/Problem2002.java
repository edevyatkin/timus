import java.util.HashMap;
import java.util.HashSet;
import java.util.Scanner;

/*
 * http://acm.timus.ru/problem.aspx?space=1&num=2002
 */

public class Problem2002 {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		
		sc.nextLine();
		
		HashMap<String, String> users = new HashMap<>();
		HashSet<String> loggedusers = new HashSet<>();
		
		while (num > 0 && sc.hasNextLine()) {
			String str = sc.nextLine();
			String[] parts  = str.split(" ");
			switch (parts[0]) {
			case "register":
				if (!users.containsKey(parts[1])) {
					users.put(parts[1], parts[2]);
					System.out.println("success: new user added");
				}
				else
					System.out.println("fail: user already exists");
				break;
			case "login":
				if(!users.containsKey(parts[1]))
					System.out.println("fail: no such user");
				else if (!parts[2].equals(users.get(parts[1])))
						System.out.println("fail: incorrect password");
				else if (loggedusers.contains(parts[1]))
						System.out.println("fail: already logged in");
				else {
					loggedusers.add(parts[1]);
					System.out.println("success: user logged in");
				}

				break;
			case "logout":
				if(!users.containsKey(parts[1]))
					System.out.println("fail: no such user");
				else if (!loggedusers.contains(parts[1]))
					System.out.println("fail: already logged out");	
				else {
					loggedusers.remove(parts[1]);
					System.out.println("success: user logged out"); 
				}
				break;	
			default:
				break;
			}
			
			num--;
		}
		sc.close();
	}

}
