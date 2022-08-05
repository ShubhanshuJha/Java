import java.util.*; 

public class List_Simple{

    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String inp = sc.nextLine();
        List<String> stringList = new ArrayList<String>();
        System.out.println("Raw input: "+inp);
        System.out.println("After Capital Case Conversion:\n"+inp.toUpperCase());
        System.out.println("After Small Case Conversion:\n"+inp.toLowerCase());

        stringList.add("ABCD");
        stringList.add("BCDE");
        stringList.add("CDEF");
        stringList.add("ACDE");
        stringList.add("DFEC");
        stringList.add("BCDA");
        System.out.println(stringList);
        comp(stringList, inp.toUpperCase());
    }
    static void comp(List words, String str){
        // int count = words.size(), flag = 0;
        int count = 0, flag;
        for (int idx = 0; idx < words.size(); idx++){
            flag = 0;
            String s = words.get(idx).toString();
            // System.out.println(s);
            for(int i = 0; i < 4; i++){
                for(int j = 0; j < 4; j++){
                    if(str.charAt(i) == s.charAt(j)){
                        // System.out.println(str.charAt(i)+ "==" +s.charAt(j));
                        flag++;
                        continue;
                    }
                }
                if (flag == str.length()) {
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}