import java.util.Arrays;
import java.util.Random;

public class Homework1 {
    public static void main(String[] args) {

//      1. Выбросить случайное целое число в диапазоне от 0 до 2000 и сохранить в i

        int num = new Random().nextInt(0, 2000);
        System.out.println(num);

//      2. Посчитать и сохранить в n номер старшего значащего бита выпавшего числа

        System.out.println(Integer.toBinaryString(num));
        int n = 0;
        while (num != 0) {
            num >>= 1;
            n++;
        }
        System.out.println(n);

//      3. Найти все кратные n числа в диапазоне от i до Short.MAX_VALUE сохранить в массив m1

        int first_count = 0;
        for (int i = num; i <= Short.MAX_VALUE; i++) {
            if (i % n == 0) {
                first_count++;
            }
        }

        int[] m1 = new int[first_count];
        int m1_count = 0;

        for (int i = num; i <= Short.MAX_VALUE; i++) {
            if (i % n == 0) {
                m1[m1_count] = i;
                m1_count++;
            }
        }
       System.out.println(Arrays.toString(m1));
        
//      4. Найти все некратные n числа в диапазоне от Short.MIN_VALUE до i и сохранить в массив m2

        int second_count = 0;
        for (int i = num; i >= Short.MIN_VALUE; i--) {
            if (i % n != 0) {
                second_count++;
            }
        }

        int[] m2 = new int[second_count];
        int m2_count = 0;

        for (int i = num; i >= Short.MIN_VALUE; i--) {
            if (i % n != 0) {
                m2[m2_count] = i;
                m2_count++;
            }
        }
        System.out.println(Arrays.toString(m2));
    }
}


