package NewProject;

public class SumArrrays {
    public static void main(String[] args) {
            int sum = 0;
            int[] myArray = {5, 70, 15, 63,900, 500, 75};
            for(int i = 0; i < myArray.length; i++) {
                sum += myArray[i];
            }
        System.out.println(sum);
    }
}
