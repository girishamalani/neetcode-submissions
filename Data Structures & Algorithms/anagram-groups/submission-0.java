class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> res=new HashMap<>();
        for(String s: strs){
            char[] arr=s.toCharArray();  //string to array
            Arrays.sort(arr);      //sorting
            String sortS=new String(arr);   //array to string
            res.putIfAbsent(sortS,new ArrayList<>());
            res.get(sortS).add(s);
        }
        return new ArrayList<>(res.values());
    }
}
