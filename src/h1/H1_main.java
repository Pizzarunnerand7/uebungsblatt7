package h1;

public class H1_main {

	public static void main(String[] args) {
		Zahl z;
		z = new Zahl();
		z.setEven();
		z.setPositive();
		z.setSmall();
		System.out.println(z.even);
		System.out.println(z.positive);
		System.out.println(z.small);

	}

}
