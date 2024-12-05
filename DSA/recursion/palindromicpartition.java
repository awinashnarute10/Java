package DSA.recursion;
import java.util.ArrayList;
import java.util.List;
public class palindromicpartition {

    public static void main(String[] args) {
            
        String input = "aabb";
        List<List<String>> result = partition(input);

        System.out.println("Palindromic partitions of \"" + input + "\":");
        for (List<String> partition : result) {
            System.out.println(partition);
        }
    }
    
    
        public static List<List<String>> partition(String s) {
            List<List<String>> result = new ArrayList<>(); 
            List<String> path = new ArrayList<>();        
            backtrack(0, s, path, result);                
            return result;
        }
    
        private static void backtrack(int index, String s, List<String> path, List<List<String>> result) {
            if (index == s.length()) {                    
                result.add(new ArrayList<>(path));       
                return;
            }
            for (int i = index; i < s.length(); i++) {  
                if (isPalindrome(s, index, i)) {         
                    path.add(s.substring(index, i + 1)); 
                    backtrack(i + 1, s, path, result);   
                    path.remove(path.size() - 1);        
                }
            }
        }
    
        private static boolean isPalindrome(String s, int start, int end) {
            while (start < end) {                         
                if (s.charAt(start) != s.charAt(end)) return false;
                start++;
                end--;
            }
            return true;
        }
    
        
    }
    
