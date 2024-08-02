package Day9;
public class string{
    public static String changeName(String str){
        String s="";
        for(int i=0;i<str.length();i++)
           s+= (char)(str.charAt(i)+1);
        return s;
    }
    public static String reverseName(String str){
        String s="";
        for(int i=str.length()-1;i>=0;i--){
            s+=str.charAt(i);
        }
        return s;
    }

    public static int palindrome(String str){
        String s = reverseName(str);
        /*for(int i=0;i<str.length();i++)
            if(str.charAt(i)==s.charAt(i))
                return true;
        return false;*/
        return (s.compareTo(str));
    }

    public static String revSentence(String s){
        String ans="";
        s=s.trim();
        String[] s_arr=s.split(" ");
        for(int i=s_arr.length-1;i>=0;i--){
            ans+=s_arr[i]+" ";
        }
        return ans.trim();
    }
    public static String sub_String(String str,int i,int j){
        String s="";
        for(int k=i;k<=j;k++){
            s+=str.charAt(k);

        }
        return s;
    }
    public static int longestStr(String str){
        int ans=0;
        int len=1;
        char curr=str.charAt(0);
        for(int i=1;i<str.length();i++){
            if(str.charAt(i)==curr){
                len++;
                ans=Math.max(len,ans);}
            else{
                curr=str.charAt(i);
                ans=Math.max(len,ans);
                len=1;}
            
        }
        return ans;
    }
    public static void sub_str(String s){
        for(int i=0;i<s.length();i++){
            for(int j=i+1;j<=s.length();j++){
                System.out.println(s.substring(i,j));
            }
        }
    }

    public static void main(String[] args) {
        String s1 = "Hi";
        String s2 = new String("hi");
        String s3 = "hi";
        s1+='e';
        s3+='e';
        char[] s4={'h','i'};
        System.out.println(s1.compareTo(s3));
        //String s4=s2;
        //String s5=s4;
         //System.out.println(s4==s2);
        //System.out.println(s2==s5);
        //System.out.println(s1.charAt(0));
        System.out.println(s1==s3);
        System.out.println(changeName("meow"));
        System.out.println(reverseName("Manshi"));
        System.out.println(s4[1]== s1.charAt(1));
        System.out.println(palindrome("madam")); 
        System.out.println(revSentence("Hello world"));
        System.out.println(sub_String("Delusional", 0, 3));
        System.out.println("Ewwwwwww".substring(1,5));
        System.out.println(longestStr("ewwwwww"));
        sub_str("abcde");
    }
}