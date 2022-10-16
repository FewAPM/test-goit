package moduleSeven;

class GooWordStat{
    public String word;
    public int freq;



    public GooWordStat(String word, int freq) {
        this.word = word;
        this.freq = freq;


    }
    public String getWord(){
        return this.word;
    }

    public int getFreq(){
        return this.freq;
    }

    @Override
    public String toString(){
        String strFreq = "";
        if (getFreq() < 1000) {
            strFreq = "LOW";
        } else if (getFreq() >= 1000 && getFreq() < 100000) {
            strFreq = "MEDIUM";
        } else if (getFreq() >=100000 && getFreq() < 10000000 ) {
            strFreq = "HIGH";
        }  else if (getFreq() >=10000000 ) {
        strFreq = "EXTRA HIGH";
    }
        return "Word is [" + getWord() + "], search freq is " + strFreq;
}
}