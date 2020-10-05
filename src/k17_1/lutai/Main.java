package k17_1.lutai;

public class Main {

    /**
     * Этот метод возвращает true, если в массиве каждый элемент больше или равен предыдущему
     * @param array входные данные
     */
    public static boolean isAllNextNumbersGreaterOrEqual(int[] array)
    {
        for(int i = 0; i < array.length - 1; i++) {
            if (array[i]>array[i+1]) return false;
        }

        return true;
    }

    /**
     * Этот метод реализовывает игру FizzBuzz
     */
    public static void fizzBuzzGame()
    {
        for(int i = 1; i <= 100; i++) {
            if (i % 3 == 0 && i % 5 == 0)
                System.out.println("FizzBuzz");
            else {
                if (i % 3 == 0)
                    System.out.println("Fizz");
                else if (i % 5 == 0)
                    System.out.println("Buzz");
                else
                    System.out.println(i);
            }
        }
    }

    /**
     * Этот метод возвращает true, если массив можно разделить так, чтобы  сумма чисел в обеих частях была равной
     * @param array входные данные
     */
    public static boolean checkSeparation(int[] array)
    {
        double polLength = (float)array.length / 2;
        int sum=0;
        if (polLength % 1 == 0) {
            for (int i=0;i < array.length;i++) {
               if(i<polLength )
                   sum+=array[i];
               else
                   sum-=array[i];

            }
        }
        else
            {
            polLength = Math.floor(polLength);
                for (int i=0;i < array.length;i++) {
                    if(i<polLength )
                        sum+=array[i];
                    else
                        sum-=array[i];

                }

                if(sum==0)
                    return true;
                else {
                    sum = 0;
                    polLength = Math.ceil((float)array.length / 2);
                    for (int i=0;i < array.length;i++) {
                        if(i<polLength )
                            sum+=array[i];
                        else
                            sum-=array[i];

                    }
                }

        }
        return sum == 0;
    }

    /**
     * Этот метод является "точкой входа" приложения.
     * @param args аргументы при запуске приложения
     */
    public static void main(String[] args) {

        int[] normalArray = {1,2,3,4,5}; //масссив для проверки метода
        int[] failArray = {1,2,3,1,5,4}; //масссив для проверки метода

        boolean norm = isAllNextNumbersGreaterOrEqual(normalArray);     //первое задание
        boolean fail = isAllNextNumbersGreaterOrEqual(failArray);       //первое задание


        System.out.print(norm);

        System.out.print("\n"); // новая строка

        System.out.print(fail);

        System.out.print("\n"); // новая строка
        System.out.print("\n"); // новая строка

        fizzBuzzGame();     //второе задание

        System.out.print("\n"); // новая строка

        int[] normalArrayVt = {1,2,1,1,1};  //масссив для проверки метода
        int[] failArrayVt = {1,2,1,1};      //масссив для проверки метода

        boolean normalVt = checkSeparation(normalArrayVt);      //второе задание
        boolean failVt = checkSeparation(failArrayVt);          //второе задание

        System.out.print(normalVt);

        System.out.print("\n"); // новая строка

        System.out.print(failVt);
    }

}
