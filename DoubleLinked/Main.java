public class Main{

	public static void main(String[] args){
		DoubleLinked something = new DoubleLinked();
		something.append(1);
		something.append(2);
		something.append(3);
		something.prepend(5);
		something.prepend(6);
		something.printall();
		System.out.println("____");
		DoubleLinked everything = new DoubleLinked(something);	
		everything.append(9);
		everything.prepend(99);
		everything.delete(2);

		everything.printall();
		System.out.println("----3");	
		everything.print
	}

}