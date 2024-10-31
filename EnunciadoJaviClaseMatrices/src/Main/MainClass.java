package Main;

public class MainClass {
	public static final int N = 3;
	
	public static void main(String[] args) {
		int[][] matrizBizarra = new int[N][N];
		cargaMatriz(matrizBizarra);
		muestraMatriz(matrizBizarra);
		muestraSilla(matrizBizarra);
		
	}
	
	public static void cargaMatriz(int[][] array) {
		for (int i = 0 ; i < array.length ; i ++ ) {
			for(int j = 0 ; j < array.length ; j ++) {
				array[i][j] = (int) (Math.random() * 90 + 10);
				//Carlos estuvo aqui.
			}
		}
	}
	
	public static void muestraMatriz(int[][] array) {

		for (int i = 0 ; i < array.length ; i ++ ) {
			for(int j = 0 ; j < array.length ; j ++) {
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static void muestraSilla(int[][] array) {
		for (int i = 0 ; i < array.length ; i ++ ) {
			for(int j = 1 ; j < array.length ; j ++) {
				
		}			
	}
}
