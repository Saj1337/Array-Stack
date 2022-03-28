package arrayStackCode;
import java.util.*;
import java.util.Stack;

public class arrayStack {
		private int arrayy[];
		private int first;
		private int storage;
		
		// Constructor to define stack
		
		arrayStack(int size)
		{
		arrayy = new int[size];
		storage = size;
		first = -1;
	}

public void push(int x) {
			if (isFull()) {
				System.out.println("OverFlow\nProgram Terminated\n");
				System.exit(1);
			}
			System.out.println("placing " + x);
			arrayy[++first] = x;
		} // Utility function to pop first element from the stack
		public int pop() {
			// check for stack underflow
			if (isEmpty()) {
				System.out.println("UnderFlow\nProgram Terminated");
				System.exit(1);
			}
			System.out.println("erasing " + peek());
			// decrease stack size by 1 and (optionally) return the popped element
			return arrayy[first--];
		}
		
public int peek() {
			if (!isEmpty())
			return arrayy[first];
			else
			System.exit(1);
			return -1;
			}
			// Utility function to return the size of the stack
			public int size() {
			return first + 1;
			}
			// Utility function to check if the stack is empty
			public Boolean isEmpty() {
			return first == -1; // or return size() == 0;
			}
			// Utility function to check if the stack is full or not
			public Boolean isFull() {
			return first == storage - 1; // or return size() == storage;
}
			
public static void main (String[] args) {
				arrayStack stack = new arrayStack(5);
				stack.push(1); // placing 1 in the stack
				stack.push(2); // placing 2 in the stack
				stack.pop(); // erasing the first 2
				stack.pop(); // erasing the first 1
				stack.push(3); // placing 3 in the stack
				stack.push(4); // placing 4 in the stack
				stack.push(5); // placing 5 in the stack
				System.out.println("Top element: " + stack.peek());
				System.out.println("The stack size: " + stack.size());
				stack.pop(); // erasing the first 3
				// check if stack is empty
				if (stack.isEmpty())
				System.out.println("Stack = Empty");
				else
				System.out.println("Stack != Empty");
				}
}


	