using System;
using System.Collections.Generic;

public class IntPair : IComparable<IntPair>
{
    public int x { get; set; }

    public int y { get; set; }

	public override string ToString()
    {
        return "x: " + x + "   y: " + y;
    }
    
    public int CompareTo(IntPair compareO)
    {
        // A null value means that this object is greater.
        if (x < compareO.x) return -1;
        if (x > compareO.x) return 1;
        if (y < compareO.y) return -1;
        if (y > compareO.y) return 1;
        return 0;
    }
    

}

public class Test
{
	
	public static void Main()
	{
		// your code goes here
		List<IntPair> list = new List<IntPair>();
		int numMinion = Int32.Parse(Console.ReadLine());

		for (int i=0; i < numMinion; i++){
			string line = Console.ReadLine();
			string[] words = line.Split(' ');
			IntPair ip = new IntPair() { x= Int32.Parse(words[0]), y=Int32.Parse(words[1]) };
			list.Add(ip);
		}
		
		list.Sort();
		int counter = 1;
		int highestY = list[0].y;
		foreach (IntPair ip in list)
        {
        	if (ip.x <= highestY){
        		if (ip.y <= highestY){
        			highestY = ip.y;
        		}
        		continue;
        	}
        	
        	counter++;
        	highestY = ip.y;
            
        }
        
        Console.WriteLine(counter);

	}
}