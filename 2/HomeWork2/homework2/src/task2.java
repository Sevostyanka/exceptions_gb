// Если необходимо, исправьте данный код
public class task2 {
    public static void main(String[] args) {
        int[] intArray = new int[] {3,5,6,8,2,3,5,7,4,3,2,10};
        try {
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }


    }
}
