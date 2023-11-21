public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
    }

    public static int[] generateRandomArray() {
        java.util.Random random = new java.util.Random();
        int[] arr = new int[30];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = random.nextInt(100_000) + 100_000;
        }
        return arr;
    }

    public static void task1() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        System.out.println("Сумма трат за месяц составила " + sum + " рублей");
    }

    public static void task2() {
        int[] arr = generateRandomArray();
        int maxWastes = 0;
        int minWastes = -1;
        for (int i = 0; i < arr.length; i++) {
            final int sum = arr[i];
            if (sum > maxWastes) {
                maxWastes = sum;
            }
        }
        System.out.println("Максимальная сумма трат за день составила " + maxWastes + " рублей");
        for (int i = 0; i < arr.length - 1; i++) {
            final int summ = arr[i];
            final int summN = arr[i + 1];
            if (summ < summN) {
                minWastes = summ;
            }
        }
        System.out.println("Минимальная сумма трат за день составила " + minWastes + " рублей");
    }

        public static void task3() {
        int[] arr = generateRandomArray();
        int sum = 0;
        for (int s : arr) {
            sum += s;
        }
        double sredn  = (double) sum / arr.length;
            System.out.println("Средняя сумма трат за месяц составила " + sum + " рублей");
        }
    public static void task4() {
        char[] reverseFullName = { 'n', 'a', 'v', 'I', ' ', 'v', 'o', 'n', 'a', 'v', 'I'};
        for (int i = reverseFullName.length - 1; i >= 0; i--){
            System.out.print(reverseFullName[i]);
        }
    }
}




