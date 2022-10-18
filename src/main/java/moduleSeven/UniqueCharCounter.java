package moduleSeven;
class UniqueCharCounterTest {
    public static void main(String[] args) {
        UniqueCharCounter charCounter = new UniqueCharCounter();

        //3
        System.out.println(charCounter.count("123"));

        //4
        System.out.println(charCounter.count("ab100"));

        //3
        System.out.println(charCounter.count("Java"));
    }
}
class UniqueCharCounter{
    public int count(String phrase){
        String str1 = new String(phrase);
        String str2 = new String(str1);
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (int j = 0; j < str2.length(); j++) {
            if (str2.charAt(i) == str1.charAt(i)) {
                sb.append(str1.charAt(i));
                str1 = str1.replace(str2.charAt(i), ' ');
                i++;
            } else {
                i++;
            }
        }
        return sb.length();
    }
}