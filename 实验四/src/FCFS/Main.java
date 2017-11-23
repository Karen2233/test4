package FCFS;
import java.io.*;
import java.util.*;
public class Main {
	public static void main(String args[]) {
	read r=new read();
	int i=0;
	Scanner s=new Scanner(System.in);
	System.out.println("输入1进入单队列,输入2进入双队列:");
	i=s.nextInt();
	if(i==2) {
	List<task> l=r.read();
	twoQueue t=new twoQueue();
	t.carryOut(l);
	}
	if(i==1) {
		List<task> l=r.read();
		single sg=new single ();
		sg.carryOut(l);
	}
}
}
