class Solution {
    public String[] findWords(String[] words) {
        String row1 = "qwertyuiop";
        String row2 = "asdfghjkl";
        String row3 = "zxcvbnm";
        String row = "";
        int count = 0;
        String[] ans = new String[words.length];
        
        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            String lowerword = words[i].toLowerCase();
            
            if (row1.contains("" + lowerword.charAt(0))) {
                row = row1;
            } else if (row2.contains("" + lowerword.charAt(0))) {
                row = row2;
            } else {
                row = row3;
            }
            
            boolean check = true;
            for (int j = 0; j < lowerword.length(); j++) {
                if (!row.contains("" + lowerword.charAt(j))) {
                    check = false;
                    break;
                }
            }
            if (check) {
                ans[count] = words[i];
                count++;
            }
        }
        
       
        String[] result = new String[count];
        for (int k = 0; k < count; k++) {
            result[k] = ans[k];
        }
        
        return result;
    }
}