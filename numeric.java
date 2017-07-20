package guvi;
import java.util.*;
public class numeric {
	public static void main(String[] args){
	String a,b="";
	Scanner s=new Scanner(System.in);
	a=s.next();
	char ch[]=a.toCharArray();
	for(int i=0;i<a.length();i++){
	if(ch[i]=='0'||ch[i]=='1'||ch[i]=='2'||ch[i]=='3'||ch[i]=='4'||ch[i]=='5'||ch[i]=='6'||ch[i]=='7'||ch[i]=='8'||ch[i]=='9'||ch[i]=='.'||ch[i]=='e'){
	System.out.println("TRUE");
	break;
	}
	else{
		System.out.println("FALSE");
	}
	}
}
}
