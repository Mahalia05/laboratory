public class GONOWON_lab1 {
    public static void main(String[] args) {
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter number: ");
        int n = scanner.nextInt();
        
        System.out.println("*");
        
        // Upper Section
        for (int i = 1; i <= n; i++) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("*");
        }
        
        // Bottom Section
        for (int i = n - 1; i >= 1; i--) {
            System.out.print("*");
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int j = i - 1; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println("*");
        }
        
        System.out.println("*");
        
        scanner.close();
    }
}