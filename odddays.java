package guvi;
import java.util.Scanner;
public class odddays {
	public static void main(String[] args) {
		String[] a={"sunday","monday","tuesday","wednesday","thursday","friday","saturday"};
		Scanner s=new Scanner(System.in);
		System.out.println("Enter day");
		String day=s.nextLine();
		System.out.println("Enter year");
		int yr=s.nextInt();
		int n=0;
		int m=a.length;
		for(int i=0;i<m;i++){
			if(day.equals(a[i]))
				n=i;
		}
		if(n%2==0){
		for(int j=0;j<m;j=j+2)
			System.out.println(a[j]);
	}
		if(n%2==1){
			for(int j=1;j<m;j=j+2)
				System.out.println(a[j]);
	}
		if(yr%4==0){
		System.out.println(a[n+1]);
}
}
}

