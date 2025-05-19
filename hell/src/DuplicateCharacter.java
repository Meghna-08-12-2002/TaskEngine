import java.util.HashMap;
import java.util.Map;

public class DuplicateCharacter
{
    public static void main(String[] args) {
        String input="programming";
        Map<Character,Integer>countMap=new HashMap<>();
        for(char c:input.toCharArray()){
            countMap.put(c,countMap.getOrDefault(c,0)+1);
            System.out.println("Duplicate Characters:");
        for(Map.Entry<Character, Integer>entry:countMap.entrySet()){

             if(entry.getValue()>1){
                System.out.println(entry.getKey()+"->"+entry.getValue());
            }
        }
        }
    }
}
