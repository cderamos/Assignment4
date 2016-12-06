public class Test {
	
	public static void main(String[]args){
		StudentInfo.display();
		//Test one
		LinkedList<String> linkedList = new LinkedList<String>();
		LinkedList<String> linkedList2 = new LinkedList<String>();
		
		String[] one = {"a","b","c","d"};
		String[] two = {"e","f"};
		
		for(int i=0;i<one.length;i++)
		{
			linkedList.addLast(one[i]);
		}
		for(int j=0;j<two.length;j++){
			linkedList2.addLast(two[j]);
		}
		System.out.println("TEST ONE");
		linkedList.insertAfter("a", linkedList2);
		
		//Test two
		LinkedList<String> linkedList5 = new LinkedList<String>();
		LinkedList<String> linkedList6 = new LinkedList<String>();
		
		String[] five = {"a","b"};
		String[] six = {"c","d"};
		
		for(int i=0;i<five.length;i++)
		{
			linkedList5.addLast(five[i]);
		}
		for(int j=0;j<two.length;j++){
			linkedList6.addLast(six[j]);
		}
		System.out.println("TEST TWO");
		linkedList5.insertAfter("b", linkedList6);
		
		
	}
	

}
