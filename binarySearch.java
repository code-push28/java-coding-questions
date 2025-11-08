public class SearchingInArrays {

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter size of array : ");
        int n = sc.nextInt();
        System.out.println("Enter elements of array : ");
        int arr[] = new int[n];
        for(int i = 0 ; i<n;i++){
            arr[i] = sc.nextInt();
            
        }

        System.out.println("Enter your target : ");

        int target = sc.nextInt();

        binarySearch(arr, target);

    }

    public static void linearSearch(int[] arr , int target){
        int n = arr.length;
        for(int i = 0 ; i<n;i++){
            if(arr[i]==target){
                System.out.println(target + " is found at : "+i);

                return;
              
            }


        }

        System.out.println("Element not found");
    }


    public static void binarySearch(int[] arr , int target){
        int n = arr.length;
        int l = 0;
        int h = n-1;
        while(l<=h){

            int mid = (l+h)/2;
            if(arr[mid]==target){
                System.out.println("Element found at : "+ mid);
                return;
            }else if(arr[mid]<target){
                l = mid+1;
            }else{
                h = mid - 1;
            }
        }

        System.out.println("Element not found");
    }
    
}
