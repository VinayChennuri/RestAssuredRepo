package JavaPrograms;

public class ArraysTest {

	public static void main(String[] args) {
		
		int a[] = new int[4];
		a[0] = 10;
		a[1] = 20;
		a[2] = 30;
		a[3] = 40;
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		int b[] = {50,40,30,20,10};
		for(int j=0;j<=a.length;j++)
		{
			System.out.print(b[j]+" ");
		}
		System.out.println();
		
		int c[] = {40,30,20,10};
		for(int k:c)
		{
			System.out.println(k);
		}
	}
	

}
