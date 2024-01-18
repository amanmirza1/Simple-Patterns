import java.util.Scanner;

public class SimplePatterns {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows;
        int columns;
        String symbol ="";
        System.out.println("Enter the number of rows: ");
        rows = scanner.nextInt();
        System.out.println("Enter the number of column: ");
        columns = scanner.nextInt();
        System.out.println("Enter Symbol to use: ");
        symbol = scanner.next();
        for (int i=1; i<=rows;i++) {
            System.out.println();
            for (int j = 1; j <= columns; j++) {
                System.out.print(symbol);
            }
        }
    }
}

