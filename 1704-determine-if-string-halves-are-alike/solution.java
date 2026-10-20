class Solution {


    public static boolean isvowel(char a){
        if(a=='a'|| a=='e'|| a=='i'|| a=='o'|| a=='u'){
            return true;
        }return false;
    }

    public boolean halvesAreAlike(String s) {
        int mid=s.length()/2;
        String first =s.substring(0,mid).toLowerCase();
        String second=s.substring(mid).toLowerCase();
        int countvowel=0;
        

        for(int i=0;i<first.length();i++){
            if(isvowel(first.charAt(i))){
                countvowel++;
            }
            if(isvowel(second.charAt(i))){
                countvowel--;
            }
        }



       

        return countvowel==0;

        
    }
}