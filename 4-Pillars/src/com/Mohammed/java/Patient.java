package com.Mohammed.java;
import java.util.*;
class Patient {
private String patientName;
private String social;
private String dateOfBirth;
private String address;
private String illness;
  private ArrayList<Payment> payments;
  public Patient(String patientName, String social){
    this.patientName = patientName;
    this.social = social;
    payments = new ArrayList<>();}
  public Patient(String patientName, String social, String dateOfBirth, String illness){
    this.patientName = patientName;
    this.social = social;
    this.dateOfBirth = dateOfBirth;
    this.illness = illness;
    payments = new ArrayList<>();}
  public void setPatientName(String patientName){
    this.patientName = patientName;}
  public String getPatientName(){
    return patientName;}
    public void setSocial(String social){
    this.social = social;}
  public String getSocial(){
    return social;}
  public void setDateOfBirth(String dateOfBirth){
    this.dateOfBirth = dateOfBirth;}
  public String getDateOfBirth(){
    return dateOfBirth;}
public void setIllness(String illness){this.illness=illness;}
public String getIllness(){return illness;}
  public void payment(double amount, String patientName){
    this.patientName = patientName;}
public String toString() {
		return "patientName=" + patientName + ", social=" + social + ", dateOfBirth=" + dateOfBirth + ", illness=" + illness + "]";
	}}