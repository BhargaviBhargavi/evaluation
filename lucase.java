    public class changeCase {  
        public static void main(String[] args) {  
              
            String str1="Great PoWer";  
            StringBuffer str=new StringBuffer(str1);  
              
            for(int i = 0; i < str1.length(); i++)
             {  
                  if(Character.isLowerCase(str1.charAt(i)))
                 {    
                    str.setCharAt(i, Character.toUpperCase(str1.charAt(i)));  
                }  
               
                else if(Character.isUpperCase(str1.charAt(i))) {  
                    str.setCharAt(i, Character.toLowerCase(str1.charAt(i)));  
                }  
            }  
            System.out.println(str);  
        }  
    }  
