package Revise;

import java.util.*;

public class testtttt {
    public static void solo(int N) {
        char[][] arr = new char[N][3];
        solu(arr, 0, 0, 0, N - 1);

    }

    public static long solu(char[][] arr, int row, int col, long count, int N) {
        if (row > N) {
            count = count + 1;
            return count;
        } else if (row == 0 && col == 0) {
            arr[0][0] = 'R';
            count = solu(arr, row, col + 1, count, N);
            arr[0][0] = 'G';
            count = solu(arr, row, col + 1, count, N);
            arr[0][0] = 'B';
            count = solu(arr, row, col + 1, count, N);
            System.out.println("count: " + count);
        } else if (row == 0 && col == 1) {
            if (arr[0][0] == 'R') {
                arr[0][1] = 'G';
                count = solu(arr, row, col + 1, count, N);
                arr[0][1] = 'B';
                count = solu(arr, row, col + 1, count, N);
            } else if (arr[0][0] == 'G') {
                arr[0][1] = 'R';
                count = solu(arr, row, col + 1, count, N);
                arr[0][1] = 'B';
                count = solu(arr, row, col + 1, count, N);
            } else if (arr[0][0] == 'B') {
                arr[0][1] = 'R';
                count = solu(arr, row, col + 1, count, N);
                arr[0][1] = 'G';
                count = solu(arr, row, col + 1, count, N);
            }

            return count;
        } else if (row == 0 && col == 2) {
            if (arr[0][1] == 'R') {
                arr[0][2] = 'G';
                count = solu(arr, row + 1, 0, count, N);
                arr[0][2] = 'B';
                count = solu(arr, row + 1, 0, count, N);
            } else if (arr[0][1] == 'G') {
                arr[0][2] = 'R';
                count = solu(arr, row + 1, 0, count, N);
                arr[0][2] = 'B';
                count = solu(arr, row + 1, 0, count, N);
            } else if (arr[0][1] == 'B') {
                arr[0][2] = 'R';
                count = solu(arr, row + 1, 0, count, N);
                arr[0][2] = 'G';
                count = solu(arr, row + 1, 0, count, N);
            }

            return count;
        } else if (row > 0 && row <= N && col == 0) {
            if (arr[row - 1][0] == 'R') {
                arr[row][0] = 'G';
                count = solu(arr, row, col + 1, count, N);
                arr[row][0] = 'B';
                count = solu(arr, row, col + 1, count, N);
            } else if (arr[row - 1][0] == 'G') {
                arr[row][0] = 'R';
                count = solu(arr, row, col + 1, count, N);
                arr[row][0] = 'B';
                count = solu(arr, row, col + 1, count, N);
            } else if (arr[row - 1][0] == 'B') {
                arr[row][0] = 'R';
                count = solu(arr, row, col + 1, count, N);
                arr[row][0] = 'G';
                count = solu(arr, row, col + 1, count, N);
            }

            return count;
        } else if (row > 0 && row <= N && col == 2) {
            if (arr[row - 1][2] == 'R') {
                if (arr[row][col - 1] == 'B') {
                    arr[row][2] = 'G';
                    count = solu(arr, row + 1, 0, count, N);
                } else if (arr[row][col - 1] == 'G') {
                    arr[row][2] = 'B';
                    count = solu(arr, row + 1, 0, count, N);
                } else if (arr[row][col - 1] == 'R') {
                    arr[row][2] = 'G';
                    count = solu(arr, row + 1, 0, count, N);
                    arr[row][2] = 'B';
                    count = solu(arr, row + 1, 0, count, N);
                }
            } else if (arr[row - 1][2] == 'B') {
                if (arr[row][col - 1] == 'R') {
                    arr[row][2] = 'G';
                    count = solu(arr, row + 1, 0, count, N);
                } else if (arr[row][col - 1] == 'G') {
                    arr[row][2] = 'R';
                    count = solu(arr, row + 1, 0, count, N);
                } else if (arr[row][col - 1] == 'B') {
                    arr[row][2] = 'G';
                    count = solu(arr, row + 1, 0, count, N);
                    arr[row][2] = 'R';
                    count = solu(arr, row + 1, 0, count, N);
                }
            } else if (arr[row - 1][2] == 'G') {
                if (arr[row][col - 1] == 'B') {
                    arr[row][2] = 'R';
                    count = solu(arr, row + 1, 0, count, N);
                } else if (arr[row][col - 1] == 'R') {
                    arr[row][2] = 'B';
                    count = solu(arr, row + 1, 0, count, N);
                } else if (arr[row][col - 1] == 'G') {
                    arr[row][2] = 'B';
                    count = solu(arr, row + 1, 0, count, N);
                    arr[row][2] = 'R';
                    count = solu(arr, row + 1, 0, count, N);
                }
            }

            return count;
        } else if (row > 0 && row <= N && col == 1) {
            if (arr[row][0] == 'R') {
                if (arr[row - 1][1] == 'G') {
                    arr[row][1] = 'B';
                    count = solu(arr, row, col + 1, count, N);
                } else if (arr[row - 1][1] == 'B') {
                    arr[row][1] = 'G';
                    count = solu(arr, row, col + 1, count, N);
                } else if (arr[row - 1][1] == 'R') {
                    arr[row][1] = 'G';
                    count = solu(arr, row, col + 1, count, N);
                    arr[row][1] = 'B';
                    count = solu(arr, row, col + 1, count, N);
                }
            } else if (arr[row][0] == 'G') {
                if (arr[row - 1][1] == 'R') {
                    arr[row][1] = 'B';
                    count = solu(arr, row, col + 1, count, N);
                } else if (arr[row - 1][1] == 'B') {
                    arr[row][1] = 'R';
                    count = solu(arr, row, col + 1, count, N);
                } else if (arr[row - 1][1] == 'G') {
                    arr[row][1] = 'R';
                    count = solu(arr, row, col + 1, count, N);
                    arr[row][1] = 'B';
                    count = solu(arr, row, col + 1, count, N);
                }
            } else if (arr[row][0] == 'B') {
                if (arr[row - 1][1] == 'G') {
                    arr[row][1] = 'R';
                    count = solu(arr, row, col + 1, count, N);
                } else if (arr[row - 1][1] == 'R') {
                    arr[row][1] = 'G';
                    count = solu(arr, row, col + 1, count, N);
                } else if (arr[row - 1][1] == 'B') {
                    arr[row][1] = 'G';
                    count = solu(arr, row, col + 1, count, N);
                    arr[row][1] = 'R';
                    count = solu(arr, row, col + 1, count, N);
                }
            }

            return count;
        }

        return count;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        solo(N);
        sc.close();
    }
}