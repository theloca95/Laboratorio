package it.uniud.poo;

public class Esercizio1 {
	/** The mission of this class is to provide a number of * standalone procedures that can be useful for manipulating * n x m matrices of ints. **/
	public static void main (String args[]) { 
		int[][] arr1 = { { 1,2,3,4},{11,12,13,14}, {21,22,23,24}}; 
		int[][] arr2 = { { 1,1},{2,2},{3,3},{0,0}};
//		TODO assert and exceptions (throw, catch and try) 
		System.out.println("Input: ");
		printmatrix(arr1);
		int[][] res = transpose(arr1);
		System.out.println("Transposed: ");
		printmatrix(res);
		int[][] res2 = multiply(arr1,arr2);
		System.out.println("Mupltiplication: ");
		printmatrix(res2);
//		TODO assert and exceptions (throw, catch and try) 
		}
	/** compute the transpose matrix of m: result[i,j]=m[j,i] */ 
	//m[0] does not result in an IndexOutOfBoundsException
	public static int[][] transpose (int[][] m){ 
		int[][] temp = new int[m[0].length][m.length];
		for (int i = 0; i < m.length; i++)
            for (int j = 0; j < m[0].length; j++)
                temp[j][i] = m[i][j];
        return temp;
	}


	/** compute matrix multiplication of m1 with m2: result[i,j] = sum_over_h(m1[i,h]*m2[h,j]) */
	public static int[][] multiply (int[][] m1, int[][] m2){ 
		int[][] temp = new int[m1.length][m2[0].length];
		for (int i = 0; i < m1.length; i++) { // aRow
            for (int j = 0; j < m2[0].length; j++) { // bColumn
                for (int k = 0; k < m1[0].length; k++) { // aColumn
                    temp[i][j] += m1[i][k] * m2[k][j];
                }
            }
        }
        return temp;
		
	}
	
//--------------DEBUG-----------------------
	public static void printmatrix(int[][] m){
		for (int i = 0; i < m.length; i++) {
			System.out.print("|");
		    for (int j = 0; j < m[0].length; j++) {
		    	System.out.format("%4d ", m[i][j]);	
		    }
		    System.out.print("|\n");
		}
	}
	
	
}
