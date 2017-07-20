package guvi;
import java.util.*;
public class maxminsqt {
	public static void main(String[] args){
	String inp="34$#2a3";
	int sum1;
	int sum2=0;
	int sum3=0;
	int sum4;
	int len=inp.length();
	int a[]=new int[len];
	String s="";
	for(int i=0;i<inp.length();i++){
		if(Character.isDigit(inp.charAt(i))){
			s+=inp.charAt(i);				
		}
	}
int n=Integer.parseInt(s);
	int max=0,min=a[0];
	int[] arr=new int[4];
	int temp=n;
	for(int i=0;i<arr.length;i++)
	{
		arr[i]=temp%10;
		temp/=10;
	}
	Arrays.sort(arr);
	max=arr[arr.length-1];
	min=arr[0];
	//System.out.println(max);
	//System.out.println(min);
	int sum=0;
	int i=0;
	while(i!=arr.length)
	{
		sum+=max*arr[i];
		i++;
	}
	//System.out.println(sum);
	sum1=0;
	int j=0;
	while(sum>9)
	{
		sum1=0;
	while(sum!=0)
	{
		j=sum%10;
		sum1+=j;
		sum/=10;
	}
		sum=sum1;
	}				
	sum2=1;
	for(j=0;j<arr.length;j++)
	{
		sum2*=min+arr[j];
	}
	//System.out.println(sum2);
	sum3=0;
	while(sum2>9)
	{
		sum3=0;
	while(sum2!=0)
	{
		int k=sum2%10;
		sum3+=k;
		sum2/=10;
		
	}
		sum2=sum3;
	}			  
	//System.out.println(sum2);
	int m=(int)(Math.min(sum1,sum2));
	//System.out.println(m);
	int sqr=(int)(Math.pow(m,2));
	System.out.println(sqr);
}
}