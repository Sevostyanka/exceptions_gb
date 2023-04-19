/*Создайте несколько методов, в каждом из которых, на этапе выполнения, JVM выбросит исключение.
В методе создается целочисленная переменная, которая инициализируется значением 10 / 0
В методе создается целочисленный массив длиной 10, и в ячейку этого массива с индексом 100 записывается значение 1
В методе создается строка и инициализируется значением null, затем в консоль выводится длина этой строки
В методе создается строка и инициализируется значением “10e2”, 
далее строка преобразуется к целому числу с помощью метода Integer.parseInt()
В методе создается переменная типа Object, в которую записывается строка “5”, 
попробуйте перенести значение этой переменной в другую переменную с типом Integer 
(т.е. нужно будет сделать каст из Object в Integer) */

package java_project;

import java.util.Arrays;
import java.util.Objects;

public class task4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(metod2(new int []{2,3,5},1)));
        System.out.println(metod5());

    }
    static int[] metod2(int[] arr, int i){
        if(i> arr.length)
            throw new RuntimeException("Нет такого индекса");
        arr[i]= 1;
        return arr;

    }
    static  void metod1 (){
        int x=  10/0;

    }
    static int metod3 (){
        String str = null;
        return str.length();
    }
    static int metod4 (){
        String str = "10e2";
        return Integer.parseInt(str);
    }

    static int metod5 () {
        Object arr ="5";
        int x = (int) arr;
        return x;
    }

}