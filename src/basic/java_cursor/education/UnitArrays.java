package basic.java_cursor.education;
// * 1. Заповнити масив тільки парними числами
// * 2. Заповнити масив рандомними числами
// * 3. Вивести середнє значення масиву
// * 4. Вивести суму всіх значень кратних 3
// * 5. Вивести значення всіх парних індексів масиву
// * 6. Просортувати масив в порядку зростання
// * 7. Вивести найменше значення в масиві
// * 8. Вивести найбільше значення масиву
// * 9. Вивести суму значень всіх парних індексів
// * 10.  Вивести перших 20 символів з таблиці ASCI
//* (завдання з зірочкою)
//Заповнити масив рандомними числами, вивести їх, потім поміняти місцями парні з непарними

import java.util.Random;
import java.util.Scanner;

public class UnitArrays {

    public static int[] FillingWithRandomNumbers(int[] big_array) {
        Random random = new Random();
        for (int i = 0; i < big_array.length; i++) {
            big_array[i] = random.nextInt(1000);
        }
        return big_array;
    }

    private static void swapValues(int[] array, int a, int b) {
        int temp = array[a];
        array[a] = array[b];
        array[b] = temp;
    }

    // Запит та створення розміру масива.
    public int CreatingAnArray() {

        Scanner scan = new Scanner(System.in);
        short arraySize = 0;


        while ((arraySize > 250) | (arraySize < 1)) {
            System.out.println("Ведіть розмір масиву");
            System.out.println("Число повене бути цілим та в межах від 1 <= X = 250");
            System.out.println("Ведіть буть ласка розмір масиву:");

            while (!scan.hasNextShort()) { //перевірка веденого числа
                System.out.println("Це не число!");
                scan.next();
            }
            arraySize = scan.nextShort();
        }

        System.out.println("Ви визначили розмір масиву : " + arraySize);
        return arraySize;

    }

    // * 1. Заповнити масив тільки парними числами
    public int[] FillingInEvenNumbers(int[] big_array) {
        int bingo;
        Random random = new Random();
        for (int i = 0; i < big_array.length; i++) {
            bingo = random.nextInt(1000);
            while (bingo % 2 != 0) {
                bingo = random.nextInt(1000);
            }
            big_array[i] = bingo;
        }
        return big_array;
    }

    public float TheAverageValueOfTheArray(int[] array) {
        int symm = 0;
        for (int i = 0; i < array.length; i++) {
            symm = symm + array[i];
        }
        return symm / (array.length + 1);
    }

    public int TheSumOfMultiples(int[] array, int x) {
        int symm = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % x == 0) {
                symm = symm + array[i];
            }
        }
        return symm;
    }

    public void TheValueOfAllPairedIndices(int[] array) {
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && i != 0) {
                System.out.print("ін." + i + "=" + array[i] + ", ");
            }
        }
        System.out.println();
    }

    public int[] BubbleSortOptimisedMax(int[] array) {
        int unsortedBelow = array.length;
        while (unsortedBelow != 0) {
            int lastSwap = 0;
            for (int i = 1; i < unsortedBelow; i++) {
                if (array[i - 1] > array[i]) {
                    swapValues(array, i, i - 1);
                    lastSwap = i;
                }
            }
            unsortedBelow = lastSwap;
        }
        return array;
    }

    public int ArraysMini(int[] array) {
        int min = array[1];
        for (int i = 0; i < array.length; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        return min;
    }

    public int ArraysMax(int[] array) {
        int max = array[1];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {
                max = array[i];
            }
        }
        return max;
    }

    public int TheSumOfTheValuesOfAllPairedIndices(int[] array) {
        int symm = 0;
        for (int i = 0; i < array.length; i++) {
            if (i % 2 == 0 && i != 0) {
                symm = symm + array[i];
            }
        }
        return symm;
    }

    public void outputValueASCI(int x, int y) {
        System.out.print("Cимволи ASCII(" + x + " - " + y + "):");
        for (int i = x; i <= y; i++) {
            System.out.print((char) i + ", ");
        }
        System.out.println();
    }

    public int[] ReplaceTheElementsInTheArrayEvenWithOdd(int[] big_array) {

        int[] evenNumber = new int[big_array.length];
        int[] evenIndex = new int[big_array.length];
        int evenCount = 0;

        int[] oddNumber = new int[big_array.length];
        int[] oddIndex = new int[big_array.length];
        int oddCount = 0;

        for (int i = 0; i < big_array.length; i++) {
            if (big_array[i] % 2 == 0) {
                evenNumber[evenCount] = big_array[i];
                evenIndex[evenCount] = i;
                evenCount++;
            } else {
                oddNumber[oddCount] = big_array[i];
                oddIndex[oddCount] = i;
                oddCount++;
            }
        }

        if (oddCount > evenCount) {
            for (int i = 0; i < evenCount; i++) {
                big_array[oddIndex[i]] = evenNumber[i];
                big_array[evenIndex[i]] = oddNumber[i];
            }
        } else {
            for (int i = 0; i < oddCount; i++) {
                big_array[oddIndex[i]] = evenNumber[i];
                big_array[evenIndex[i]] = oddNumber[i];
            }
        }
        System.out.print("Парні числа масиву:");
        for (int i = 0; i < evenCount; i++) {
            System.out.print(evenNumber[i] + " ");
        }
        System.out.println();
        System.out.print("Непарні числа масиву:");
        for (int i = 0; i < oddCount; i++) {
            System.out.print(oddNumber[i] + " ");
        }
        System.out.println();
        return big_array;
    }

}
