import java.util.Scanner;

public class Max {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter row of Matrix : ");
        int row = sc.nextInt();
        System.out.print("Enter colum of Matrix : ");
        int colum = sc.nextInt();
        int[][] array = new int[row][colum];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print("Enter element of Matrix: " + "index :" + i + j+ ": ");
                array[i][j]=sc.nextInt();
            }
        }
        System.out.println("The Max number is " + findMax(array));
    }
    public static int findMax(int[][]arr){
        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j]> max){
                    max = arr[i][j];
                }
            }
        } return max;
    }
}
