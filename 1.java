import java.util.Arrays;
class ArrayDemo
{
    public static void main(String[] args)
    {
        // create initilize array
        int arr [] = new int[5];
        //insert array value
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;
        arr[4]=11;

        //print the array values
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        System.out.println(arr[3]);
        System.out.println(arr[4]);

    // print arrray one line import the import java.util.Arrays
        System.out.println(Arrays.toString(arr));
    }
}