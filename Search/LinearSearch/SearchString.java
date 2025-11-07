package Search;

public class SearchString {
    public static void main(String[] args){
        String name="Atharva";
        char target='h';
        System.out.println(isStringFound(name, target));
    }   
    
    static boolean isStringFound(String str, char target){
        if(str.length()==0){
            return false;
        }
        
        for(int i=0;i<str.length();i++){
            if(str.charAt(i)==target){
                return true;
            }
        }
        return false;
    }
}
