class Solution {
    public String removeStars(String s) {
        int n =s.length()-1;
        Stack<Character> st = new Stack<>();
        for(int i=0;i<=n;i++)
        {
            if(s.charAt(i)=='*')
            {
                st.pop();
            }
            else
            {
                st.push(s.charAt(i));
            }
        }
        String x="";
        while(!st.isEmpty())
        {
            x+=st.peek();
            st.pop();
        }
        String y="";
        for(int i=x.length()-1;i>=0;i--)
        {
            y+=x.charAt(i);
        }
        //System.out.println(x);
        return y;
    }
}
