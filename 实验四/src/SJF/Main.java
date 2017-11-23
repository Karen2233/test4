package SJF;
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[]) {
	read r=new read();
	List<task> l=r.read();
	int i=0;
	Scanner s=new Scanner(System.in);
	System.out.println("输入1进入单队列,输入2进入双队列:");
	i=s.nextInt();
	if(i==2) {
	two t=new two();
	t.carryOut(l);
	}
	if(i==1) {
		single sg=new single ();
		sg.carryOut(l);
}
	}
	}
