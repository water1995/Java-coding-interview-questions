public class j109 {

  public static void main(String[] args){

    String str = "Genevieve";

    countVowels(str);
  }

  private static void countVowels(String str){

    int countVowels = 0;
    int countConsonants = 0;

    for(int i=0; i < str.length() ;i++){

      if(isVowel(str.charAt(i))){
        ++countVowels;
      }
      else{
        ++countConsonants;
      }
    }

    System.out.println("Vowels = "+countVowels);
    System.out.println("Consonants = "+countConsonants);

  }

  private static boolean isVowel(char ch){

    char chv = Character.toUpperCase(ch);
    return (chv == 'A' || chv == 'E' || chv == 'I' || chv == 'O' || chv == 'U');

  }
  
}
