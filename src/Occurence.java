public class Occurence {
    static int Countoccurence(String str, String word)
    {
        int count=0;
        String temp[]=str.split(" ");
        for (int i=0;i< temp.length;i++)
        {
            if(word.equals(temp[i]))
            {
                count++;
            }

        }
        return count;
    }
    public static void main(String[] args)
    {
        String str="I want one apple for my brother , one for my sister, and one for me. ";
        String word="my";
        System.out.println("No of occurence="+Countoccurence(str,word));
    }
}
