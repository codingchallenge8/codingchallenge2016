/* package whatever; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

class IntPair implements Comparable <IntPair> {
  final int x;
  final int y;
  IntPair(int x, int y) {this.x=x;this.y=y;}
  
  @Override
  public int compareTo(IntPair o){
    if (this.x < o.x) return -1;
    if (this.x > o.x) return 1;
    if (this.y < o.y) return -1;
    if (this.y > o.y) return 1;
    return 0;
  }
}

/* Name of the class has to be "Main" only if the class is public. */
class Ideone
{
    public static void main (String[] args) throws java.lang.Exception
    {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        int numMinions = Integer.parseInt(in.readLine());
        List<IntPair> list = new ArrayList<IntPair>();
        
        for (int i = 0; i < numMinions; i++) {
            String line = in.readLine();
            String[] strArr = line.split(" ");
            
            list.add(new IntPair(Integer.parseInt(strArr[0]), Integer.parseInt(strArr[1])));
        }
        Collections.sort(list);
        
        int counter = 1;
        int currentThreshold = list.get(0).y;
        for(IntPair ip : list){
            if (ip.x <= currentThreshold){
                if (ip.y <= currentThreshold)
                    currentThreshold = ip.y;
                continue;
            } 
            counter++;
            currentThreshold = ip.y;
        }
        System.out.print(counter);
        in.close();
    }
}
