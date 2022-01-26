package com.example.task1;

public class ReverseWord  {

    public static String reverse(String userString, String userEx){
        String rev = "";
        char ign = userEx.charAt(0);
        char[] result = userString.toCharArray();

        int r = result.length - 1, l = 0;
        while (l < r)
        {
            if (result[l]==ign)
                l++;
            else if(result[r]==ign)
                r--;
            else
            {
                char tmp = result[l];
                result[l] = result[r];
                result[r] = tmp;
                l++;
                r--;
            }
        }

        for(int i=0; i<result.length; i++){
            rev = rev + result[i];

        }
        return rev;
    }
}
