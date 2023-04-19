package java_project;

public class task {
    
    static int chekArr (int [] arr) {
        int minArr=2;
        if (arr.length < minArr) {
            return -1;
        }
        return arr.length;

    }
    public static void main(String[] args) {
        System.out.println( chekArr(new int[] {1,5,8}));
    }


}