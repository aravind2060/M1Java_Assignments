package com.cpg.lab2.abstractclasses;

public abstract class AbstractItem 
{
 private int identificationNumber;
 private int noOfCopies;
 private String title;
 
  public AbstractItem(int identificationNumber,int noOfCopies,String title)
   {
	   this.identificationNumber=identificationNumber;
	   this.noOfCopies=noOfCopies;
	   this.title=title;
   }

public int getIdentificationNumber() {
	return identificationNumber;
}

public int getNoOfCopies() {
	return noOfCopies;
}

public String getTitle() {
	return title;
}

public void setIdentificationNumber(int identificationNumber) {
	this.identificationNumber = identificationNumber;
}

public void setNoOfCopies(int noOfCopies) {
	this.noOfCopies = noOfCopies;
}

public void setTitle(String title) {
	this.title = title;
}

@Override
public String toString() {
	return "AbstractItem [identificationNumber=" + identificationNumber + ", noOfCopies=" + noOfCopies + ", title="
			+ title + "]";
}


@Override
public boolean equals(Object obj) {
	if (this == obj) {
		return true;
	}
	if (!(obj instanceof AbstractItem)) {
		return false;
	}
	AbstractItem other = (AbstractItem) obj;
	if (identificationNumber != other.identificationNumber) {
		return false;
	}
	if (noOfCopies != other.noOfCopies) {
		return false;
	}
	if (title == null) {
		if (other.title != null) {
			return false;
		}
	} else if (!title.equals(other.title)) {
		return false;
	}
	return true;
}
  
abstract public void checkOut();
abstract public void print();
abstract public void checkIn(); 
abstract public void addItem();
   
}
