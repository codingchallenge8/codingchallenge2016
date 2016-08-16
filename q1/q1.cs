using System;

public class Test
{
    public static void Main()
    {
        // your code goes here
        int[] intArr = new int[] {3,8,10,22,3,12,1000};
        int startIndex = 0, endIndex = 0;
        
        string line = Console.ReadLine();
        string[] words = line.Split(' ');

        switch(words[1]){
                
                    case "thou": 
                    case "th"  : startIndex = 7;break;
                        
                    case "inch":
                    case "in": startIndex = 6;break;
                    
                    case "foot":
                    case "ft":startIndex = 5;break;
                        
                    case "yard": 
                    case "yd"  : startIndex = 4; break;
                        
                    case "chain":
                    case "ch": startIndex = 3;break;
                    
                    case "furlong":
                    case "fur": startIndex = 2;break;
                        
                    case "mile": 
                    case "mi"  : startIndex = 1; break;
                        
                    case "league":
                    case "lea": startIndex = 0; break;
                    
                    
                    
                
                    default: break;
                }
                
                switch(words[3]){
                
                case "thou": 
                case "th"  : endIndex = 7;break;
                    
                case "inch":
                case "in": endIndex = 6;break;
                
                case "foot":
                case "ft":endIndex = 5;break;
                    
                case "yard": 
                case "yd"  : endIndex = 4; break;
                    
                case "chain":
                case "ch": endIndex = 3;break;
                
                case "furlong":
                case "fur": endIndex = 2;break;
                    
                case "mile": 
                case "mi"  : endIndex = 1; break;
                    
                case "league":
                case "lea": endIndex = 0; break;

            
                default: break;
            }
            
            double result = double.Parse(words[0]);
            if (startIndex < endIndex){
                //multiply all
                for (int i = startIndex; i < endIndex; i++){
                    result *= intArr[i];
                }
            }
            if (startIndex > endIndex){
                //divide all
                for (int i = startIndex-1; i >= endIndex; i--){
                    result /= intArr[i];
                }
            }
            Console.WriteLine(result);
    }
}
