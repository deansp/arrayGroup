//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int[] num = {1,2,3,4,5,6,7,8,9,10};
        int[] num2 = {11,12,130,14,15,16,17,18,19,20};

        int maxNumber = num2[0];

        for (int i = 1; i < num2.length; i++) {
            if (num2[i] > maxNumber) {
                maxNumber = num2[i];
            }
        }
        System.out.println(maxNumber);
    }
}