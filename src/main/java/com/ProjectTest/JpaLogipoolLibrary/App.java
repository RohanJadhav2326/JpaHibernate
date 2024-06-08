package com.ProjectTest.JpaLogipoolLibrary;



import java.util.Scanner;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class App 
{
    public static void main( String[] args )
    {
    	Scanner sc=new Scanner(System.in);
    	EntityManagerFactory emf=Persistence.createEntityManagerFactory("TP");
        EntityManager em=emf.createEntityManager();
        
        
        int flag=1;
        
       while(flag!=0) {
        System.out.println("1.Insert Data.");
       	System.out.println("2.Update Data.");
       	System.out.println("3.Find Data.");
       	System.out.println("4.Delete Data.");
       	System.out.println("5.Exit.");
       	System.out.println("Enter your choise: ");
       	
       	int choise=sc.nextInt();
       	
       	switch(choise) {
       	case 1:{
       		
       		 em.getTransaction().begin(); 
       	        
       	        System.out.println("Enter LID:");
       	        int lid=sc.nextInt();
       	        
       	        System.out.println("Enter LName:");
       	        String lname=sc.next();
       	        
       	     
       	     
       	        System.out.println("Enter SID:");
    	        int sid=sc.nextInt();
    	        
    	        
       	        System.out.println("Enter SName:");
    	        String sname=sc.next();
       	        
    	        System.out.println("Enter Address:");
       	        String address=sc.next();
       	        
       	      
       	        System.out.println("Enter College:");
    	        String college=sc.next();
       	        	        
       	        Library obj=new Library(lid,lname, null);
       	     
       	        Student obj1=new Student(sid,sname,address,college);
       	    	em.persist(obj1);
       			em.getTransaction().commit();
       			break;
       		
       	}
       	case 2:{
       		em.getTransaction().begin();
       		System.out.println("Enter the LId: ");
   			int lid=sc.nextInt();
   			
   			Library obj=em.find(Library.class, lid);
   			

   			System.out.println("Enter the LName: ");
   			String lname=sc.next();
   			
   			
   			
   			obj.setLname(lname);
   			em.persist(obj);
   			
   			em.getTransaction().commit();
   			break;
       	}
       	case 3:{
       		System.out.println("Enter the LId: ");
   			int lid=sc.nextInt();
   			
   			 Library obj=em.find(Library .class, lid);
   			System.out.println(obj);
   			
   			break;
       	}
       	case 4:{
       		em.getTransaction().begin();
   			
   			System.out.println("Enter the LId: ");
   			int lid=sc.nextInt();
   			
   			Library obj=em.find(Library.class, lid);
   			em.remove(obj);
   			em.getTransaction().commit();
   			break;
    }
       	case 5:{
   			flag=0;
   			continue;
   		}
   		default:{
   			System.out.println("Invalid Input.");
   		}
}
       	System.out.println("Do you want to continue...yes...or...no");
    	String str=sc.next();
    	if(str.equals("yes")) {
    		
    	}else {
			flag=0;
		}
}
}
}
