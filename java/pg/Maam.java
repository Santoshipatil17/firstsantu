class Maam
{
public static void main(String[] args)
{
int arr[]={1,2,3,4,5};
int rev=0;
while(arr[i]!=0)
	{
	int rem=arr[i]%10;
rev=(rev*10)+rem;
arr[i]=arr[i]/10;
}
System.out.println(rev);
}
}
