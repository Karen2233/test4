package FCFS;
import java.io.*;
import java.util.*;
public class single {
	public List<task> singleQueue(List<task> l) {
		int time=0;
		int startTime;
		boolean status=true;
		for(int i=0;i<l.size();i++) {
			if(status==true) {
				l.get(i).setstartingTime(time);
				l.get(i).finishingTime();
				l.get(i).turnAroundTime();
				l.get(i).weightTurnAround();
				status=false;
				time=l.get(i).getFinishTime();
			}
			else {
			startTime=time+1;
			l.get(i).setstartingTime(startTime);
			l.get(i).finishingTime();
			l.get(i).turnAroundTime();
			l.get(i).weightTurnAround();
			time=l.get(i).getFinishTime();
			}
		}
		return l;
	}
	public void carryOut(List<task> l) {
		List<task> tmp=singleQueue(l);
		System.out.println("������\t��ʼʱ��\t����ʱ��\t����ʱ��\t���ʱ��\t��תʱ��\t��Ȩ��תʱ��");
		for(int i=0;i<tmp.size();i++) {
			System.out.println(tmp.get(i).getTaskId()+"\t"+tmp.get(i).getstartingTime()+"\t"+tmp.get(i).getarrivalTime()+"\t"+tmp.get(i).getserviceTime()+"\t"+tmp.get(i).getFinishTime()+"\t"+tmp.get(i).getturnAroundTime()+"\t"+tmp.get(i).getweightTurnAround());
		}
	}

}
