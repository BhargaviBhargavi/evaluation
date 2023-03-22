    public class Characters   
    {  
         public static void main(String[] args) {  
            String str = "grass is greener on the other side";  
            int a[] = new int[str.length()];  
            char minc = str.charAt(0),maxc  = str.charAt(0);  
            int i, j, min, max;          
              char str1[] = str.toCharArray();  
               
            for(i = 0; i < str1.length; i++) {  
                a[i] = 1;  
                for(j = i+1; j < str1.length; j++) {  
                    if(str1[i] == str1[j] && str1[i] != ' ' && str1[i] != '0') {  
                        a[i]++;   
                        str1[j] = '0';  
                    }  
                }  
            }  
              
           
            min = max = a[0];  
            for(i = 0; i <str1.length; i++) {  
                  
          
                if(min >a[i] && a[i] != '0') {  
                    min = a[i];  
                    minc = str1[i];  
                }  
  
                if(max < a[i]) {  
                    max = a[i];  
                    maxc = str1[i];  
                }  
            }  
              
            System.out.println( minc);  
            System.out.println(maxc);  
        }  
    }  
