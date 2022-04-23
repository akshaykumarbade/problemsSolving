class EvenPositionArray {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8};
        System.out.println("Array: ");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
        System.out.println("Elements at even index position: ");
        //logic to print even position elements;
        for(int j=2;j<arr.length;j++){
            if(j%2==0 ){
                System.out.print(arr[j]+" ");
            }
        }
    }
}
