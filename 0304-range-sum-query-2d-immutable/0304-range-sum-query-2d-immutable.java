class NumMatrix {
    int[][] matrix;

    public NumMatrix(int[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) return;
        
        int rows = matrix.length;
        int cols = matrix[0].length;

        
        for (int i = 0; i < rows; i++) {
            for (int j = 1; j < cols; j++) {
                matrix[i][j] += matrix[i][j - 1];
            }
        }

    
        for (int j = 0; j < cols; j++) {
            for (int i = 1; i < rows; i++) {
                matrix[i][j] += matrix[i - 1][j];
            }
        }
        
        this.matrix = matrix;
    }
    
    public int sumRegion(int row1, int col1, int row2, int col2) {
        int total = matrix[row2][col2];
        
        
        int top = (row1 > 0) ? matrix[row1 - 1][col2] : 0;
        int left = (col1 > 0) ? matrix[row2][col1 - 1] : 0;
        int topLeft = (row1 > 0 && col1 > 0) ? matrix[row1 - 1][col1 - 1] : 0;
        
        
        return total - top - left + topLeft;
    }
}
