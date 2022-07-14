package javap;

	class FunctionTest{
		public void add(int a, int b) {
			int c = a+b;
			System.out.println(+c);
		}
		public void add(String ABC, String PQR) {
			String RAG = ABC + PQR;
			System.out.println(""+RAG);
		}
		public void add(double a, double b) {
			double d = a + b;
			System.out.println(+d);
		}
	}
	
	public class FunctionOverload {
		
	public static void main(String[] args) {
		FunctionTest test = new FunctionTest();
		test.add(123, 456);
		test.add("Rahul", "Ghatage");
		test.add(12569635, 87995669);
	}

}
