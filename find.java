class find{
    public static void main(String args[]){
        int arr[]={20,22,33,40,45,46,88};
        int n=88,i;
        for(i=0;i<arr.length;i++){
            if(n==arr[i]){
                System.out.println("the element :" +n +  "at the index of "+i);
                break;
            }
        }
            if( n!=arr[i]){
            System.out.println("value not found");
                }   
         }
    
}