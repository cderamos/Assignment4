/* ITI 1121/1521. Introduction to Computer Science II
 * Assignment/Devoir 4
 *
 * Marcel Turcotte
 */

import java.util.NoSuchElementException;

public class SinglyLinkedList<E> {

    private static class Node<T> {
        private T value;
        private Node<T> next;
        private Node(T value, Node<T> next) {
            this.value = value;
            this.next  = next;
        }
    }

    // Instance variable

    private Node<E> head;

    //  ----------------------------------------------------------
    //  SinglyLinkedList methods
    //  ----------------------------------------------------------

    public void addFirst( E item ) {
        if (item == null) {
            throw new NullPointerException("Illegal argument");
        }

        head = new Node<E>(item, head);
    }

    public boolean isEmpty() { 
        return head == null; 
    }

	public SinglyLinkedList<E> take(int n) {
		//Declare variables/objects
    	SinglyLinkedList<E> list = new SinglyLinkedList<E>();
    	Node<E> top = head.next.next;
    	int counter = 0;
    	
    	//While the counter doesn't equal user input..
    	while(counter!=n){
        	if(n>=0){
        		list.addFirst(top.value);//Add the top of the node's value to the list
        		top = top.next;//Iterate
        		counter++;//Increment counter
        		take(n-1);//Call function
        	}
    	}
    	//Return list
    	return list;
	}
   


    //  ----------------------------------------------------------
    //  Other instance methods
    //  ----------------------------------------------------------

    @Override
    public String toString() {
        return "{" + toString(head) + "}";
    }

    private String toString(Node<E> p) {
        String result = "";

        if (p != null) {
            result = p.value.toString();
            if (p.next != null) {
                result = result + "," + toString(p.next);
            }
        }
        return result;
    }
}
