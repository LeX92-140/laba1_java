# Проект java/ Лабораторная работа №1. Выполнил Денисов Алексей ИТ-13
# Описание проекта
Проект представляет собой сборник из 20 различных задач по программированию на Java, разделенных на 4 тематических модуля. При выполнении проекта использовались 5 классов из них 4 класса представляют собой по 5 методов, которые решают каждую задачу, и пятый класс, класс main, использовался для выбора задач. Так же в проекте для каждой задачи были добавлены по 1 методу (соответсвенно 5 в сумме для модуля) для соответствующего метода решения поставленной задачи.
## Структура проекта
### Модуль 1: Методы (5 задач)
**Задача 1:** Дробная часть числа
```html
public double fraction(double x) { //дробная часть числа
        return x - (int) x;
    }
```
**Вход:** 7.79
**Вывод:** 0.79<br /><br />
**Задача 2:** Преобразование из char в int
```html
public int charToNum(char x) { //преобразуем из чара в инт
        return x - '0';
    }
```
**Вход:** '3'
**Вывод:** 3<br /><br />
**Задача 3:** Проверка - является ли число двузначным
```html
public boolean is2Digits(int x) { //проверка на двузначность
        return (x >= 10 && x <= 99) || (x <= -10 && x >= -99);
    }
```
**Вход:** 32
**Вывод:** true<br /><br />
**Задача 4:** Проверка - принадлежит ли число диапазону
```html
public boolean isInRange(int a, int b, int num) { //проверка принадлежит ли от а до б
        return num >= Math.min(a, b) && num <= Math.max(a, b);
    }
```
**Вход:** 5 1 3
**Вывод:** true<br /><br />
**Задача 5:** Проверка на равенство трех чисел
```html
public boolean isEqual(int a, int b, int c) { //проверка на равенство трех чисел
        return a == b && b == c;
    }
```
**Вход:** 3 3 3
**Вывод:** true<br /><br />
### Модуль 2: Условия (5 задач)
**Задача 6:** Возвращение модуля х
```html
public int abs(int x) { //возвращаем модуль х
        return x < 0 ? -x : x;
    }
```
**Вход:** -3
**Вывод:** 3<br /><br />
**Задача 7:** Проверка - является ли х кратным либо 3, либо 5
```html
public boolean is35(int x) { //проверяем на кратность 3 ИЛИ 5
        boolean div3 = x % 3 == 0;
        boolean div5 = x % 5 == 0;
        return div3 ^ div5;
    }
```
**Вход:** 5
**Вывод:** true<br /><br />
**Задача 8:** Поиск максимального значенния из трех
```html
public int max3(int x, int y, int z) { //возвращаем макс из трех
        int max = x > y ? x : y;
        return max > z ? max : z;
    }
```
**Вход:** 5 7 7
**Вывод:** 7<br /><br />
**Задача 9:** Вычисление суммы двух чисел, если сумма в диапазоне от 10 до 19 - вывод 20
```html
public int sum2(int x, int y) { //сумма чисел, если от 10 до 19 то вывод 20
        int sum = x + y;
        return (sum >= 10 && sum <= 19) ? 20 : sum;
    }
```
**Вход:** 5 7 
**Вывод:** 20<br /><br />
**Задача 10:** Вычисление дня недели по номеру
```html
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
```
**Вход:** 5
**Вывод:** пятница<br /><br />
### Модуль 3: Циклы (5 задач)
**Задача 11:** Вывод чисел подряд от 0 до определенного
```html
public String listNums(int x) { //вывод строки от 0 до х
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i++) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }
```
**Вход:** 5 
**Вывод:** 0 1 2 3 4 5<br /><br />
**Задача 12:** Вывод четных чисел подряд от 0 до определенного
```html
public String chet(int x) { //вывод строки всех четных от 0 до х
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i <= x; i += 2) {
            sb.append(i).append(" ");
        }
        return sb.toString().trim();
    }
```
**Вход:** 9
**Вывод:** 0 2 4 6 8<br /><br />
**Задача 13:** Вычисление длины числа
```html
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
```
**Вход:** 12567
**Вывод:** 5<br /><br />
**Задача 14:** Вывод квадрата со стороной х
```html
public void square(int x) { //квадрат х на х из звездочек
        for (int i = 0; i < x; i++) {
            for (int j = 0; j < x; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
```
**Вход:** 4
**Вывод:** <br /><br />
****<br /><br />
****<br /><br />
****<br /><br />
****<br /><br />
**Задача 15:** Вывод правого треугольника с высотой х
```html
public void rightTriangle(int x) { //правый треугольник из звездочек
        for (int i = 1; i <= x; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
```
**Вход:** 3
**Вывод:** <br /><br />
*<br /><br />
**<br /><br />
***<br /><br />
### Модуль 4: Массивы (5 задач)
**Задача 16:** Поиск первого вхождения х в массив
```html
public int findFirst(int[] arr, int x) { //индекс первого вхождения х
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                return i;
            }
        }
        return -1;
    }
```
**Вход:** 1,2,3,4,2,2,5 2
**Вывод:** 1<br /><br />
**Задача 17:** Поиск максимального значения массива по модулю
```html
public int maxAbs(int[] arr) { //наибольший модуль массива
        int max = arr[0];
        for (int val : arr) {
            if (Math.abs(val) > Math.abs(max)) {
                max = val;
            }
        }
        return max;
    }
```
**Вход:** 1,-2,-7,4,2,2,5
**Вывод:** -7<br /><br />
**Задача 18:** Добавление массива в другой массив начиная с определенной позиции
```html
public int[] add(int[] arr, int[] ins, int pos) { //добавляем массив в другой начиная с позиции pos
        int[] result = new int[arr.length + ins.length];
        System.arraycopy(arr, 0, result, 0, pos);
        System.arraycopy(ins, 0, result, pos, ins.length);
        System.arraycopy(arr, pos, result, pos + ins.length, arr.length - pos);
        return result;
    }
```
**Вход:** 1,2,3,4,5 7,8,9 3
**Вывод:** 1,2,3,7,8,9,4,5<br /><br />
**Задача 19:** Вывод массива в обратном порядке
```html
public int[] reverseBack(int[] arr) { //массив в обратном порядке
        int[] result = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            result[i] = arr[arr.length - 1 - i];
        }
        return result;
    }
```
**Вход:** 1,2,3,4,5
**Вывод:** 5,4,3,2,1<br /><br />
**Задача 20:** Поиск всех вхождений числа  в массив
```html
public int[] findAll(int[] arr, int x) { //индексы всех вхождений х
        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                list.add(i);
            }
        }
        return list.stream().mapToInt(i -> i).toArray();
    }tring().trim();
    }
```
**Вход:** 1,2,3,8,2,2,9 2
**Вывод:** 1,4,5<br /><br />
## Заключение
Данный проект представляет собой 4 модуля основных глав программирования: от базовых методов и условий до работы с циклами и массивами. Каждая задача представляет собой законченное решение с обработкой данных и выводом ответа
