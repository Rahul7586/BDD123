package javap;


class FunctionOver{
	public void mathsCal(int a, int b) {
		int c = a+b;
		System.out.println(+c);
	}
}

class FunctionOver2 extends FunctionOver{
	@Override
	public void mathsCal(int a, int b) {
		int c = a-b;
		System.out.println(+c);
	}
}

public class FunctionOverride {

	public static void main(String[] args) {
		FunctionOver fun = new FunctionOver();
		fun.mathsCal(12, 12);
		FunctionOver fun2 = new FunctionOver2();
		fun2.mathsCal(12, 12);
	}

}
