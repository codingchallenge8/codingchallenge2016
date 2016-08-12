import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main3 {

    public static void main(String[] args) {
        
        final double[][] matrix = new double[][]{
                {1.0, 3.0, 24.0, 240.0, 5280.0, 15840.0, 190080.0, 1.9008E8},
                {0.3333333333333333, 1.0, 8.0, 80.0, 1760.0, 5280.0, 63360.0, 6.336E7},
                {0.041666666666666664, 0.125, 1.0, 10.0, 220.0, 660.0, 7920.0, 7920000.0},
                {0.004166666666666667, 0.0125, 0.1, 1.0, 22.0, 66.0, 792.0, 792000.0},
                {1.893939393939394E-4, 5.681818181818182E-4, 0.004545454545454545, 0.045454545454545456, 1.0, 3.0, 36.0, 36000.0},
                {6.313131313131312E-5, 1.8939393939393937E-4, 0.001515151515151515, 0.01515151515151515, 0.3333333333333333, 1.0, 12.0, 12000.0},
                {5.260942760942761E-6, 1.5782828282828283E-5, 1.2626262626262626E-4, 0.0012626262626262625, 0.027777777777777776, 0.08333333333333333, 1.0, 1000.0},
                {5.26094276094276E-9, 1.578282828282828E-8, 1.2626262626262623E-7, 1.2626262626262625E-6, 2.7777777777777776E-5, 8.333333333333333E-5, 0.001, 1.0}

        };
        
        
        BufferedReader br = null;
        
        int startIndex = 0, endIndex = 0;
        
        try {

            // Refer to this http://www.mkyong.com/java/how-to-read-input-from-console-java/
            // for JDK 1.6, please use java.io.Console class to read system input.
            br = new BufferedReader(new InputStreamReader(System.in));

           // while (true) {

//                System.out.print("Enter something : ");
                String input = br.readLine();
                    
                //split into arguments
                String strArr[] = input.split(" ");
             
                switch(strArr[1]){
                
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
                
                switch(strArr[3]){
                
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
                
                //double result = num;
                double result = Double.parseDouble(strArr[0]) * matrix[startIndex][endIndex];
                
                
//                if (startIndex < endIndex){
//           
//                  //multiply all
//                  for (int i = startIndex; i < endIndex; i++){
//                      result *= intArr[i];
//                  }
//                }
//                if (startIndex > endIndex){
//                  //divide all
//                  for (int i = startIndex-1; i >= endIndex; i--){
//                      result /= intArr[i];
//                  }
//                }
                System.out.println(result);

           // }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

    }

}
