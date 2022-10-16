package moduleSeven;

class GooSearchResult{
    private final String url;
    public GooSearchResult(String url){
        this.url = url;
    }
    public String getUrl(){
        return url;
    }
    public StringBuilder parseDomain(){
            char [] chars =  getUrl()
                .replaceAll("http://", "")
                .replaceAll("https://", "").toCharArray();
            StringBuilder sb = new StringBuilder();
        for (int i = 0; i < chars.length; i++) {
                if ( chars[i] == '/') {
                    return sb;
                } sb.append(chars[i]);
        }
        return sb;
    }
}
