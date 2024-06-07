// Count the Occurrences of a Character in a String
// reverse String
// Palindrome
// Remove Duplicates
// WAP   to  count String of frequency
// count lowercase and upparcase
// remove lowercase
// Count the Number of Vowels in a String
// WAP to Find the First Non-Repeated Character in a String

package strings;



class reverse {
    public static void main(String[] args){
        String str="Rahul";
        String rev="";
        char ch;

        for(int i =0;i<str.length();i++){
            ch=str.charAt(i);
            rev=ch+rev;
        }

        System.out.println("Reverse String :"+rev);
    }   
}
