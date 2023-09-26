/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.*;
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		String s = "geeksOfGreeks";
		
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		
		for( Character ch : s.toCharArray())
        {
            if(map != null && map.get(ch) != null){
                
                map.put(ch, map.get(ch)+1);
            }else{
                map.put(ch,1);
            }
                    
        }		
		//System.out.println("map " +map);
		map.forEach(  (m,v) -> System.out.println( m+ " : "+v));
		//System.out.println(" "+);
	}
}
