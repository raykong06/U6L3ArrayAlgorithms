public class FruityCode
{
    public static void main(String[] args)
    {
        String[] fruit = {"apple", "banana", "pineapple", "grapes"};
        for (int i = 0; i < fruit.length; i++)
        {
            System.out.println(fruit[i]);
        }

        int[] fruitCounts = {5, 6, 2, 25};
        for (int i = 0; i < fruitCounts.length; i++)
        {
            System.out.println(fruitCounts[i]);
        }

        double[] fruitPrices = {0.55, 0.25, 2.99, 0.99};
        for (int i = 0; i < fruitPrices.length; i++)
        {
            System.out.println(fruitPrices[i]);
        }

        boolean[] fruitInStock = {true, false, false, true};
        int counter = 0;
        while (counter <= fruitInStock.length - 1)
        {
            System.out.println(fruitInStock[counter]);
            counter++;
        }
    }
}
