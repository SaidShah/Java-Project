package priorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {

		PriorityQueues pQue = new PriorityQueues(5);
		
		pQue.insert(25);
		pQue.insert(125);
		pQue.insert(2);
		pQue.insert(365);
		pQue.insert(21);
		
		while(!pQue.isEmpty()) {
			long item = pQue.remove();
			System.out.print(item+", ");
		}
			System.out.println();
	}

}
