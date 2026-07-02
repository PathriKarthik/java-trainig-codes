/*step1: construct an array with 10 elements
#step2: add all elements in the array
#step3:print the sum of all 
#step 4:add first 5 elements of an array
#setp 5:add last 5 elements of an array
*/
class sumarr{
public static void main(String args[]){
int array[]= {1,2,3,4,5,6,7,8,9,10};
int a=0,b=0,c=0;
for(int i=0;i< array.length;i++){
   // int a=0;
    a+=array[i];
    //System.out.println(a);
    //int b=0,c=0;
    if(i<=4){
       b +=array[i];

    }
    if(i<=4){
        continue;
    }else{
       c+=array[i];
    }
}
    System.out.println(a);
    System.out.println(b);
    System.out.println(c);
}
}