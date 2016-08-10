/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author osboxes
 */
public class Validador {
    
    public static boolean isString(String str){
        return str != null && str instanceof String;
    }
    public static boolean isString(String str,int len_max){
        if(str!= null && str instanceof String )
            if(str.length() >= len_max)
                return true;
        return false;
    }
    public static boolean isString(String str,int len_max, int len_min){
        if(str!= null && str instanceof String)
            if(str.length() <= len_max)
                if(str.length() >= len_min)
                    return true;
        return false;
    }
    public static boolean hasStringForm(String str, String pattern){
        if(pattern != null && str != null){
            Pattern r = Pattern.compile(pattern);
            Matcher m = r.matcher(str);
            
            boolean op = m.find();
            return op;
        }
        return false;
    }
    
}
