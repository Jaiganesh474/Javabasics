import java.util.ArrayList;
import java.util.Arrays;

//Rough Class for demonstration calculation
public class SampleClass {
    public static void main(String[] args) {
        int[] arr= {1,2,3,4,5};
        System.out.println(Arrays.toString(arr));

        String str= "Hello, World!";
        System.out.println(str.length());
        ArrayList<Integer> arrayList=new ArrayList<>(arr.length);
        for (int i : arr) {
            arrayList.add(i);
        }
        // This line will cause an error because Arrays class does not have a delete method
    }
}
