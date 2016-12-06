

public class ListUtil {
	
	public static<E> LinkedList<Integer> indexOfAll(LinkedList<E> list, E obj) {
		//Declare new linked list and counter
		LinkedList<Integer> potter = new LinkedList<Integer>();
		int counter = 0;
		
		Iterator<E> iter = list.iterator();
		
		while(iter.hasNext()){
			if(iter.next()==obj){
				potter.addLast(new Integer(counter));
			}
			counter++;
		}
		//Return linked list
		return potter;
		
	}
}
