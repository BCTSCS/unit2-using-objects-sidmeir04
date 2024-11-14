package AP_Calander;
public class Loops {

    public static void printNums(int start, int end, int increment){
        for (int i = start; i<end; i += increment){
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void main(String[] args) {
        printNums(2, 90, 5);
        printNums(-10, 8, 2);
        printNums(100, 150, 5);
    }
}
