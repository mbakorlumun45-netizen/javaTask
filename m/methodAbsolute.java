public class methodAbsolute{
    public static int getAbsoluteValue(int number){
    
    int value = 0;
    if(number >= 0){
        value = number;
    }else{
        value = number *-1;
    }
    return value;  
    } 
    public static void main(String[] args){

    int valueResult = -6;

    System.out.println(getAbsoluteValue(valueResult));
    }
}

