package codility;

/**
 * @author michael.malevannyy@gmail.com, 31.03.2017
 */

public class Solution2
{
    int solution(String s)
    {
        int ret = 0;

        s = s+"0";

        int len=0;
        boolean haveUpper = false;

        for(int i=0;i<s.length();i++) {
            char ch = s.charAt(i);

            if(Character.isLowerCase(ch))
            {
                len++;
            }
            else if(Character.isUpperCase(ch))
            {
                len++;
                haveUpper = true;
            }
            else
            { // digits

                if(haveUpper && len  > ret)
                    ret = len;

                len = 0;
                haveUpper = false;
            }
        }

        return ret > 0 ? ret : -1;
    }
}
