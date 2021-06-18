abstract class Bank
{    
abstract int getROI();    
}    
class SBI extends Bank
{    
int getROI(){
return 7;
}    
}    
class Axis extends Bank
{    
int getROI(){
return 9;
}    
}  
class ICICI extends Bank
{    
int getROI(){
return 12;
}    
}     
    
class Abstract{    
public static void main(String args[]){    
Bank b;  
b=new SBI();  
System.out.println("Rate of Interest is: "+b.getROI()+" %");    
b=new Axis();  
System.out.println("Rate of Interest is: "+b.getROI()+" %"); 
b=new ICICI();  
System.out.println("Rate of Interest is: "+b.getROI()+" %");     
}
}    