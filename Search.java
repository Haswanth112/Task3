import java.util.Scanner;
class search{
    public static void main(String args[]){
        int array[] = new int[]{8,3,4,2,1}, ele,flag=0, index=0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter element to search: ");
        ele = s.nextInt();
    
        for(int i =0 ;i<array.length; i++ )
        {
            if (array[i] == ele){
                flag=1;
                index = i;
                break;
            }
        }
        if(flag==1){
            System.out.println("Element found at index "+index);
            
        }
        else
            System.out.println("Element not found");
    }
}