package SJF;
import java.util.*;
public class single {
public List<task> singleQueue(List<task> l) {
	ComparatorTask comparator=new ComparatorTask();
	int time=0;
	int lastTask=0;
	int number=0;
	List<task> tmp=new ArrayList<task>();
	for(int i=0;i<=l.size();i++) {
		if(i==0) {
			l.get(i).setstartingTime(time);
			l.get(i).finishingTime();
			l.get(i).turnAroundTime();
			l.get(i).weightTurnAround();
			time=l.get(i).getFinishTime();
		}
		else {
			tmp=new ArrayList<task>();
			for(int j=0;j<l.size();j++) {
				if(l.get(j).getarrivalTime()>time) {
					break;
				}
				else {
					if(l.get(j).status!=1)
					tmp.add(l.get(j));
				}
			}
			Collections.sort(tmp, comparator);
			for(int k=0;k<l.size();k++) {
				if(tmp.size()!=0){
				if(l.get(k).getTaskId()==tmp.get(0).getTaskId()) {
					l.get(k).setstartingTime(time);
					l.get(k).finishingTime();
					l.get(k).turnAroundTime();
					l.get(k).weightTurnAround();
					time=l.get(k).getFinishTime();
					break;
				}}
			}
		}
	}
	return l;
}
public void carryOut(List<task> l) {
	List<task> tmp=singleQueue(l);
	System.out.println("任务编号\t开始时间\t到达时间\t服务时间\t完成时间\t周转时间\t带权周转时间");
	for(int i=0;i<tmp.size();i++) {
		System.out.println(tmp.get(i).getTaskId()+"\t"+tmp.get(i).getstartingTime()+"\t"+tmp.get(i).getarrivalTime()+"\t"+tmp.get(i).getserviceTime()+"\t"+tmp.get(i).getFinishTime()+"\t"+tmp.get(i).getturnAroundTime()+"\t"+tmp.get(i).getweightTurnAround());
	}
}
}
