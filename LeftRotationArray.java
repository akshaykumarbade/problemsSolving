import java.util.Scanner;

class LeftRotationArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int[] array= {1,2,3,4,5,6};
        System.out.println("Original Array: ");
        for(int i=0; i<array.length; i++){
            System.out.print(array[i]+" ");
        }
        System.out.println(" ");
        System.out.println("How many times do you want to left rotate this above array? ");
        int n = scan.nextInt();
        leftRotate(array, n);
        
    }
    static void leftRotate(int[] array, int n){
        
        int first;
       
        for(int j = 0; j<n; j++){
            first = array[0]; //assign 0th index element to first;
            for(int k=0; k<array.length-1;k++ ){
                array[k]=array[k+1]; //shifting elements to one position left
            }
            array[array.length-1]=first; //when last position becomes empty assign first element ot last position
            
        }
        System.out.println(" ");
        System.out.println("Array after "+n+" of left rotation: ");
        for(int l=0; l<array.length;l++){
            System.out.print(array[l]+" ");
        }
    }
}