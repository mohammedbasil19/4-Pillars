package com.Mohammed.java;
class Main {
	  public static void main(String[] args) {
	    Patient P=new Patient("John", "12345");
	   P.setIllness("cold");
	    Payment pp=new Payment(99.95, "June 15 2021");
	  System.out.println(pp.toString());
	  System.out.println("Patient "+P.getPatientName());
	    System.out.println("The following are the payments due");
	System.out.println(pp.toString());
	System.out.println("The total amount due is "+ pp.getAmount());
		}}