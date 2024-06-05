public class loop {
    public static void main(String[] args) {
        // int i = 100;
        // while (i<=200) {
        //     System.out.println(i);
        //     i++;
        // }
        int arr[]={1,2,3,4,5,6,7,8,9}; 
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
        System.out.print("\n");
        for (int i : arr) {
            System.out.println(i);
        }
    }
}
