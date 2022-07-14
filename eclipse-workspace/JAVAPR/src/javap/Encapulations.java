package javap;

class Encap{
	private int rollNo;
	String name;
	public void set(int RollNo, String Name) {
		rollNo = RollNo;
		name = Name;
	}
	public int get() {
		return rollNo;
	}
}

public class Encapulations {

	public static void main(String[] args) {
		Encap e = new Encap();
		e.set(12, "Rahul");
		System.out.println(e.get());
	}

}
