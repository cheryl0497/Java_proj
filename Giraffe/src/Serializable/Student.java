package Serializable;

import java.io.Serializable;

public class Student implements Serializable{
	private int rno;
	private String name;
	public int getRno() {
		return rno;
	}
	public void setRno(int rno) {
		this.rno = rno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [rno=" + rno + ", name=" + name + "]";
	}
	
	
}
