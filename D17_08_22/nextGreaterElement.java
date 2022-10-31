public class nextGreaterElement {
    public static void main(String[] args) {
        int arr[]={4,5,2,25};
        // int arr[]={13,7,6,12};
        int n=arr.length, t;
        for(int i=0;i<n;i++){
            t=-1;
            for(int j=i+1;j<n;j++){
                if(arr[i]<arr[j]){
                    t=arr[j];
                    break;
                }
            }
            System.out.println(arr[i]+" -- "+t); //arr[i]
        }
    }
}
