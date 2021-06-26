import java.util.Scanner;


public class Greeter {
	public void greet(String input) {
		System.out.println("Hello " + input);
		
	}
	
	public static void main(String[] args) {
		Scanner myScanner = new Scanner(System.in);
		System.out.println("What is your firxr name, Sir?");
		String name = myScanner.next();

		
		Greeter greeter = new Greeter();
		greeter.greet(name);
		
		myScanner.nextLine();
		System.out.println("What is your full name, Sir?");
		String fullName = myScanner.nextLine(); // takes the full name 
		greeter.greet(fullName);
		
		
		switch(name){
		case "Ahmad":
			System.out.println("Hi Ahmad");
			break;
		case "Momo":
			System.out.println("Hi MOmo");
			break;
		case "Moe":
			System.out.println("HI Moe");
			break;
		case "Mahmoud":
			System.out.println("WHi mahmoud");
			break;
		case "Ian":
			System.out.println("HI Ian");
			break;
		case "Collin":
			System.out.println("Hi Colling");
			break;
		case "Eddie":
			System.out.println("hi eddie");
			break;
		case "JOe":
			System.out.println("hi joe");
			break;
		default:
			System.out.println("no name");
			
				
			
		}

	}
}
 