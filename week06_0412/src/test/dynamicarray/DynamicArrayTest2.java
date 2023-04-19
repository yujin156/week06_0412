package test.dynamicarray;

public class DynamicArrayTest2 {

	public static void main(String[] args) {
		int[] cols = {2,5,3};
		int [] [] dArr = new int [3][];
		
		int cnt = 1;
		
		for(int i =0; i<dArr.length; i++) {
			dArr[i] = new int[cols[i]];
			
			for(int j =0; j<dArr[i].length; j++) {
				dArr[i][j] = cnt++;
			}
		}
		for (int i = 0; i< dArr.length; i++) {
			for (int j = 0; j < dArr[i].length; j++) {
				System.out.print(dArr[i][j]+ "\t");
				
			}
			System.out.println();
		}
	}
}
