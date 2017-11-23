package FCFS;
import java.util.*;
import java.io.*;
public class write {
public static void main(String args[]) {
	int[] data={6,2,1,3,9};
	Random random=new Random();
	try{
	String pathName="E:\\jjboom.txt";
	File writename=new File(pathName);
	writename.createNewFile();
	BufferedWriter out =new BufferedWriter(new FileWriter(writename));
	for(int i=0;i<=99;i++) {
		int n=random.nextInt(5);
		int k=data[n];
		int l=i+1;
		out.write(l+" "+i+" "+k+"\r\n" );
	}
	out.flush();
	out.close();
	}catch(Exception e){
		e.printStackTrace();
	}
	
}
}
