package com.learning.entity;



public class Student {
	private int rollno;
	private String name;
	private int m1;
	private int m2;
	private Address address;
	private int percent;
	private int total;
	
	public Student(int rollno, String name, int m1, Address address, int m2, int percent, int total) {
		super();
		this.rollno = rollno;
		this.name = name;
		this.m1 = m1;
		this.address = address;
		this.m2 = m2;
		this.percent = percent;
		this.total=total;
	}
	
	public Student() {
		super();
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getM1() {
		return m1;
	}

	public void setM1(int m1) {
		this.m1 = m1;
	}

	public int getM2() {
		return m2;
	}

	public void setM2(int m2) {
		this.m2 = m2;
	}

	public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}


	public void calctotal() {
		// TODO Auto-generated method stub
		total = m1 + m2;
	}
	
	public int getTotal() {
		return total;
	}
	
	public int getPercent() {
		return total/2;
	}
	

	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", name=" + name + ", m1=" + m1 + ", m2=" + m2 + ", address=" + address
				+ ", percent=" + percent + ", total=" + total + "]";
	}
	
	
	
}

