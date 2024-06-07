package strings;

class StringQues{
    public static int occurance(String s,char c){
        int count=0;

        for(int i=0;i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }

        
        }
        return count;
    }

    public static void main(String[] args) {
        String str="Knowledge";
        char c='e';
        System.out.println(occurance(str, c));
        
    }
}

