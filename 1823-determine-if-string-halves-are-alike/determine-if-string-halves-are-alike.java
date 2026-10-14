class Solution {
    public boolean halvesAreAlike(String s) {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<s.length()/2;i++){
            sb.append(s.charAt(i));
        }
        StringBuilder sb1=new StringBuilder();
        for(int i=s.length()/2;i<s.length();i++){
            sb1.append(s.charAt(i));
        }
        int cnt1=0;
        for(int i=0;i<sb.length();i++){
            char ch=sb.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' || ch=='A' ||ch=='E'|| ch=='I' || ch=='O' || ch=='U'){
                cnt1++;
            }
        }
        int cnt2=0;
        for(int i=0;i<sb1.length();i++){
            char ch=sb1.charAt(i);
            if(ch=='a' || ch=='e'|| ch=='i' || ch=='o' || ch=='u' || ch=='A' ||ch=='E'|| ch=='I' || ch=='O' || ch=='U'){
                cnt2++;
            }
        }
        if(cnt1==cnt2){
            return true;
        }
        return false;
    }
}