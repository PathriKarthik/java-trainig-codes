/*1- initialize max,min,sum variables
    2-start with index 0 until the last index and add each element to the sum
    3-compare the a[0] with the a[i+1] that current value with next value
    4-if next value is greater update the max value with next value  repeat it until last index
    5-compare the values with next values if the value is min than other values in array 
    6-uodate min with low value
 */
class items{
    public static void main(String args[]){
        int arr[]={20,40,30,80,100,200,270};
        int sum=0,max=0,min=0;
        for(int i=0;i< arr.length ;i++){
            sum+=arr[i];
        }
        for(int j=0;j<arr.length-1;j++){
            if(arr[j]>=arr[j+1]){
                max=arr[j];
            }
            if(arr[j]<=arr[j+1]){
                min=arr[j];
            }
        }
        
        System.out.println("sum is:"+ sum );
        System.out.println("minimum:"+ min);
        System.out.println("maximum:"+ max);
        
    }
    }