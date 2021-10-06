import java.util.Map;

public class Utility {

//for promotion offer 1
    public int calculateSKUCost1(int aQty, int bQty, int cQty, int dQty, Map<String, Integer> price) {
        int total = calculatePriceOfAItem(aQty, price) + calculatePriceOfBItem(bQty, price) + calculatePriceOfCDItem(cQty, dQty, price);
        return total;
    }

    private static int calculatePriceOfCDItem(int cqty, int dqty, Map<String, Integer> price) {
        int cdPrice = 0;
        if (cqty > 0 && dqty > 0) {
            if (cqty > dqty) {
                cdPrice = dqty * 30 + (cqty - dqty) * price.get("C");
            } else {
                cdPrice = cqty * 30 + (dqty - cqty) * price.get("D");
            }
        } else {
            if (dqty > 0) {
                cdPrice = price.get("D") * dqty;
            } else {
                cdPrice = price.get("C") * cqty;

            }
        }
        System.out.println("CD price is:" + cdPrice);
        return cdPrice;
    }

    private static int calculatePriceOfBItem(int bqty, Map<String, Integer> price) {
        int bPrice = 0;
        if (bqty > 2) {
            if (bqty % 2 == 0) {
                bPrice = (bqty / 2) * 45;
            } else {
                bPrice = (bqty / 2) * 45 + (bqty % 2) * price.get("B");
            }
        } else
            bPrice = bqty * price.get("B");

        System.out.println("B price is:" + bPrice);

        return bPrice;

    }

    private static int calculatePriceOfAItem(int aqty, Map<String, Integer> price) {
        int aPrice = 0;
        if (aqty >= 3) {
            if (aqty % 3 == 0) {
                aPrice = (aqty / 3) * 130;
            } else {
                aPrice = (aqty / 3) * 130 + (aqty % 3) * price.get("A");
            }
        } else
            aPrice = aqty * price.get("A");

        System.out.println("A price is:" + aPrice);

        return aPrice;
    }
    //for promotion offer 2
    public int calculateSKUCost2(int aQty, int bQty, int cQty, int dQty, Map<String, Integer> price) {
        int total=aQty*price.get("A")-((aQty*price.get("A"))*40/100)+bQty*price.get("B")+cQty*price.get("C")+dQty*price.get("D");
    return total;
    }
}
