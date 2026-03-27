public class InventoryChecker {
    public static void main(String[] args) {

        // Store stock quantities in an array
        int[] stock = {20, 15, 30, 0, 25};

        int total = 0;
        boolean outOfStock = false;

        // Loop through each item
        for (int i = 0; i < stock.length; i++) {

            if (stock[i] == 0) {
                System.out.println("Out of stock");
                outOfStock = true;
                break; // stop checking further
            }

            total = total + stock[i]; // add to total
        }

        // If no item was out of stock
        if (!outOfStock) {
            System.out.println("Total Quantity: " + total);

            // Check stock level
            if (total < 50) {
                System.out.println("Low Stock");
            } else if (total <= 100) {
                System.out.println("Moderate Stock");
            } else {
                System.out.println("Good Stock");
            }
        }
    }
}