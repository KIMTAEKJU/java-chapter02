package chapter02;

public class ArrayUtil {
	// int 배열을 double 배열로 변환
		public static double [] intToDouble( int[] source )
		{
			double[] doubleArr = new double[source.length];
			
			for (int i = 0; i < source.length; i++)
				doubleArr[i] = (double)source[i];
			
			return doubleArr;
		}
		
		// double 배열을 int 배열로 변환
		public static int [] doubleToInt( double[] source )
		{
			int[] intArr = new int[source.length];
			
			for (int i = 0; i < source.length; i++)
				intArr[i] = (int)source[i];
			
			return intArr;
		}
		// int 배열 두 개를 연결한 새로운 배열 리턴
		public static int [] concat( int[] s1, int[] s2 )
		{
			int[] combinationArray = new int[s1.length + s2.length];
			int index = 0;
			
			for(int i : s1)
				combinationArray[index++] = i;
			
			
			for(int i : s2)
				combinationArray[index++] = i;
			
			
			
			return combinationArray;
		}

}
