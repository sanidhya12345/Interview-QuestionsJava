public class SortVowelsMedium {
    public static boolean checkVowel(char ch){
        return ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u' || ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U';
    }
    public String sortVowels(String s) {
        char [] ans=new char[s.length()];
        for(int i=0;i<ans.length;i++){
            ans[i]=' ';
        }
        ArrayList<Character> vowel=new ArrayList<>();
        for(int i=0;i<ans.length;i++){
            if(checkVowel(s.charAt(i))){
                vowel.add(s.charAt(i));
            }
            else{
                ans[i]=s.charAt(i);
            }
        }
        Collections.sort(vowel);
        int index=0;
        for(int i=0;i<ans.length;i++){
            if(ans[i]==' '){
                ans[i]=vowel.get(index);
                index++;
            }
        }
        String res=new String(ans);
        return res;
    }
}
