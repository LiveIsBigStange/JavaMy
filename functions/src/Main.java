public class Main {
    public static void main(String[] args) {
        //1
//        Random random = new Random();
//        int[] array = new int[15];
//        int evenCount = 0;
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10);
//            System.out.print(array[i] + " ");
//            if (array[i] % 2 == 0) {
//                evenCount++;
//            }
//        }
//        System.out.println();
//        System.out.println(evenCount);

        //2
//        Random random = new Random();
//        int[] array = new int[8];
//        for (int i = 0; i < array.length; i++) {
//            array[i] = random.nextInt(10) + 1;
//            System.out.print(array[i]  + " ");
//        }
//        System.out.println();
//        for (int i = 0; i < array.length; i++) {
//            if (i % 2 != 0) array[i] = 0;
//            System.out.print(array[i]+ " ");
//        }

        //3
//        int[] array1 = new int[5];
//        int[] array2 = new int[5];
//        Random random = new Random();
//        int sum1 = 0;
//        int sum2 = 0;
//
//        for (int i = 0; i < 5; i++) {
//            array1[i] = random.nextInt(6);
//            sum1 += array1[i];
//            array2[i] = random.nextInt(6);
//            sum2 += array2[i];
//        }
//        for (int num : array1) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//        for (int num : array2) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//
//        double average1 = (double) sum1 / array1.length;
//        double average2 = (double) sum2 / array2.length;
//        if (average1 > average2) {
//            System.out.println("сред.ариф. 1 > 2");
//        } else if (average2 > average1) {
//            System.out.println("сред.ариф. 1 < 2");
//        } else {
//            System.out.println("сред.ариф. 1 = 2");
//        }

        //4
//        int[] array = new int[4];
//        Random random = new Random();
//
//        for (int i = 0; i < 4; i++) {
//            array[i] = random.nextInt(90) + 10;
//        }
//
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//
//        boolean boo = true;
//        for (int i = 0; i < array.length - 1; i++) {
//            if (array[i] >= array[i + 1]){
//                boo = false;
//                break;
//            }
//        }
//        if (boo) System.out.println("является");
//        else System.out.println("не является");

        //5
//        int[] fibonacciArray = new int[20];
//
//        fibonacciArray[0] = 1;
//        fibonacciArray[1] = 1;
//
//        for (int i = 2; i < fibonacciArray.length; i++) {
//            fibonacciArray[i] = fibonacciArray[i - 1] + fibonacciArray[i - 2];
//        }
//
//        for (int num : fibonacciArray) {
//            System.out.print(num + " ");
//        }

        //6
//        int n = 12;
//
//        int[] array = new int[n];
//        Random random = new Random();
//        int maxElement = 0;
//        int lastIndex = 0;
//
//        for (int i = 0; i < n; i++) {
//            array[i] = random.nextInt(31) - 15;
//            System.out.print(array[i] + " ");
//            if (array[i] >= maxElement) {
//                maxElement = array[i];
//                lastIndex = i;
//            }
//        }
//        System.out.println();
//        System.out.println(maxElement);
//        System.out.println(lastIndex);
        //7
//        int n = 10;
//        int[] array1 = new int[n];
//        int[] array2 = new int[n];
//        Random random = new Random();
//        double[] array3 = new double[n];
//        int integerCount = 0;
//
//        for (int i = 0; i < n; i++) {
//            array1[i] = random.nextInt(9) + 1;
//            array2[i] = random.nextInt(9) + 1;
//        }
//        for (int i = 0; i < n; i++) {
//            array3[i] = (double) array1[i] / array2[i];
//        }
//
//        for (int num : array1) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//        for (int num : array2) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//        for (double num : array3) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//
//        for (int i = 0; i < n; i++) {
//            if (array3[i] == (int) array3[i]) {
//                integerCount++;
//            }
//        }
//
//        System.out.println(integerCount);
        //8
//        int n = 11;
//        int[] array = new int[n];
//        Random random = new Random();
//        int minus = 0;
//        int zero = 0;
//        int one = 0;
//
//        for (int i = 0; i < n; i++) {
//            array[i] = random.nextInt(3) - 1;
//        }
//
//        System.out.print("Массив: ");
//        for (int num : array) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//
//        for (int num : array) {
//            if (num == -1) {
//                minus++;
//            } else if (num == 0) {
//                zero++;
//            } else if (num == 1) {
//                one++;
//            }
//        }
//        int mostFrequent = -2;
//        if (minus > zero && minus > one) {
//            mostFrequent = -1;
//        } else if (zero > minus && zero > one) {
//            mostFrequent = 0;
//        } else if (one > minus && one > zero) {
//            mostFrequent = 1;
//        }
//
//        if (mostFrequent != -2) {
//            System.out.println(mostFrequent);
//        }

        //9
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int n;
//        do{
//            n = scanner.nextInt();
//        }while(n <= 0 || n % 2 != 0);
//
//        int[] array = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            array[i] = random.nextInt(11) - 5;
//            System.out.print(array[i] + " ");
//        }
//        System.out.println();
//
//        int middle = n / 2;
//        int leftSum = 0;
//        int rightSum = 0;
//
//        for (int i = 0; i < middle; i++) {
//            leftSum += Math.abs(array[i]);
//        }
//
//        for (int i = middle; i < n; i++) {
//            rightSum += Math.abs(array[i]);
//        }
//
//        if (leftSum > rightSum) {
//            System.out.println("в левой");
//        } else if (rightSum > leftSum) {
//            System.out.println("в правой");
//        } else {
//            System.out.println("равны");
//        }

        //10
//        Scanner scanner = new Scanner(System.in);
//        Random random = new Random();
//        int n;
//        do {
//            n = scanner.nextInt();
//        } while (n <= 3);
//
//        int[] array1 = new int[n];
//        int evenCount = 0;
//
//        for (int i = 0; i < n; i++) {
//            array1[i] = random.nextInt(n + 1);
//            if (array1[i] % 2 == 0) {
//                evenCount++;
//            }
//        }
//
//        for (int num : array1) {
//            System.out.print(num + " ");
//        }
//        System.out.println();
//
//        int[] array2 = new int[evenCount];
//        int j = 0;
//
//        for (int i = 0; i < n; i++) {
//            if (array1[i] % 2 == 0) {
//                array2[j] = array1[i];
//                j++;
//            }
//        }
//        for (int num : array2) {
//            System.out.print(num + " ");
//        }
//        System.out.println();

        //11
//        int n = 10;
//        int[] array = new int[n];
//        Random random = new Random();
//
//        for (int i = 0; i < n; i++) {
//            array[i] = random.nextInt(21);
//            System.out.print(array[i] + " ");
//        }
//
//        int min = array[0];
//        int max = array[0];
//        int sum = 0;
//        int evenCount = 0;
//        int oddCount = 0;
//
//        for (int num : array) {
//            sum += num;
//
//            if (num < min) {
//                min = num;
//            }
//
//            if (num > max) {
//                max = num;
//            }
//
//            if (num % 2 == 0) {
//                evenCount++;
//            } else {
//                oddCount++;
//            }
//        }
//        double average = (double) sum / n;
//        System.out.println();
//        System.out.println(min);
//        System.out.println(max);
//        System.out.println(sum);
//        System.out.println(average);
//        System.out.println(evenCount);
//        System.out.println(oddCount);
        //12
//        Scanner scanner = new Scanner(System.in);
//        int n;
//
//        do {
//            n = scanner.nextInt();
//        } while (n <= 0);
//
//        int[] heights = new int[n];
//        int sumBoys = 0;
//        int sumGirls = 0;
//        int countBoys = 0;
//        int countGirls = 0;
//
//        for (int i = 0; i < n; i++) {
//            int height = scanner.nextInt();
//            if (height < 0) {
//                sumBoys += Math.abs(height);
//                countBoys++;
//            } else {
//                sumGirls += height;
//                countGirls++;
//            }
//        }
//
//        double avgBoys = countBoys > 0 ? (double) sumBoys / countBoys : 0;
//        double avgGirls = countGirls > 0 ? (double) sumGirls / countGirls : 0;
//
//        if (avgBoys - avgGirls > 10) {
//            System.out.println("-");
//        } else {
//            System.out.println("+");
//        }
        //13
//        int[] birthYears = {1990, 1985, 1995, 2000, 1980, 2005};
//        int minBirthYear = birthYears[0];
//        int minIndex = 0;
//
//        for (int i = 1; i < birthYears.length; i++) {
//            if (birthYears[i] > minBirthYear) {
//                minBirthYear = birthYears[i];
//                minIndex = i;
//            }
//        }
//        int youngestIndex = minIndex;
//
//        System.out.println(minBirthYear);
//        System.out.println(youngestIndex);
        //14
//        int[] populationOnFloors = {10, 5, 8, 3, 6, 2, 7, 4, 1, 9, 12, 15, 3, 7, 8};
//
//        int smallestPopulation1 = Integer.MAX_VALUE;
//        int smallestPopulation2 = Integer.MAX_VALUE;
//        int floor1 = -1;
//        int floor2 = -1;
//
//        for (int i = 0; i < populationOnFloors.length; i++) {
//            int population = populationOnFloors[i];
//            if (population < smallestPopulation1) {
//                smallestPopulation2 = smallestPopulation1;
//                floor2 = floor1;
//                smallestPopulation1 = population;
//                floor1 = i;
//            } else if (population < smallestPopulation2) {
//                smallestPopulation2 = population;
//                floor2 = i;
//            }
//        }
//        System.out.println("Наименьшее количество жителей на этаже " + floor1 + " (" + smallestPopulation1 + " человек)");
//        System.out.println("Наименьшее количество жителей на этаже " + floor2 + " (" + smallestPopulation2 + " человек)");
        //15
//        int[] array = {5, 2, 7, 1, 8, 4, 9, 3};
//
//        int count = 0;
//
//        for (int i = 1; i < array.length; i++) {
//            if (array[i] > array[i - 1]) {
//                count++;
//            }
//        }
//
//        System.out.println(count);
        //16
//        Scanner scanner = new Scanner(System.in);
//
//        int N = scanner.nextInt();
//        int[] array = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        String result = "NO";
//
//        for (int i = 1; i < N; i++) {
//            if ((array[i] > 0 && array[i - 1] > 0) || (array[i] < 0 && array[i - 1] < 0)) {
//                result = "YES";
//                break;
//            }
//        }
//
//        System.out.println(result);
        //17
//        Scanner scanner = new Scanner(System.in);
//
//        int N = scanner.nextInt();
//        int[] array = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            array[i] = scanner.nextInt();
//        }
//
//        int count = 0;
//
//        for (int i = 1; i < N - 1; i++) {
//            if (array[i] > array[i - 1] && array[i] > array[i + 1]) {
//                count++;
//            }
//        }
//
//        System.out.println(count);
        //18
//        Scanner scanner = new Scanner(System.in);
//
//        int N = scanner.nextInt();
//        int[] firstArray = new int[N];
//
//        for (int i = 0; i < N; i++) {
//            firstArray[i] = scanner.nextInt();
//        }
//
//        int M = scanner.nextInt();
//        int[] secondArray = new int[M];
//
//        for (int i = 0; i < M; i++) {
//            secondArray[i] = scanner.nextInt();
//        }
//
//        ArrayList<Integer> result = new ArrayList<>();
//
//        for (int i = 0; i < N; i++) {
//            int currentElement = firstArray[i];
//            boolean foundInSecondArray = false;
//
//            for (int j = 0; j < M; j++) {
//                if (currentElement == secondArray[j]) {
//                    foundInSecondArray = true;
//                    break;
//                }
//            }
//
//            if (!foundInSecondArray) {
//                result.add(currentElement);
//            }
//        }
//
//        for (int element : result) {
//            System.out.print(element + " ");
//        }
        //19
//        Scanner scanner = new Scanner(System.in);
//
//        int n = scanner.nextInt();
//        int[] heights = new int[n];
//
//        for (int i = 0; i < n; i++) {
//            heights[i] = scanner.nextInt();
//        }
//
//        int x = scanner.nextInt();
//
//        int position = 0;
//        while (position < n && heights[position] >= x) {
//            position++;
//        }
//
//        System.out.println(position);
        //20
//        Scanner scanner = new Scanner(System.in);
//
//        String input = scanner.nextLine();
//        String[] elements = input.split(" ");
//
//        int uniqueCount = 0;
//        int prevElement = -1;
//
//        for (String element : elements) {
//            int currentElement = Integer.parseInt(element);
//
//            if (currentElement != prevElement) {
//                uniqueCount++;
//            }
//
//            prevElement = currentElement;
//        }
//
//        System.out.println(uniqueCount);
        //21
//        Scanner scanner = new Scanner(System.in);
//
//        String input = scanner.nextLine();
//        String[] elements = input.split(" ");
//
//        int[] intElements = new int[elements.length];
//
//        for (int i = 0; i < elements.length; i++) {
//            intElements[i] = Integer.parseInt(elements[i]);
//        }
//
//        int uniqueCount = 0;
//
//        for (int i = 0; i < intElements.length; i++) {
//            boolean isUnique = true;
//
//            for (int j = 0; j < i; j++) {
//                if (intElements[i] == intElements[j]) {
//                    isUnique = false;
//                    break;
//                }
//            }
//            if (isUnique) {
//                uniqueCount++;
//            }
//        }
//
//        System.out.println(uniqueCount);
    }
}