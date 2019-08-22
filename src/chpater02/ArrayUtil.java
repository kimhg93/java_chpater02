package chpater02;

public class ArrayUtil {
	public static double[] IntToDouble(int[] source) {
		double[] result = new double[source.length];
		
		for(int i=0; i<source.length; i++) {
			result[i] = source[i];
		}		
		return result;
	}
	public static int[] IntToDouble(double[] source) {
		int[] result = new int[source.length];
		for(int i=0; i<source.length; i++) {			
			result[i] = (int)source[i];
		}		
		return result;
	}
	public static int[] concat(int[] s1, int[] s2) {
		int result[] = new int[s1.length+s2.length];
		int index = 0;
		for(int i=0; i<s1.length; i++) {
			result[index++] = s1[i];
		}
		for(int i=0; i<s2.length; i++) {
			result[index++] = s2[i];
		}
		
		return result;
	}
}
