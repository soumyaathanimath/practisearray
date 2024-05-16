/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practisearrays;

/**
 *
 * @author dell1
 */
public class Practisearrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
         int A[]={3,9,7,8,12,6,15,5,4,10};
        int max1,max2;
        
        max1=max2=A[0];
        
        for(int i=0;i<A.length;i++)
        {
            if(A[i]>max1)
            {
                max2=max1;
                max1=A[i];
                
            }
            else if(A[i]>max2)
            {
                max2=A[i];
            }
        }
        
        System.out.println("Second Largest is "+max2);
        
        
        
    }
    
    
    
    /* Searching a Key
    
        System.out.println("Eneter a Key " );
        key=sc.nextInt();
        
        
        for(int i=0;i<A.length;i++)
        {
            if(key==A[i])
            {
                System.out.println("Element Found at :"+i);
                System.exit(0);
            }
        }
        System.out.println("Not found");
    
        
    }*/
    /* Finding Sum of Elements
    public static void main(String[] args) 
    {
        int A[]={3,9,7,8,12,6,15,5,4,10};
        
        int sum=0;
        
        for(int x:A)
        {
            sum=sum+x;
        }
        
        System.out.println("Sum is "+sum);
        
        
        
    }  */ 
}
    
    
}
