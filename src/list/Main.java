package list;


public class Main {

	public static void main(String[] args) {
		MyList mylist = new MyList(15);//Creating an object with data field
		System.out.println(mylist.toString());
		System.out.println("This list is empty => " + mylist.isEmpty());//Testing if list is empty or not
		MyList mylist1 = new MyList();
		System.out.println("This list is empty => " + mylist1.isEmpty());

	}

}
