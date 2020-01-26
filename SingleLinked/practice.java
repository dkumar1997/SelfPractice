public class practice{
	public static void main(String[] args){
		LinkedList volume = new LinkedList();
		volume.append(1);
		volume.append(2);
		volume.append(3);
		volume.printall();
		System.out.println("----");
		LinkedList everything = new LinkedList(volume);
		everything.append(5);
		everything.printall();
		everything.delete(1);
		everything.delete(2);
		everything.prepend(6);
		everything.prepend(7);
		System.out.println("----");
		everything.printall();

	}
}