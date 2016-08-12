import java.util.HashMap;
import java.util.StringTokenizer;
import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.BufferedOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.io.OutputStream;



class CarGamee {
	
	//a = 10
	//b = 11
	//y = 34
	//z = 35
	
	
    public static void main(String[] args)    {


	        Kattio io = new Kattio(System.in, System.out);
	        
	        int word_count = io.getInt();
	        int plate_count = io.getInt();
	        int alpha_size = 'z' - 'a' + 1;
	        
	        boolean[] p1 = new boolean[alpha_size];
	        boolean[][] p2 = new boolean[alpha_size][alpha_size];
	        int[][][] p3 = new int[alpha_size][alpha_size][alpha_size];
	        
	        for(int i = 0; i < alpha_size; ++i)
	        {
	        	for(int j = 0; j < alpha_size; ++j)
	        	{
	        		for(int k = 0; k < alpha_size; ++k)
	        		{
	        			p3[i][j][k] = -1;
	        		}
	        	}
	        }
	        
	        String[] words = new String[word_count];
	        
	        for(int i = 0; i < word_count; ++i)
	        {
	        	for(int j = 0; j < alpha_size; ++j)
	        	{
	        		p1[j] = false;
	        		
	        		for(int k = 0; k < alpha_size; ++k)
	        		{
	        			p2[j][k] = false;
	        		}
	        	}
	        	
	        	String word = io.getWord();
	        	int word_length = word.length();
	        	
	        	for(int j = 0; j < word_length; ++j)
	        	{
	        		for(int k = 0; k < alpha_size; ++k)
	        		{
	        			for(int l = 0; l < alpha_size; ++l)
	        			{
	        				if(p2[k][l] && p3[k][l][word.charAt(j) - 'a'] == -1)
	        				{
	        					p3[k][l][word.charAt(j) - 'a'] = i;
	        				}
	        				
	        			}
	        			
	        			p2[k][word.charAt(j) - 'a'] |= p1[k];
	        		}
	        		
	        		p1[word.charAt(j) - 'a'] = true;
	        	}
	        	
	        	words[i] = word;
	        }
	        
	        for(int i = 0; i < plate_count; ++i)
	        {
	        	String plate = io.getWord();
	        	
	        	int ans = p3[plate.charAt(0) - 'A'][plate.charAt(1) - 'A'][plate.charAt(2) - 'A'];
	        	if(ans == -1)
	        	{
	        		io.write("No valid word\n");
	        	}
	        	else
	        	{
	        		io.write(words[ans] + "\n");
	        	}
	        }
	    	
    		io.flush();
		    io.close();
    
    }
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
  
    static class Kattio extends PrintWriter    {
        
        public Kattio(InputStream i)    {
            super(new BufferedOutputStream(System.out));
            r = new BufferedReader(new InputStreamReader(i));
        }
        
        public Kattio(InputStream i, OutputStream o) {
            super(new BufferedOutputStream(o));
            r = new BufferedReader(new InputStreamReader(i));
        }
    
        public boolean hasMoreTokens() {
            return peekToken() != null;
        }
    
        public int getInt() {
            return Integer.parseInt(nextToken());
        }
    
        public double getDouble() {
            return Double.parseDouble(nextToken());
        }
    
        public long getLong() {
            return Long.parseLong(nextToken());
        }
    
        public String getWord() {
            return nextToken();
        }
        
        private BufferedReader r;
        private String line;
        private StringTokenizer st;
        private String token;
    
        private String peekToken() {
            if (token == null)
            try 
            {
                while (st == null || !st.hasMoreTokens()) 
                {
                    line = r.readLine();
                    if (line == null) return null;
                    st = new StringTokenizer(line);
                }
                
                
                token = st.nextToken();
            } 
            catch (IOException e) 
            { 
                
            }
            return token;
        }
    
        private String nextToken() {
            String ans = peekToken();
            token = null;
            return ans;
        }
    }
}








