class String1
{
   public static void main(String[] args)
{
     String s1 = new String("I am");
     System.out.println("Concatenating the string:"+s1.concat(" Spandana"));
     System.out.println("Length of the string:"+s1.length());
     System.out.println("Character at particular index:"+s1.charAt(2));
     System.out.println("Comparing the string:"+s1.compareTo("i am"));
     System.out.println("Checking whether both string are equal or not:"+s1.equals("iam"));
     System.out.println("Checking whether the string starts with I"+s1.startsWith("I"));
     System.out.println("Checking whethefr the string ends with I:"+s1.endsWith("I"));
     System.out.println("Index of a is:"+s1.indexOf("a"));
     System.out.println("last index of a is:"+s1.lastIndexOf("a"));
     System.out.println("the substring is:"+s1.substring(2));
     System.out.println("Changing into Lower case:"+s1.toLowerCase());
     System.out.println("Changing into upper case:"+s1.toUpperCase());
     String s2 = new String("   Spandana");
     System.out.println("removing the white spaces:"+s1 + s2.trim());
     String a[] = s1.split("");
     System.out.println("Splitting the String:");
     for(int i = 0;i < a.length;i++)
     {
          System.out.println(a[i]);
     }
     System.out.println("Replacing the string:"+s1.replace("I","s"));
     System.out.println("Comparing while ignoring the case:"+s1.compareToIgnoreCase("i am"));
     System.out.println("Comparing While ignoring the case:"+s1.equalsIgnoreCase("i am"));
}
}