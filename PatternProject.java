import java.util.Scanner;
public class PatternProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = 5; // Fixed number of rows
        System.out.println("=== Pattern Generator ===");
        System.out.println("Fixed rows: " + n);
        System.out.println("Choose a pattern to print (1 to 5):");
        System.out.println("1. Right Triangle\n2. Butterfly\n3. Hollow Square\n4. Hollow Diamond\n5. Solid Rectangle");

        int choice = sc.nextInt();

        System.out.println("\nPattern Output:\n");

        switch (choice) {
            case 1:
                // Pattern 1: Right Triangle
                for (int i = 1; i <= n; i++) {
                    for (int j = 1; j <= i; j++) {
                        System.out.print("* ");
                    }
                    System.out.println();
                }
                break;

            case 2:
                // Pattern 2: Butterfly
                {
        for(int i =1;i<=(n*2)-1 ;i++ ){
            for(int j=1;j<=n+n-1 ;j++){
                System.out.print((i<=n)?(j<=i || j>=(n+n-i))?"*":" ":(j<=(n-(i-n))||j>=(n+(i-n))?"*":" ")) ;
            }
            System.out.println("");
        }
    }
                break;

            case 3:
                // Pattern 3: Hollow Square
                 for(int i=1; i<=n; i++){
                    for(int j=1; j<=n; j++){
                        if(i==1 || j==1 || i==n || j==n){
                            System.out.print("*");
                            } else {
                            System.out.print(" ");
                        }
                    }
                    System.out.println();
                }
                break;

            case 4:
                // Pattern 4: Hollow Diamond
		for(int i =1;i<n+n-1;i++){
			for (int j =1;j<=n+n-1;j++){
				System.out.print((j<=n-i+1|| j>(n+i-2)||(i>=n && (j<=(i-n+1)||j>=n+n-(i-n+1))))?"*":" ");
			}
			        System.out.println();
	            }
            
        
                break;

            case 5:
                // Pattern 5: Solid Rectangle
                for (int i=1;i<=n;i++){
            for (int j=1;j<=n;j++){
                System.out.print("*");
            }
            System.out.println();
        }
                break;

            default:
                System.out.println("Invalid choice. Please choose between 1 to 5.");
        }

        sc.close();
    }
}