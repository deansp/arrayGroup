//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int[] num2 = {11,12,130,14,15,16,17,18,19,20};

        int maxNumber = num2[0];

        int[] resultArray = new int[num.length];
        for (int i = 0; i < num.length; i++) {
            resultArray[i] = num[i] + num2[i];
        }
        // Print the result array
        for (int i = 0; i < resultArray.length; i++) {
            if (i < resultArray.length - 1) {
                System.out.println(resultArray[i]);
            }
        }
    }
}