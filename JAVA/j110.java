public class j110 {

  public static void main(String[] args){

    String str = "Learn with Genevieve Xalxo";
    splitWords(str);
  }

  private static void splitWords(String str){

    String[] words = str.split(" ");
    for(int i=0 ; i < words.length ; i++){

      String word = words[i];
      System.out.print(word.charAt(0));
    }
  }
  
}
