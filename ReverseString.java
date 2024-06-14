public class ReverseString
{
    public static void reverseString(String str, int index)
    {
        String name=str;
        if(index==0)
        {
            return;
        }
        else
        {
            System.out.print(name.charAt(index-1));
            reverseString(name, index-1);
            
        }
    
        
    }

public static void main(String args[])
{
    String name ="ARNAB";
    int nameLenght = 5;
    reverseString(name,nameLenght);
 
    
}
}