import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class PromotionEngine {

    public static void main(String arg[]) {
        int total=0;
       total  = CartListWithPromotion(total);
        System.out.println(total);


    }

    private static int CartListWithPromotion(int total) {

        Utility util = new Utility();
        System.out.println("A price is 50" + '\n' + "B price is 30" + '\n' + "C price is 20" + '\n' + "D price is 15");
        System.out.println("Promotion Offers 1-" + '\n' + "3A's for 130" + '\n' + "2B's for 45" + '\n' + "C+D for 30");
        System.out.println("Promotion Offers 2-" + '\n' + "40% off on A(SKU)");
        try {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter number of A quantity");
            int aQty = sc.nextInt();
            System.out.println("Enter number of B quantity");
            int bQty = sc.nextInt();
            System.out.println("Enter number of C quantity");
            int cQty = sc.nextInt();
            System.out.println("Enter number of D quantity");
            int dQty = sc.nextInt();
            System.out.println("Select 1 for Promotion Offer 1 or Select 2 for Promotion Offer 2");
            int promotionType = sc.nextInt();

            Map<String, Integer> price = new HashMap();
            price.put("A", 50);
            price.put("B", 30);
            price.put("C", 20);
            price.put("D", 15);
            if (promotionType == 1) {
                total = util.calculateSKUCost1(aQty, bQty, cQty, dQty, price);
                
            } else {
                total = util.calculateSKUCost2(aQty, bQty, cQty, dQty, price);
            }
        } catch (Exception e) {
            System.out.println("Invalid quantity! Please enter a number");
            CartListWithPromotion(total);
        }
        return total;
    }


}
