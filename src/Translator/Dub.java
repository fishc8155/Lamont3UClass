/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Translator;

import java.util.Scanner;

/**
 *
 * @author fishc8155
 */
public class Dub {
    static boolean isVowel(char v){
        if(v == 'a'||v == 'e'||v == 'i'||v == 'o'||v == 'u'){
            return true;
        }
        return false;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Type in the phrase you would like to convert to ubbi dubbi");
        
        String english = input.nextLine();
        StringBuilder result = new StringBuilder();
        boolean prevVowel = false;
        
        for (int i = 0; i < english.length(); i++){
            if (isVowel(english.charAt(i))){
                if(prevVowel==false)
                    result.append("ub");
                prevVowel=true;
            }
            else
                prevVowel=false;
            result.append(english.charAt(i));
            
            }
        System.out.println(result);
        }
        
        
        
       
                
    }

