package week06_10_15_2022;

public class FindTheSentence {
    public static void main(String[] args) {
        String sentence = "Y*78*8*o770987987u a869869=r????23425235e t54898)!'^h^^&%e b+%^^e%&+s%&t g+%&%+u/%y&/s.&6756/D4o n556576ot5675 c657467a7657r7657e a6575b6575o5675u567t i5467t&";
        String temp="";

        for (int i = 0; i <sentence.length() ; i++) {
            char ch=sentence.charAt(i);
            if (ch=='.')
                break;
            if ((ch<='z'&&ch>='a')||(ch<='Z'&&ch>='A')||ch==' ')
                temp+=ch;
        }
        System.out.println(temp);

















    }
}
