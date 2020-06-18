package Opdracht_HFD8_Singleton;

class Main 
{ 
    public static void main(String args[]) 
    {  
        Singleton x = Singleton.getInstance(); 
        System.out.println("String van x is: " + x.s); 
    } 
} 