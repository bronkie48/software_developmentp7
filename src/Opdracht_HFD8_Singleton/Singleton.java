package Opdracht_HFD8_Singleton;

class Singleton 
{ 
 private static Singleton single_instance = null; 

 public String s; 

 private Singleton() 
 { 
     s = "Hallo, Ik ben een string uit de Singleton class"; 
 } 

 // static method om een instance te creeëren van de Singleton class 
 public static Singleton getInstance() 
 { 
     if (single_instance == null) 
         single_instance = new Singleton(); 

     return single_instance; 
 } 
} 