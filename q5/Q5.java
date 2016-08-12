import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class IntegerList {
	  
		static String instructions = "";
		static int arrLen = 0;
		static String arrStringRep = "";
		static String[] arr;
		static int numTestCase = 0;
		static BufferedReader br = null;
		static int a = 0;
		static int b = 0;
		static boolean reversed = false;
		static boolean error = false;
		static char c;
		static StringBuilder sb0 = new StringBuilder();
		 public static void main(String[] args){
		    	
	    	try{
	  	
		    	
		    	 br = new BufferedReader(new InputStreamReader(System.in));
		    	numTestCase = Integer.parseInt(br.readLine());
		    	
    	
		    	int count = 0;
		    	while (count < numTestCase){
		    		
		    		
		    		instructions = br.readLine();
		    		arrLen = Integer.parseInt(br.readLine());
		    		arrStringRep = br.readLine();
		    		
		    		//System.out.println("len" + arrLen);
		    		if (arrLen > 0){
		    			
		    			arrStringRep = arrStringRep.substring(1,arrStringRep.length()-1);
		    			arr = arrStringRep.split(",");
		    			if (arrStringRep.trim().equals("")) arr = new String[0];
		    			
		    			
		    			//arr = array.toArray(new String[0]);
		    			
		    			a = 0;
		    			b = arr.length;
		    			
		    			 reversed = false;
		    			 error = false;
		    			
		    			//System.out.println("here:" + a +" "  + b);
		    			for (int i = 0; i < instructions.length(); i++){
		    			    c = instructions.charAt(i);
		    				
		    				if (c == 'R'){
		    					reversed = !reversed;
		    				}
		    				else if (c == 'D'){
		    					
		    					if (reversed==false){
		    						a += 1;
		    					}
		    					else{
		    						b -= 1;
		    					}
		    					
		    					//error check
		    					if ( a > b) {
		    						error = true;
		    						break;
		    					}
		    					
		    					
		    				}
		    				
		    				//System.out.println("here:" + a +" "  + b);
		    				
		    			}
		    			
		    			if (error){
		    				System.out.println("error");
		    			}else{
			    			//print result
		    				//System.out.print("[");
		    				
		    				sb0.setLength(0);
		    				sb0.append("[");
			    			if (!reversed){
			    				for (int i = a; i < b; i ++){
//			    					System.out.print(arr[i]);
			    					sb0.append(arr[i]);
			    					if (i != b-1) sb0.append(",");
			    				}
			    			}else{
			    				for (int i = b-1; i >= a; i --){
//			    					System.out.print(arr[i]);
			    					sb0.append(arr[i]);
			    					if (i != a) sb0.append(",");
			    				}
			    			}
			    			sb0.append("]");
			    			System.out.println(sb0.toString());
//			    			System.out.println("]");
			    			
			    			
		    			}

		    		}
		    		
		    		else{
		    			if (instructions.contains("D")) {
		    				System.out.println("error");
		    			}else{
		    				System.out.println("[]");
		    			}
		    		}

		    		count ++;
		    	}
		    	
		    
		    	


	    	}catch(Exception e){
	    	e.printStackTrace();	
	    	}
		 }
}
