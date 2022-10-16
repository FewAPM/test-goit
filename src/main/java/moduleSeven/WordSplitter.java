package moduleSeven;

import java.util.ArrayList;
import java.util.Arrays;

class WordSplitter{
    public String[] split(String phrase){
        ArrayList<String> list = new ArrayList<>();
        String additionalStr = phrase.trim().strip().toLowerCase();

        while (additionalStr.contains(" ")) {// цикл буде працювати доки будуть пробіли
            int index = additionalStr.indexOf(' '); // знаходимо індекс першо пробіла
            String temp = additionalStr.substring(0,index); // рядку temp присвоюється частина до першого робілу - слово
            list.add(temp);// додаємо temp (слово) до ArrayList
            additionalStr = additionalStr.replaceFirst(temp, ""); // видаляємо вже знайдене і збережене слово
            additionalStr = additionalStr.trim().strip();// видаляємо пробіли та інші знаки пунктуації

        }
        list.add(additionalStr);// додаємо останнє остання слово

        String [] splited = list.toArray(new String[0]);// створюю і присвоюю String [] значення мого ArrayList
        return splited;
    }
    public static void main(String[] args) {

        String phrase = "Kupocysam       Teqoh Saboyxvysa  ";
        System.out.println(Arrays.toString(new WordSplitter().split(phrase)));

    }
}
