class Solution {
    public boolean backspaceCompare(String s, String t) {
        Deque <Character> sts = new ArrayDeque<>();
        for(char ch : s.toCharArray()){
            if(ch=='#' && !sts.isEmpty()){sts.pop();}
           
            else if (ch=='#' && sts.isEmpty())continue;
            else sts.push(ch);
        }
        System.out.println();
        Deque <Character> stt = new ArrayDeque<>();
        for(char ch : t.toCharArray()){
            if(ch=='#' && !stt.isEmpty()){stt.pop();}
            // System.out.print(+" ");}
            else if (ch=='#' && stt.isEmpty())continue;
            else stt.push(ch);
        }
       
        if(sts.isEmpty() && stt.isEmpty())return true;
        else if (sts.size()!=stt.size())return false;
        else {
            while(!sts.isEmpty() && !stt.isEmpty()){
                char chs = sts.pop();
                char cht = stt.pop();
               
                if(chs!=cht)return false;
            }
        }
        return true;
    }
}