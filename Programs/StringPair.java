import java.util.*;
class StringPair{
  public static void main(String[] args){
    Scanner sc=new Scanner(System.in);
    int count=0;
    int n=sc.nextInt();
    String str="";
    List<String>sl=new ArrayList<>(n);
    for(int i=1;i<=n;i++){
      al.add(i);
    }
    for(int i=1;i<=n;i++){
      str[i]=sl.get(i);
      while(str[i+1]!=0){if(str[i]=='1'){
        str{i]="one";
        break;
      }
        else if(str[i]=='2'){
        str[i]="two";
        break;
        }
        else if(str[i]=='3'){
        str[i]="three";
        break;
        }
        else if(str[i]=='4'){
        str[i]="four";
        break;
        }
        else if(str[i]=='5'){
        str[i]="five";
        break;
        else if(str[i]=='6'){
        str[i]="six";
        break;
        }
        else if(str[i]=='7'){
        str[i]="seven";
        break;
        else if(str[i]=='8'){
        str[i]="eight";
        break;
        }
        else if(str[i]=='9'){
        str[i]=="nine";
        break;
        }
         else if(str[i]=='0'){
         str[i]="zero";
         break;
         }
        else{
        return 1;
        }
        }
       char ch=str.charAt(i);
          if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u'){
          count++;
       }
    }
  }
}