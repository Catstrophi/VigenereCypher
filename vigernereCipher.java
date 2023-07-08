public class vigernereCipher {
    public static void main(String[] args) {

        System.out.println(Cipher("OM", "hello", "decrypt"));
    }
    public static String keys(String txt, String key){
        String keyStream = "";
        for(int i = 0; i<(txt.length()/key.length()+1); i++) {
            keyStream += key;
        }
        keyStream = keyStream.substring(0, txt.length()).toUpperCase();
        return keyStream;
    }
    public static String Cipher(String txt, String key, String type){
        txt = txt.toUpperCase();
        String finalWord = "";
        String keyStream = keys(txt, key);
        for(int i = 0; i<txt.length(); i++){
            int t = ((int) (txt.charAt(i))) - 65;
            int k = ((int) (keyStream.charAt(i))) - 65;
            if(type.equals("encrypt")) {
                finalWord += String.valueOf((char) (((t + k) % 26) + 65));
            }
            else if ((t - k) < 0) {
                finalWord += String.valueOf((char) (((26 + (t - k)) % 26) + 65));
            }
            else {
                finalWord += String.valueOf((char) (((t - k) % 26) + 65));
            }
        }
        return finalWord;
    }
}
