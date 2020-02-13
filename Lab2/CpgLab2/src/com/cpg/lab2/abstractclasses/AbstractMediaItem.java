package com.cpg.lab2.abstractclasses;

public abstract class AbstractMediaItem extends AbstractItem
{
	 private int runTime;
     public AbstractMediaItem(int identificationNumber, int noOfCopies, String title,int runTime) {
		super(identificationNumber, noOfCopies, title);
		this.runTime=runTime;
	}
	public int getRunTime() {
		return runTime;
	}
	public void setRunTime(int runTime) {
		this.runTime = runTime;
	}

	
     
}
