class DuplicateElementInArray {
    public static void main(String[] args) {
        int[] array = {1,2,3,2,3,4,5};
        System.out.println("Elements in the Array: ");
        for(int a=0; a<array.length; a++){
            System.out.print(array[a]+" ");
        }
        System.out.println();
        System.out.println("Duplicate elements in above array: ");
        for(int i=0; i<array.length-1; i++)// first loop with i
        { 
            for(int j=i+1; j<array.length-1; j++)//second loop without i but with j=i+1. because we have to find another appearance of i 
            {
                if(array[i]==array[j])//if ith elemnet in first loop matches with jth element in second loop i.e. its a duplicate element.
                {
                    System.out.println(array[i]+" ");
                }
            }
        }
    }
}