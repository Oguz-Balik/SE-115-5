public class lab6scenario0 {
    public static void main(String[] args) {
        int[] arr = {4,8,15,16,23,42};
        int z = 0;
        for (int i=0;i<arr.length;i++){
            if (z==2) {
            System.out.println("The length is "+arr.length);
            System.out.println("Value of 1st elmnt:"+arr[1]);
            System.out.println(arr[3]);
            System.out.println(arr[2]);
            System.out.println(arr[3]);
            System.out.println(arr[10]); // arrays only go up to arr[5] so it cant print arr[10]//
            }
            z++;
        }

    }
}
