class Solution {
    public String reverseVowels(String s) {
        char[] arr =s.toCharArray();
        int j=s.length()-1;
        for(int i=0;i<s.length() && i<j;i++){
            char ch1=arr[i];
            char ch2=arr[j];
            if(isvowel(ch1) && isvowel(ch2)){
                char temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                j--;
            }
            
            
            else if(!isvowel(ch2)){
                i--;
                j--;
            }
        }
        return  new String(arr);
        
    }

    public static boolean isvowel(char ch){
        return ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'||ch=='A'||ch=='E'||ch=='I'||ch=='O'||ch=='U';
    }
}