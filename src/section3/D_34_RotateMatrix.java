package section3;

public class D_34_RotateMatrix {
    public int[][] rotateMatrix(int[][] matrix, int K) {
        if(matrix == null || matrix.length == 0) {
            return matrix;
        }

        int N = matrix.length;
        int M = matrix[0].length;

        int rotateNum = K % 4;

        if(rotateNum == 0) {
            return matrix;
        }

        int[][] rotated = rotateNum % 2 == 1 ? new int[M][N] : new int[N][M];

        for(int row = 0; row < rotated.length; row++) {
            for(int col = 0; col < rotated[row].length; col++) {
                if(rotateNum == 1) {
                    rotated[row][col] = matrix[N - col - 1][row];
                } else if(rotateNum == 2) {
                    rotated[row][col] = matrix[N - row - 1][M - col - 1];
                } else {
                    rotated[row][col] = matrix[col][M - row - 1];
                }
            }
        }
        return rotated;
    }
}
