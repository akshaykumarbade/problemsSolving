class ReverseArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6};
        System.out.println("Array length: "+array.length);
        //System.out.println();
        System.out.println("Orginal Array: ");
        for(int i=0;i<array.length;i++){
            System.out.print(array[i]+" ");
        }
        //logic to reverse the array: create an empty array of same size. make last element of second array equal to first element for first array.
        int l = array.length;
        int[] array2= new int[l];
        int m = l;
        for(int j=0; j<l; j++){
            array2[m-1]=array[j];
            m=m-1;
        }
        
        System.out.println();
        System.out.println("Reversed Array: ");
        for(int k=0;k<array.length;k++){
            System.out.print(array2[k]+" ");
        }
    }
}
