import java.util.*;

public class JavaBasics{
        public static void hollow_rect(int n){
           //outer loop
            for(int i=1; i<=n;i++){
                //inner loop for 
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                // for(int j=1; j<=i; j++){
                //     //star
                //     System.out.print("*");
                // }
                System.out.println();
                
            }
            for(int i=n; i>=1;i--){
                //inner loop for 
                for(int j=1; j<=i; j++){
                    System.out.print("*");
                }
                for(int j=1;j<=2*(n-i);j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=i;j++){
                    System.out.print("*");
                }
                // for(int j=1; j<=i; j++){
                //     //star
                //     System.out.print("*");
                // }
                System.out.println();
                
            }
            
        }
        public static void hollow_roh(int n) {
            for(int i=1;i<=n;i++){
                for(int j=1;j<=(n-i); j++){
                    System.out.print(" ");
                }
                for(int j=1; j<=n; j++){
                    if(i==1|| i==n || j==1 || j==n ){
                        System.out.print("*");

                    }else{
                        System.out.print(" ");
                    }

                }
                System.out.println();
                    
                }
            }
            
        
        public static void rohmbus(int n){
            for(int i=1; i<=n; i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" ");
                }
                for(int j=1;j<=n;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }

        
    
    
    public static void main(String args[]){
        hollow_roh(15);
        
    }                 
}
    