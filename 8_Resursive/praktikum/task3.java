//Find min and max
public class task3 {

    static int searchIndex(int[] array, int index){
        return Arrays.binarySearch(array, index);
    }

    static int min(int[] arr){
        Arrays.sort(arr);

        return arr[0];
    }

    static int max(int[] arr){
        Arrays.sort(arr);

        return arr[arr.length-1];
    }

    public static void main(String[] args) {
        int[] arr = {5,7,4,-2,-1,8};
        int[] arr2 = {2,-5,-4,22,7,7};

        System.out.println("min: "+min(arr)+" index: "+searchIndex(arr,min(arr))+" max: "+max(arr)+" index: "+searchIndex(arr,max(arr)));
        System.out.println("min: "+min(arr2)+" index: "+searchIndex(arr2,min(arr2))+" max: "+max(arr2)+" index: "+searchIndex(arr2,max(arr2)));
    }
}
