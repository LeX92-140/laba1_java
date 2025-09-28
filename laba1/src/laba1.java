import java.util.*;

public class laba1 {

    public double fraction(double x) { //дробная часть числа
        return x - (int) x;
    }

    public int charToNum(char x) { //преобразуем из чара в инт
        return x - '0';
    }

    public boolean is2Digits(int x) { //проверка на двузначность
        return (x >= 10 && x <= 99) || (x <= -10 && x >= -99);
    }

    public boolean isInRange(int a, int b, int num) { //проверка принадлежит ли от а до б
        return num >= Math.min(a, b) && num <= Math.max(a, b);
    }

    public boolean isEqual(int a, int b, int c) { //проверка на равенство трех чисел
        return a == b && b == c;
    }

    public int abs(int x) { //возвращаем модуль х
        return x < 0 ? -x : x;
    }

    public boolean is35(int x) { //проверяем на кратность 3 ИЛИ 5
        boolean div3 = x % 3 == 0;
        boolean div5 = x % 5 == 0;
        return div3 ^ div5;
    }

    public int max3(int x, int y, int z) { //возвращаем макс из трех
        int max = x > y ? x : y;
        return max > z ? max : z;
    }

    public int sum2(int x, int y) { //сумма чисел, если от 10 до 19 то вывод 20
        int sum = x + y;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }

    public String day(int x) { //день недели по номеру
        switch (x) {
            case 1:
                return "понедельник";
            case 2:
                return "вторник";
            case 3:
                return "среда";
            case 4:
                return "четверг";
            case 5:
                return "пятница";
            case 6:
                return "суббота";
            case 7:
                return "воскресенье";
            default:
                return "это не день недели";
        }
    }

    public String listNums(int x) { //вывод строки от 0 до х
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }

    public String chet(int x) { //вывод строки всех четных от 0 до х
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }

    public int numLen(long x) { //колво цифр в числе
        if (x == 0) {
            return 1;
        }
        int count = 0;
        long num = Math.abs(x);
        while (num > 0) {
            num /= 10;
            count++;
        }
        return count;
    }

    public void square(int x) { //квадрат х на х из звездочек
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public void rightTriangle(int x) { //правый треугольник из звездочек
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public int findFirst(int[] arr, int x) { //индекс первого вхождения х
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }

    public int maxAbs(int[] arr) { //наибольший модуль массива
        int max = arr[0];
        for (int val : arr) {
            if (Math.abs(val) > Math.abs(max)) {
                max = val;
            }
        }
        return max;
    }

    public int[] add(int[] arr, int[] ins, int pos) { //добавляем массив в другой начиная с позиции pos
        int[] result = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, result, 0, pos);
        System.arraycopy(ins, 0, result, pos, ins.length);
        System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos);
        return result;
    }

    public int[] reverseBack(int[] arr) { //массив в обратном порядке
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }

    public int[] findAll(int[] arr, int x) { //индексы всех вхождений х
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }

    public static void main(String[] args) {
        laba1 t = new laba1();
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите номер задания от 1 до 20 - ");
        String input = sc.nextLine();

        int task;
        try {
            task = Integer.parseInt(input);
        } catch (NumberFormatException e) {
            System.out.println("Ошибка - это не число)");
            sc.close();
            return;
        }

        if(task < 1 || task > 20) {
            System.out.println("Ошибка - номер должен быть от 1 до 20)");
            sc.close();
            return;
        }

        switch (task) {
            case 1:
                System.out.println("1 задание: x = 7.79, дробная часть - " + t.fraction(7.79));
                break;
            case 2:
                System.out.println("2 задание: x - '3', преобразованный х = " + t.charToNum('3'));
                break;
            case 3:
                System.out.println("3 задание: х = 32, является ли х двузначным - " + t.is2Digits(32));
                break;
            case 4:
                System.out.println("4 задание: а = 5, b = 1, num = 3, есть ли число num в диапазоне - " + t.isInRange(5, 1, 3));
                break;
            case 5:
                System.out.println("5 задание: a = 3, b = 3, c = 3, равны ли все три числа - " + t.isEqual(3, 3, 3));
                break;
            case 6:
                System.out.println("6 задание: х = -3, модуль х = " + t.abs(-3));
                break;
            case 7:
                System.out.println("7 задание: х = 5, является ли х кратным 3 ИЛИ 5 - " + t.is35(5));
                break;
            case 8:
                System.out.println("8 задание: х = 5, y = 7, z = 7, максимум из них = " + t.max3(5, 7, 7));
                break;
            case 9:
                System.out.println("9 задание: х = 5, у = 7, сумма(от 10 до 19) = " + t.sum2(5, 7));
                break;
            case 10:
                System.out.println("10 задание: х = 5, соответствие ко дню недели - " + t.day(5));
                break;
            case 11:
                System.out.println("11 задание: х = 5, числа от 0 до х включительно - " + t.listNums(5));
                break;
            case 12:
                System.out.println("12 задание: х = 9, четные числа от 0 до х включительно - " + t.chet(9));
                break;
            case 13:
                System.out.println("13 задание: х = 12567, кол-во знаков в х = " + t.numLen(12567));
                break;
            case 14:
                System.out.println("14 задание: х = 4, квадрат х на х:");
                t.square(4);
                break;
            case 15:
                System.out.println("15 задание: х = 4, правый треугольник:");
                t.rightTriangle(4);
                break;
            case 16:
                int[] arr16 = {1, 2, 3, 4, 2, 2, 5};
                System.out.println("16 задание: х = 2, первое вхождение в arr16 - " + t.findFirst(arr16, 2));
                break;
            case 17:
                System.out.println("17 задание: наибольшее значение по модулю в массиве{1, -2, -7, 4, 2, 2, 5} - " + t.maxAbs(new int[]{1, -2, -7, 4, 2, 2, 5}));
                break;
            case 18:
                System.out.println("18 задание: в массив{1, 2, 3, 4, 5} на позицию 3 добавляем {7, 8, 9} - " + Arrays.toString(t.add(new int[]{1, 2, 3, 4, 5}, new int[]{7, 8, 9}, 3)));
                break;
            case 19:
                System.out.println("19 задание: массив{1, 2, 3, 4, 5} задом наперед - " + Arrays.toString(t.reverseBack(new int[]{1, 2, 3, 4, 5})));
                break;
            case 20:
                System.out.println("20 задание: х = 2, все вхождения х в {1, 2, 3, 8, 2, 2, 9} " + Arrays.toString(t.findAll(new int[]{1, 2, 3, 8, 2, 2, 9}, 2)));
                break;
            default:
                System.out.println("Такого задания нет.");
        }

        sc.close();
    }
}