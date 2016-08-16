import java.lang.Math;
import java.io.*;

public class P4
{
    public static void main(String[] args) throws Exception
    {
        
        //Use tangency rule
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int line1 = Integer.valueOf(br.readLine());
        double[][] inputarray = new double[line1][2];
        for(int i=0;i<line1;i++){
            String input = br.readLine();
            double x1 = Double.valueOf(input.split(" ")[0]);
            double y1 = Double.valueOf(input.split(" ")[1]);
            inputarray[i][0]=x1;
            inputarray[i][1]=y1;
        }
        
        for(int i=0;i<line1;i++){
            double x1 = inputarray[i][0]+0.000001;
            double y1 = inputarray[i][1];
            double m1 = (2*y1*x1+Math.sqrt(4*y1*y1*x1*x1-4*(x1*x1-1)*(y1*y1-1)))/2.0/(x1*x1-1);
            double m2 = (2*y1*x1-Math.sqrt(4*y1*y1*x1*x1-4*(x1*x1-1)*(y1*y1-1)))/2.0/(x1*x1-1);
            //output
            System.out.println("("+String.valueOf(-m2)+","+String.valueOf(1.0)+","+String.valueOf(y1-m2*x1)+","+String.valueOf(-m1)+","+String.valueOf(1.0)+","+String.valueOf(y1-m1*x1)+")");
            
        }    
        
    }
    
    
}