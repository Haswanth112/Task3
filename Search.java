import java.util.Scanner;
class Search{
	public static void main(String args[])
	{
		int n,ele,index=0,flag=0;
		Scanner s = new Scanner(System.in);
		System.out.println("Enter the size of array");
		n = s.nextInt();
		int[] array = new int[n];
		System.out.println("Enter array elements:");
		for(int i = 0 ; i<n;i++)
			{
				array[i] =s.nextInt();
			}
		System.out.print("Enter element to found:");
		ele = s.nextInt();
		for(int i= 0 ; i<n;i++)
				{
					if(array[i] == ele){
					flag=1;
					index=i;
					break;}
				}
		if(flag == 1)
			System.out.print("Element found at "+index);
		else
			System.out.print(index+"element not found");
		}
	}
