class StringBuffer1
{
  public static void main(String[] args)
  {
      StringBuffer s1 = new StringBuffer("Welcome ");
      StringBuffer s2 =  new StringBuffer(" to Java Programming");
      System.out.println("Adding two strings:"+s1.append(s2));
      System.out.println("Inserting into the string:"+s1.insert(0,"a Hello "));
      System.out.println("Deleting a part of the string:"+s1.delete(0,2));
      System.out.println("Deleting a particular charcater:"+s1.deleteCharAt(13));
      System.out.println("Reversing the string:"+s1.reverse());
      System.out.println("Replacing a part of the string:"+s1.replace(0,2,"Hi"));
      System.out.println("Printing the character at agiven Position:"+s1.charAt(3));
      System.out.println("Printing the part of the string:"+s1.substring(3,6));
      System.out.println("printing the Index of a character:"+s1.indexOf("m"));
      System.out.println("Last Index"+s1.lastIndexOf("m"));
      StringBuffer s3 = new StringBuffer("Lily");
      System.out.println("Printing the index of second l:"+s3.indexOf("l",2));
      s3.setCharAt(0,'s');
      System.out.println("set the character at 0 to s:"+s3);
      StringBuffer s4 = new StringBuffer("flower");  
      System.out.println("Capacity:"+s4.capacity());
     
  }
}