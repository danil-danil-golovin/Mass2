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
        int maxWastes = arr[0];
        int minWastes = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (maxWastes < arr[i]) {
                maxWastes = arr[i];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if (minWastes > arr[i]) {
                minWastes = arr[i];
            }
        }
                    System.out.println("Максимальная сумма трат за день составила " + maxWastes + " рублей");
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




