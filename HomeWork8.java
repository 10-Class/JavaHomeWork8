package homework8;

public class HomeWork8 {
    public static void main(String[] args) {
        int[] numbers = {1, 5, 7, 4, -2};
        Int num = new Int(numbers);
        /* 1.Напишите функцию которая вернет минимальное значение из переданного в нее массива целых
        {1,5,7,4,-2} -> -2 */
        System.out.println("#1: " + num.toMin());

        /* 2.Напишите функцию, которая вернет второе по величине значение из передаваемого в нее массива целых
        public static int getSecondLargest(int a[])
        Например: {1,5,7,4,-2} -> 5
        Возможно, предварительная сортировка как-то поможет? */
        System.out.println("#2: " + num.getSecondLargest());

        /* 3.Напишите функцию, распечатывающую только имена из передаваемого в нее массива студентов */
        Student max = new Student("Max Petrov", 19);
        Student alina = new Student("Alina Pavlova", 21);
        Student sasha = new Student("Oleksandr Svyryda", 19);
        Student olena = new Student("Olena Sidletska", 20);
        Student [] group = {max, alina, sasha, olena};
        names(group);


        /* *4. Напишите функцию, которая вернет сумму минимума и максимума из передаваемого в нее массива целых:
        {2,1,6,9} -> 10 */
        int[] numbers2 = {2, 1, 6, 9};
        Int num2 = new Int(numbers2);
        System.out.println("#4: " + num2.toSum());


        /* *5. На основе функции, сортирующей "пузырьком" массив целых, напишите функцию,
        которая отсортирует передаваемый в нее массив студентов по возрасту. */

    } //main

   /* //1
    public static int min(int[] a) {
        int min = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        return min;
    }

    //2
    public static int getSecondLargest(int a[]) {
        int secondMax = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > secondMax) {
                secondMax = a[i - 1];
            }
        }
        return secondMax;
    } */

    //3
    public static void names(Student[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.println("#3: " + a[i].getName());

        }
    }

    //4
   /* public static int sum(int[] a) {
        int min = a[0];
        int max = a[0];
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < min) {
                min = a[i];
            }
        }
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        sum = max + min;
        return sum;
    }*/
}

