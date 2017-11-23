package FCFS;

public class task {
	private int taskId;
	private int arrivalTime;
	private int serviceTime;
	private int startingTime;
	private int finishingTime;
	private int turnAroundTime;
	public int status;
	private double weightTurnAround;
public task() {
	}
public task(int Id,int aTime,int sTime,int startTime) {
	this.taskId=Id;
	this.arrivalTime=aTime;
	this.serviceTime=sTime;
	this.startingTime=startTime;
	this.finishingTime=this.startingTime+this.serviceTime;
	this.turnAroundTime=this.finishingTime-this.arrivalTime;
	this.weightTurnAround=this.turnAroundTime/this.serviceTime;
}
public task(int Id,int aTime,int sTime) {
	this.taskId=Id;
	this.arrivalTime=aTime;
	this.serviceTime=sTime;
}
public void setTaskId(int x) {
	taskId=x;
	status=0;
}
public void setarrivalTime(int x) {
	arrivalTime=x;
}
public void setserviceTime(int x) {
	serviceTime=x;
}
public void setstartingTime(int x) {
	startingTime=x;
}
public void finishingTime() {
	finishingTime=this.startingTime+this.serviceTime;
}
public void turnAroundTime() {
	turnAroundTime=this.finishingTime-this.arrivalTime;
}
public void weightTurnAround() {
	weightTurnAround=(double)this.turnAroundTime/(double)this.serviceTime;
	status=1;
}
public int getTaskId() {
	return taskId; 
}
public int getFinishTime() {
	return finishingTime; 
}
public int getarrivalTime() {
	return arrivalTime; 
}
public int getserviceTime() {
	return serviceTime; 
}
public int getstartingTime() {
	return startingTime; 
}
public int getturnAroundTime() {
	return turnAroundTime; 
}
public double getweightTurnAround() {
	return weightTurnAround; 
}
}