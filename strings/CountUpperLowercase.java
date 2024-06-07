package strings;

class CountUpperLowercase{

public static void main(String[] args){
    int upper=0,lower=0;
    String strn="Java Tutorial";

    for(int i=0;i<strn.length();i++){
        char ch=strn.charAt(i);
        if(ch>='A' && ch<='Z'){
            upper++;
        }
        else if(ch>='a' && ch<='z'){
            lower++;
        }
    }
    System.out.println("uppercount is:"+upper);
    System.out.println("lowercount is:"+lower);


}
}