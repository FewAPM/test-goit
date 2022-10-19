package moduleSeven;

class WordCombineTest {
    public static void main(String[] args) {
        //true
        System.out.println(new WordCombine().canCombine("Forest", "tor"));

        //true
        System.out.println(new WordCombine().canCombine("Magic", "Mama"));

        //false
        System.out.println(new WordCombine().canCombine("War", "Piece"));

//        System.out.println(new WordCombine().uniqueElementsDeleter("Magic", "Mama"));
    }
}
class WordCombine{
    public boolean canCombine(String sourceWord, String targetWord){
        int combineCounter = 0;
        for (int i = 0; i < targetWord.length(); i++) {
            for (int j = 0; j < sourceWord.length(); j++) {
                if (sourceWord.toLowerCase().charAt(j) == targetWord.toLowerCase().charAt(i)) {
                    combineCounter ++;
                }
            }
        }
        return combineCounter >= targetWord.length();
    }
}
//    public String uniqueElementsDeleter(String sourceWord, String targetWord){
//        String uniqueElements = "";
//        int uniqueCounter = 0;
//        for (int i = 0; i < targetWord.length(); i++) {
//            for (int j = 0; j < sourceWord.length(); j++) {
//                if (sourceWord.charAt(j) == targetWord.charAt(i)) {
//                    uniqueElements += targetWord.charAt(i);
//                    targetWord = targetWord.replace(targetWord.charAt(i), ' ');
//                    uniqueCounter ++;
//                }
//            }
//        }
//        System.out.println("uniqueElements = " + uniqueElements);
//        return uniqueElements;
//
//    }