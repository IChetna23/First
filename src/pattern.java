import java.util.Scanner;

public class pattern {
    private static String var;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter no of rows: ");
        int row = sc.nextInt();
        System.out.println("enter variable");
        String var = sc.next();
//        System.out.println("enter no of columns: ");
//        int column = sc.nextInt();
//        for(int i =0; i<row; i++){
//            for(int j = 0; j<column; j++){
//                System.out.println("*");
//            }
//        }

        int i, j;
        // outer loop to handle number of rows
        int a;
        for(i = 0; i < row; i++){
            for(j= 0; j<=i; j++ ){
                System.out.print(var);
            }
            System.out.println();
        }
    }
}
