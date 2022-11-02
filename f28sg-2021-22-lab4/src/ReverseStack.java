public class ReverseStack {


	/*
	 * 1: complete implementation
	 */
	public static void reverseStack(Stack st){
		Queue queue = new Queue(5);

		while (!st.isEmpty()) {
			queue.enqueue(st.pop());
		}

		while (!queue.isEmpty()) {
			st.push(queue.dequeue());
		}

	}
	
	
	
	
}
