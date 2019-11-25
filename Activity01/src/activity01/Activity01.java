
package activity01;

public class Activity01 {

    public static void main(String[] args) {

     for(int i = 4; i >= 0; i--) {
            for(int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
           System.out.println();
    }
          for(int i = 1; i <= 6; i++) {
            for(int j = 1; j <= i; j++) {
                if(i%2==0){
                System.out.print("* ");
                }
            }
            System.out.println();
    }
   
    }
    
}
