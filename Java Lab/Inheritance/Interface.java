interface Bank
{ 
final int sc = 8;   
abstract int getROI();    
}    
class SBI implements Bank
{    
public int getROI(){
return 7;
}    
}    
class Axis implements Bank
{    
public int getROI(){
return 9;
}    
}  
class ICICI implements Bank
{    
public int getROI(){
return 12;
}    
}     
    
class Interface{    
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