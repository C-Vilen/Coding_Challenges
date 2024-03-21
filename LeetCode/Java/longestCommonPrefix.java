import java.util.Arrays;

public class longestCommonPrefix {
        public String longestCommonPrefixMethod(String[] strs) {
        Arrays.sort(strs);
        String lastStr = strs[strs.length-1];
        int index = 0;
        while(index < strs[0].length() && index < lastStr.length()) {
          if (strs[0].charAt(index) == lastStr.charAt(index)) {
            index++;
          } else {
            break;
          }
        }
        return strs[0].substring(0, index);
    }
}
