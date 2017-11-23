package SJF;
import java.io.*;
import java.util.*;
import java.io.*;
import java.util.*;


public class read {
	public List<task> read(){
		String filePath=".\\input.txt";
		List<task> list = new ArrayList<task>();
		String line=" ";
		String [] array;
		int i=0;
		int taskID;
		int arrivalTime;
		int serviceTime;
		try{
			File file = new File(filePath);
			InputStreamReader reader = new InputStreamReader(new FileInputStream(file));
			BufferedReader br = new BufferedReader(reader);
			while(line!=null){
				line=br.readLine();
				if (line!=null){
					array=line.split(" ");
					Scanner s=new Scanner(line);
					taskID=Integer.parseInt(s.next());
					arrivalTime=Integer.parseInt(s.next());
					serviceTime=Integer.parseInt(s.next());
					task t;
					t=new task(taskID,arrivalTime,serviceTime);
					list.add(i, t);
					i++;
				}
			}
			br.close();
		}catch(Exception e){
			e.printStackTrace();
		}
		return list;
	}
}