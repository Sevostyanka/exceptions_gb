/*Реализуйте метод, принимающий в качестве аргумента целочисленный двумерный массив. 
Необходимо посчитать и вернуть сумму элементов этого массива. 
При этом накладываем на метод 2 ограничения: метод может работать только с 
квадратными массивами (кол-во строк = кол-ву столбцов), и в каждой ячейке может лежать только значение 0 или 1. 
Если нарушается одно из условий, метод должен бросить RuntimeException с сообщением об ошибке. */

package java_project;


    public static void main(String[] args) {
        System.out.println(sumArrs(new int[][]{{1,0,0},{1,0,1}}));

    }
    static int sumArrs(int [][] arr){
        int summ= 0;
        if (arr.length!=arr[0].length)
            throw new RuntimeException("Не квадратный массив");
        for (int i=0; i< arr.length; i++ ){
            for(int j=0; j< arr[0].length; j++){
                if (arr[i][j]!=1 & arr[i][j]!= 0){
                    throw new RuntimeException("Найден не бинарный элемент");
                }
                summ += arr[i][j];
            }
        }

        return summ;
    }
}