package list;


public class Main {

	public static void main(String[] args) {
		MyList mylist = new MyList(15);//Creating an object with data field
		System.out.println(mylist.toString());
		System.out.println("This list is empty => " + mylist.isEmpty());//Testing if list is empty or not
		MyList mylist1 = new MyList();
		System.out.println("This list is empty => " + mylist1.isEmpty());//Testing if list is empty or not
		
		
		mylist.toArray();//The new Array of Objects
		
		MyList copyList = mylist.copy();
		System.out.println(mylist.toString() + "is equal to " + copyList.toString());

	}

}
