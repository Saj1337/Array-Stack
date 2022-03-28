import java.util.Stack;

public class friendStackProgram {
	
	public static void main(String[] args) {
		// Creating a Stack
		Stack<String> theFriends = new Stack<>();
		// Pushing new items to the Stack
		theFriends.push("Fawaz");
		theFriends.push("Habib");
		theFriends.push("Tharindu");
		theFriends.push("Luthfur");
		theFriends.push("Raqeeb");
		System.out.println("Stack => " + theFriends);
		System.out.println();
		// Popping items from the Stack
		String friendFirst = theFriends.pop(); // Throws EmptyStackException if the stack is empty
		System.out.println("Stack.pop(): " + friendFirst);
		System.out.println("Current Stack: " + theFriends);
		System.out.println();
		// Get the item at the top of the stack without removing it
		friendFirst = theFriends.peek();
		System.out.println("Stack.peek(): " + friendFirst);
		System.out.println("Current Stack: " + theFriends);
		}
}