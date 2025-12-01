package p1;

public class P1_main {

	public static void main(String[] args) {
		

	}
	public static void multFrac(int z1, int n1, int z2, int n2) {
		int z3 = z1*z2;
		int n3 = n1*n2;
		System.out.println(z3+":"+n3);
	}
	public static void multFrac(Bruch a, Bruch b) {
		int zaehler = a.z*b.z;
		int nenner = a.n*b.n;
		System.out.println(zaehler+":"+nenner);
	}

}
