package AP_Calander;
public class Loops {

    public static void printNums(int start, int end, int increment){
        System.out.println("Start: " + start + " / Stop: " + end + " / " + "increment: " + increment );
        for (int i = start; i<end; i += increment){
            System.out.print(i + " ");
        }
        System.out.println("");
    }

    public static void sumNums(String nums){
        int sum = 0;
        int index = 0;

        while (index < nums.length()) {
            sum += Character.getNumericValue(nums.charAt(index));
            index++;
        }
        System.out.println(nums.length() + " digits totaling " + sum);
    }

    public static void addHyphen(String input) {
        String uppercased = input.toUpperCase();
        System.out.println("Uppercase string: " + uppercased);
        String hyphenated = uppercased.replace(" ", "-");
        System.out.println("Hyphenated string: " + hyphenated);
    }

    public static void main(String[] args) {
        printNums(2, 90, 5);
        printNums(-10, 8, 2);
        printNums(100, 150, 5);
        sumNums("234");
        sumNums("10000");
        sumNums("123456789");
        sumNums("222222");
        addHyphen("Hello World");
        addHyphen("Jim Bob");
        addHyphen("Computer Science");
        addHyphen("UIL TCEA");
        addHyphen("State Champions");
    }
}
