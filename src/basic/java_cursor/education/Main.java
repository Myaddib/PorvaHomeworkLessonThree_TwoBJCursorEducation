package basic.java_cursor.education;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        // write your code here

        UnitArrays unitArrays = new UnitArrays();
        int[] big_array = new int[unitArrays.CreatingAnArray()];

        //   1. Заповнити масив тільки парними числами FillingTheArray
        big_array = unitArrays.FillingInEvenNumbers(big_array);
        System.out.println("Завдання №  1 - Заповнити масив тільки парними числами:");
        System.out.println("Вміст масиву:  " + Arrays.toString(big_array));

        //  2. Заповнити масив рандомними числами FillingWithRandomNumbers
        big_array = UnitArrays.FillingWithRandomNumbers(big_array);
        System.out.println("Завдання № 2 - Заповнити масив випадковими числами:");
        System.out.println("Вміст масиву:  " + Arrays.toString(big_array));

        //  3. Вивести середнє значення масиву
        System.out.println("Завдання №  3 - Вивести середнє значення масиву:");
        System.out.println("Середне значення масиву = " + unitArrays.TheAverageValueOfTheArray(big_array));

        //  4. Вивести суму всіх значень кратних 3
        System.out.println("Завдання №  4 - Вивести суму всіх значень кратних 3:");
        System.out.println("Сума всіх значень масиву кратних 3 = " + unitArrays.TheSumOfMultiples(big_array, 3));

        //  5. Вивести значення всіх парних індексів масиву TheValueOfAllPairedIndices
        System.out.println("Завдання №  5 - Вивести значення всіх парних індексів масиву:");
        unitArrays.TheValueOfAllPairedIndices(big_array);

        //  6. Просортувати масив в порядку зростання
        System.out.println("Завдання №  6 - Просортувати масив в порядку зростання:");
        unitArrays.BubbleSortOptimisedMax(big_array);
        System.out.println(Arrays.toString(big_array));

        //  7. Вивести найменше значення в масиві
        System.out.println("Завдання №  7 - Вивести найменше значення в масиві:");
        System.out.println("Найменьше число масиву = " + unitArrays.ArraysMini(big_array));

        //  8. Вивести найбільше значення масиву
        System.out.println("Завдання №  8 - Вивести найбільше значення масиву:");
        System.out.println("Найбільше число масиву = " + unitArrays.ArraysMax(big_array));

        //  9. Вивести суму значень всіх парних індексів
        System.out.println("Завдання №  9 - Вивести суму значень всіх парних індексів:");
        System.out.println("Сума чисел парних індексів масиву = " + unitArrays.TheSumOfTheValuesOfAllPairedIndices(big_array));

        // * 10.  Вивести перших 20 символів з таблиці ASCI
        System.out.println("Завдання №  10 - Вивести перших 20 символів з таблиці ASCI [32-52]:");
        unitArrays.outputValueASCI(32, 52);

        //* (завдання з зірочкою)
        //Заповнити масив рандомними числами, вивести їх, потім поміняти місцями парні з непарними
        System.out.println("Завдання №  * (завдання з зірочкою)");
        System.out.println("Заповнити масив рандомними числами, вивести їх, потім поміняти місцями парні з непарними:");
        big_array = unitArrays.ReplaceTheElementsInTheArrayEvenWithOdd(big_array);
        System.out.println("Вміст масиву після заміни місцями парні з непарними" + ":  \n" + Arrays.toString(big_array));
    }

}
