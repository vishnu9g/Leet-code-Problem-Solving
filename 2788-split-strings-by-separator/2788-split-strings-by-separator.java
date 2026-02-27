import java.util.regex.Pattern;
class Solution {
    public List<String> splitWordsBySeparator(List<String> words, char separator) {
        List<String> a = new ArrayList<>();
        for(int i=0;i<words.size();i++){
            String k = words.get(i);
            String[] arr = k.split(Pattern.quote(String.valueOf(separator)));
            for(int j=0;j<arr.length;j++){
                 if(!arr[j].isEmpty()){
                    a.add(arr[j]);
                }
            }
        }
        return a;
    }
}