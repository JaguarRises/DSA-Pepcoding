public class IntroToArrays {



    public static void main(String[] args) {

        int[] arr = new int[5];     //arr is just a reference variable
        arr[0] = 33;
        arr[1] = 47;
        arr[2] = 59;
        arr[3] = 68;
        arr[4] = 97;
        System.out.println(arr.length);     //continuous memory block in heap. Address of first in stack
        // First Address + (i * size) - Not the same in Java but similar to this C-Style reference
        // Any index takes same time to reach because we give the exact address. eg time for arr[400] == arr[700] Complexity O(1)
        for(int i = 0; i <arr.length; i++){
            System.out.println(arr[i]);
        }

        int[] two = arr;       // same array referenced
        //two = arr.clone()-> Creates a new array
        two[1] = 590;
        for(int i = 0; i <arr.length; i++ ){
            System.out.println(arr[i]);
        }
    }
}
