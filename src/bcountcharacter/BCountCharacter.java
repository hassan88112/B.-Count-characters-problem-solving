
package bcountcharacter;

import java.util.Arrays;
import java.util.Scanner;

public class BCountCharacter {

    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);
        String value=input.next();
        char c[]=value.toCharArray();
        Arrays.sort(c);
        int arr[]=new int[125];
        
        for (int i=0 ;i < c.length;i++){
        arr[c[i]] = ++arr[c[i]];
        if (arr[c[i]] - 1 > 0){
    //     c[i]= (char) -1;
        }
        
        }
        for (int i=0;i<c.length;i++){
            
        if (c[i] != -1){
             System.out.println(c[i] + " " + arr[c[i]] );
       }
           
        }
        
    }
    
}
