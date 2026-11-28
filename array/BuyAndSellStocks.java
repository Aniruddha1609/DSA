package array;

public class BuyAndSellStocks {
    public static void main(String[] args) {
        int[] stockPrice = { 7, 1, 5, 3, 6, 4 };
        int maxi = Integer.MIN_VALUE;
        int sellingDate = 1;
        int buyingDate = 0;

        while (sellingDate < stockPrice.length) {
            if (stockPrice[buyingDate] > stockPrice[sellingDate - 1])
                buyingDate += 1;

            if (stockPrice[sellingDate] - stockPrice[buyingDate] > maxi)
                maxi = stockPrice[sellingDate] - stockPrice[buyingDate];

            sellingDate++;

        }

        System.out.println(maxi);
    }
}
