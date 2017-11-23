package SJF;
import java.util.*;
public class two {
public List<task> twoQueue(List<task> l) {
	ComparatorTask comparator=new ComparatorTask();
	List<task> tmp=new ArrayList<task>();
	int number=0;
	int q1=-1;
	int q2=-1;
	int p=1;
	int g=0;
	for(int time=0;time<=10000;time++) {
		g=time;
		if(g>=99) {
			g=99;
		}
		while(number<2) {			
			for(int i=0;i<l.size();i++) {
				if(l.get(i).getarrivalTime()==g) {
					tmp=new ArrayList();
					for(int j=0;j<=i;j++) {
						if(l.get(j).status==0) {
							tmp.add(l.get(j));
						}
					}
					if(tmp.size()==0) {
						p=-1;
						break;
					}
					if(tmp.size()!=0) {
						Collections.sort(tmp,comparator);
						for(int k=0;k<l.size();k++) {
							if(l.get(k).getTaskId()==tmp.get(0).getTaskId()) {
								number++;
								if(q1==-1) {
									q1=l.get(k).getserviceTime();
								}
								else {
									q2=l.get(k).getserviceTime();
								}
								l.get(k).setstartingTime(time);
								l.get(k).finishingTime();
								l.get(k).turnAroundTime();
								l.get(k).weightTurnAround();
							}
						}
					}
					break;
				}
			}
			if(p==-1) {
				break;
			}
		}
		p=1;
		if(q1>0) {
			q1--;
			if(q1==0) {
				q1=-1;
				number--;
			}
		}
		if(q2>0) {
			q2--;
			if(q2==0) {
				q2=-1;
				number--;
			}
		}
	}
	return l;
}
public void carryOut(List<task> l) {
	List<task> tmp=twoQueue(l);
	System.out.println("任务编号\t开始时间\t到达时间\t服务时间\t完成时间\t周转时间\t带权周转时间");
	for(int i=0;i<tmp.size();i++) {
		System.out.println(tmp.get(i).getTaskId()+"\t"+tmp.get(i).getstartingTime()+"\t"+tmp.get(i).getarrivalTime()+"\t"+tmp.get(i).getserviceTime()+"\t"+tmp.get(i).getFinishTime()+"\t"+tmp.get(i).getturnAroundTime()+"\t"+tmp.get(i).getweightTurnAround());
	}
}
}
