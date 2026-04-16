package Homework_2;

public class Runner {
    public static void main(String[] args) {

    	// 1
    	class Counter {
    	     int count = 1;

    	    public Counter() {
    	        count++;
    	    }

    	    public int getSumma(int a, int b) {
    	        return a + b;
    	    }
    	}

    	// 2
    	class Bank {
    	    private static Bank instance;
    	    private int balance = 0;

    	    private Bank() {}

    	    public static Bank getInstance() {
    	        if (instance == null) {
    	            instance = new Bank();
    	        }
    	        return instance;
    	    }

    	    public void deposit(int amount) {
    	        balance += amount;
    	    }

    	    public int getBalance() {
    	        return balance;
    	    }
    	}
//3
   //?
    	//4
    	public class Student {
    	    private String name;
    	    private int grade;
    	    private static int totalStudents = 0;
    	    
    	    public Student(String name, int grade) {
    	    	if (grade >= 85) return "отлично";
    	    }
    	    
    	    public String getStatus() {
    	    	else if (grade >= 75) return "хорошо";
    	    }
    	    
    	    public static int getTotalStudents() { return totalStudents; }
    	    
    	    @Override
    	    public String toString() {
    	    	return "Student{name='" + name + "', grade=" + grade + ", status='" + getStatus() + "'}";
    	    	//5
    	    	
    	    }
    	}
    	


