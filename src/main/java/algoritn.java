import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class algoritn {

    public static int[] sort(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[i]) {
                    int tmp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = tmp;

                }
            }
        }
        return arr;
    }


    //Поиск первого повторяющегося числа в массиве
    public static int findFirstRepetNumber(int[] arr) {
        Set<Integer> set = new HashSet<>();
        for (int i : arr) {
            if (set.contains(i)) {
                return i;
            }
            set.add(i);
        }
        return 0;
    }

    //фибаначи
    private static long calculateWithFor(int n) {
        long first = 0;
        long second = 1;
        long result = n;
        for (int i = 1; i < n; i++) {
            System.out.println(second);
            result = first + second;
            first = second;
            second = result;
        }
        return result;
    }

    //посчитать кол-во повторений символов в строке
    public static Map<Character, Integer> collectCountCharInStr(String str) {
        Map<Character, Integer> map = new HashMap<>();
        for (char c : str.toCharArray()) {
            map.merge(c, 1, (oldVal, newVal) -> oldVal + newVal);
        }
        return map;
    }

    //архивация строки
    public static String fixSrt(String someStr) {
        StringBuilder sb = new StringBuilder();

        int count = 1;
        for (int i = 0; i < someStr.length(); i++) {
            if ((i + 1) < someStr.length() && someStr.charAt(i) == someStr.charAt(i + 1)) {
                count++;
            } else {
                sb.append(someStr.charAt(i));
                sb.append(count);
                count = 1;
            }
        }
        return sb.toString();
    }

    //    Сумма чисел возведенное в степень последней цифры
    //без строк
    public static int sumPow(int num) {
        int sum = 0;
        int exp = 0;
        boolean flag = false;
        while (num > 0) {
            int a = num % 10;
            if (!flag) {
                exp = a;
                flag = true;
            }
            sum += a;
//            num = (num - (num % 10)) / 10;
            num = num / 10;
        }
        return (int) Math.pow(sum, exp);
    }
    //со строками
    public static int sumPowStr(int num) {
        String strnum = String.valueOf(num);
        int sum = 0;
        for (char ch : strnum.toCharArray()) {
            sum += Character.getNumericValue(ch);
        }
        return (int) Math.pow(sum, Character.getNumericValue(strnum.charAt(strnum.length() - 1)));
    }
}
