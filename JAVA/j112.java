public class j112{

  public static void main(String[] args){

    String s = "The quick brown fox jumps over the lazy dog";
    System.out.println(isPanagram(s.trim().toLowerCase()));
  }

  private static boolean isPanagram(String str){

    if(str.length() < 26){
          return false;
    }

    for(char c='a'; c <= 'z' ; c++){

      if(str.indexOf(c) < 0){
        return false;
      }
    }
    return true;

  }
}








/*public class j112 {

  public static void main(String[] args){

    String s ="The quick brown fox jumps over the lazy dog";
    String a = "Hello World";
    System.out.println(isPanagram(a.toLowerCase()));
  }

  private static boolean isPanagram(String str){

    if(str.length() < 26){
      return false;
    }
    else{

      for(char ch='a' ;ch <= 'z' ; ch++){

        if(str.indexOf(ch) < 0 ){
          return false;
        }
      }
    }

    return true;
  }
  
}*/
