package JavaPrograms;

public interface InterfaceTest {
	
	void print();
	void scan();

}

class ITTest implements InterfaceTest {

	public void print() {
		System.out.println("Print Success");
	}

	public void scan() {
		System.out.println("San Success");
	}
	public static void main(String[] args) {
		ITTest ob = new ITTest();
		ob.print();
		ob.scan();
	}
}
