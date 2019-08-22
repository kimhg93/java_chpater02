package chpater02;

public class ArrayUtilTest {

	public static void main(String[] args) {
		int[] a1 = {10,11,12,13};
		double[] d1 = ArrayUtil.IntToDouble(a1);
		for(double d : d1) { //for(int i=0; i<d1.length; i++); d1[i]
			System.out.print(d+" ");
		}
		System.out.println();
		
		double[] d2 = {0.0, 1.1, 2.2, 3.3};
		int[] a2 = ArrayUtil.IntToDouble(d2);
		for(int d : a2) { //for(int i=0; i<d1.length; i++); d1[i]
			System.out.println(d+" ");
		}
		System.out.println();
		int[] a3 = ArrayUtil.concat(a1, a2);
			for(int d : a3) { //for(int i=0; i<d1.length; i++); d1[i]
				System.out.print(d+" ");
		}		
	}

}
