

import java.io.*;



class text{
    public static  void main(String arg[])
    {
        System.out.println("\n1. Length of String\n2.Convert in Upper Case\n3. Convert in Lower Case\n4. Find Substring\n5. Palindrome\n6. Exit \nChoose Option");
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        
        try {
            String str = br.readLine();
            System.out.println(str);
            
        } catch (Exception e) {
            
           // System.out.println(str);
        }
    }
}