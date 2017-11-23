package SJF;
import java.util.*;
public class ComparatorTask implements Comparator{
	public int compare(Object obj0, Object obj1) {
		 task t1=(task)obj0;
		 task t2=(task)obj1;
		 if(t1.getserviceTime()>t2.getserviceTime())
			 return 1;
		 else if(t1.getserviceTime()==t2.getserviceTime())
			 return 0;
		 return -1;
	}

}
