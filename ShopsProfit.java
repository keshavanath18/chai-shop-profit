import java.util.Scanner;

class ChaiShop {
    String name;
    int sold_count;
    int staf_mem;
    int totalsale;
    int totalprofit;

    // Constructor
    ChaiShop(String s, int a, int b) {
        this.name = s;
        this.sold_count = a;
        this.staf_mem = b;

        // Calculate total sale
        this.totalsale = sold_count * 10;

        // Calculate total profit after staff salary
        this.totalprofit = totalsale - (staf_mem * 500);
    }

    // Method to display branch details
    void display() {
        System.out.println("Branch name: " + name);
        System.out.println("Sold count: " + sold_count);
        System.out.println("Staff members: " + staf_mem);
        System.out.println("Total sale: " + totalsale);
        System.out.println("Total profit: " + totalprofit);
    }
}

class ShopsProfit {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner sc = new Scanner(System.in);

        // Ask for number of branches
        System.out.print("Enter Number Branches: ");
        int n = sc.nextInt();

        // Consume the leftover newline
        sc.nextLine();

        // Create an array of ChaiShop objects
        ChaiShop[] branches = new ChaiShop[n];

        // Variable to store total profit of all branches
        int totalProfit = 0;

        // Get details for each branch
        for (int i = 0; i < n; i++) {

            System.out.println("\nEnter details for Branch " + (i + 1));

            // Get branch name
            System.out.print("Enter branch name: ");
            String name = sc.nextLine();

            // Get sold count
            System.out.print("Enter sold count: ");
            int sold = sc.nextInt();

            // Get staff count
            System.out.print("Enter staff count: ");
            int staff = sc.nextInt();

            // Consume the leftover newline
            sc.nextLine();

            // Create ChaiShop object using user input
            branches[i] = new ChaiShop(name, sold, staff);

            // Add branch profit to total profit
            totalProfit = totalProfit + branches[i].totalprofit;
        }

        // Display all branches
        System.out.println("\n========== BRANCH DETAILS ==========");

        for (int i = 0; i < n; i++) {

            System.out.println("---------------------------------------");

            // Call display() method using the object
            branches[i].display();
        }

        System.out.println("=====================================================================");

        // Display total profit
        System.out.println("Net profit after staff salaries in all branches: RS." + totalProfit);

        // Close Scanner
        sc.close();
    }
}