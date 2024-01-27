public class SumOfNumbers {
    public static void main(String[] args) {
        System.out.println(sum(4, 5, 10));
    }

    public static int sum(int... numbers) {
        int total = 0;
        for (int i = 0; i < numbers.length; i++) {
            int sum = 0;
            for (int j = 1; j <= numbers[i]; j++) {
                sum += j;
            }
            
            System.out.println("Cumulative sum for parameter " + (i + 1) + ": " + sum);
            total += sum;
        }
        System.out.println("**********************");
        System.out.print("Total:");
        return total;
    }
}
