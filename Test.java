/**
 * Created by Hoddi on 19.1.2016.
 */
public class Test {

    public static void main(String [ ] args)
    {
        int[] array = {2,3,5};
        int result = findLast(array, 2);
        System.out.println(result);
    }

    public static int findLast(int[] x, int y) {
        for (int i = x.length-1; i >= 0; i--) {
            if ( x[i] == y) {
                return i;
                //Changes
            }
        }
        return -1;
    }
}
