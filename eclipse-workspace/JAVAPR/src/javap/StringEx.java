package javap;

public class StringEx {

	public static void main(String[] args) {
		String a = "Rahul";
		String b = "Ghatage";
		String c = a.concat(b);
		boolean d = a.equals(c);
		System.out.println(c);
		System.out.println(d);
		String s = "Rahul Ghatage";
		String arr[] = s.split("");
		System.out.println(arr.length);
		for(int i=arr.length-1; i>=0; i--) {
			System.out.println(arr[i]);
		}
		}

}
