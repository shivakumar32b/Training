package com.assignments;

class Matrix {
	private int rows;
	private int columns;
    private int[][] data;

	public Matrix(int rows, int columns) {
		this.rows = rows;
		this.columns = columns;
        this.data = new int[rows][columns];
	}

	public  void fillMatrix(int[][] values) {
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                data[i][j] = values[i][j];
            }
        }
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                System.out.print(data[i][j] + "\t");
            }
            System.out.println();
        }
	}

}

public class ConstructorsTask {
	public static void main(String[] args) {
		Matrix matrix = new Matrix(3, 3);
		int[][] values = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		
        matrix.fillMatrix(values);

	}
}
