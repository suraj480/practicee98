package com.ibs.training.litmus.lambda;
import java.util.ArrayList;
import java.util.Collection;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.OptionalDouble;
import java.util.function.BiConsumer;
import java.util.function.Supplier;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import static java.util.stream.Collectors.groupingBy;

class Employee{
	
	public Employee(int id) {
		this.id=id;
	}
	
	public Employee(int id,String name,String location,String department,int age,double salary) {
		this.id=id;
		this.name=name;
		this.location=location;
		this.salary=salary;
		this.age=age;
		this.department=department;
	}
	private int id,age;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	private String name,location,department;
	private double salary;
	
	public String toString() {
		return "Name "+name+" Age "+age;
	}
	
}

public class EmployeeTest{
	
	public static void main(String args[]) {
		
		List<Employee> list=new ArrayList<>();
		
		list.add(new Employee(1871,"Ganesh","COK","HR",34,48000.00));
		list.add(new Employee(1672,"Daison","TRV","HR",45,90000.00));
		list.add(new Employee(1073,"Athulya","TRV","HR",37,85000.00));
		list.add(new Employee(2784,"Sani","COK","HR",25,56000.00));
		list.add(new Employee(2345,"Rex","COK","Quality",29,85000.00));
		list.add(new Employee(1786,"Sam","COK","Quality",37,95000.00));
		list.add(new Employee(1567,"Steve","London","Sales",45,85000.00));
		list.add(new Employee(1068,"David","Tokyo","Sales",35,95000.00));
		list.add(new Employee(1049,"Bracken","Atlanta","Sales",25,675000.00));
		list.add(new Employee(1045,"Reefa","COK","Travel",35,45000.00));
		list.add(new Employee(1056,"Peter","Dubai","Travel",39,185000.00));
		list.add(new Employee(1078,"Smith","Singapore","Travel",45,85000.00));
		list.add(new Employee(2061,"Steve","Atlanta","Travel",30,67000.00));
		list.add(new Employee(3009,"clark","Paris","Travel",35,56000.00));
		list.add(new Employee(3006,"Craig","Paris","Travel",39,84000.00));
		list.add(new Employee(2081,"John","Dubai","Travel",25,90000.00));
		
		//list all employees
		//find out the average salary
		//find out the total salary
		//find out total salary of HR
		//SumamryStatitics
		//diff between filter and reduce & example of highest salary employee details
		//collect values - paris employees list
		
		//list.stream().forEach(System.out::println);//method reference 
				
		//list.stream().filter((emp)->emp.getLocation().equals("Paris")).forEach(System.out::println);
		
		//System.out.println("Average Salary of HR");
		
	//department wise grouping
		//oldest employee - you need to print all details 
		
		
		
	}
}