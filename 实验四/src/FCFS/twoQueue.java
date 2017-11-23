package FCFS;
import java.util.*;
import java.io.*;
public class twoQueue {
public List<task> two(List<task> l) {
	int number=0;
	int i=0;
	int q1=-1;
	int q2=-1;
	for(int time=0;time<=10000;time++) {
		for(int j=0;j<l.size();j++) {
			if(l.get(j).getarrivalTime()<=time) {
				if(l.get(j).status==0){
				if(number<2) {
					number++;
					if(q1==-1) {
						q1=l.get(j).getserviceTime();
					}
					else {
						q2=l.get(j).getserviceTime();
					}
					l.get(j).setstartingTime(time);
					l.get(j).finishingTime();
					l.get(j).turnAroundTime();
					l.get(j).weightTurnAround();
				}
			}
				}
			else {
				break;
			}
		}
		if(q1>0) {
			q1--;
			if(q1==0) {
				number--;
				q1--;
				
			}
		}
		if(q2>0) {
			q2--;
			if(q2==0) {
				number--;
				q2--;
			}
		}
		if(l.get(99).status==1) {
			break;
		}
	}
	return l;
}
public void carryOut(List<task> l) {
	List<task> tmp=two(l);
	System.out.println("任务编号\t开始时间\t到达时间\t服务时间\t完成时间\t周转时间\t带权周转时间");
	for(int i=0;i<tmp.size();i++) {
		System.out.println(tmp.get(i).getTaskId()+"\t"+tmp.get(i).getstartingTime()+"\t"+tmp.get(i).getarrivalTime()+"\t"+tmp.get(i).getserviceTime()+"\t"+tmp.get(i).getFinishTime()+"\t"+tmp.get(i).getturnAroundTime()+"\t"+tmp.get(i).getweightTurnAround());
	}
}
}
