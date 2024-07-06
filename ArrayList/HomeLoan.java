package com.test;

import java.util.Scanner;

public class HomeLoan implements LoanCal {
public double princiAmt,loanAmount,roi=8.5;
int years;
Scanner sc=new Scanner(System.in);
public void acceptPrinciAmt() {
// TODO Auto-generated method stub
System.out.println("Enter principal amount:");
princiAmt=sc.nextDouble();
System.out.println("enter no of years:");
years=sc.nextInt();
}
public void calculate() {
// TODO Auto-generated method stub
loanAmount=(princiAmt*years*(8.5))/100;
System.out.println("your interest for said years are:"+loanAmount);
}
public static void main(String[] args) {
// TODO Auto-generated method stub
	HomeLoan obj=new HomeLoan();
     obj.acceptPrinciAmt();
     obj.calculate();
}
}

