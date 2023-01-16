import java.util.ArrayList;

public class Main {
    static ArrayList<String> Words = new ArrayList<>();
    static final int maxSize = 5;
    static char alpha = 'A',alpha2='A';
    static int alphabet = 0;

    public static void makeWords(int length, String word) {
        if (length == maxSize) {
            return;
        }
        if(length==1){
            for(int i=0;i<26;i++){
                Words.add(word+alpha);
                System.out.println(word+alpha);
                alpha++;
            }
            makeWords(2,"");
        }
        if(length==2) {
            for (int i = 0; i < 26; i++) {
                alpha = 'A';
                for (int j = 0; j < 26; j++) {
                    Words.add(Words.get(i) + alpha);
                    System.out.println(Words.get(i) + alpha);
                    alpha++;
                }
            }
            makeWords(3,"");
        }
        if(length==3){
            for (int i = 0; i < 26; i++) {
                alpha = 'A';
                for (int j = 0; j < 26; j++) {
                    alpha2='A';
                    Words.add(Words.get(i) + alpha);
                    System.out.println(Words.get(i) + alpha);
                    alpha++;
                }
                for(int k=0;k<26;k++){
                    Words.add(Words.get(26+k) + alpha2);
                    System.out.println(Words.get(26+k) + alpha2);
                    alpha2++;
                }
            }
        }
    }
    public static void main(String [] args){
        String pw1="1c75d402fb481523acd44e9d8247bc80";
        String pw2="5b1d59b5451c06afb65ab1bc2713cfb4";
        PasswordHash password = new PasswordHash();
        makeWords(1,"");
        for(String words : Words){
            if(pw1.equals(password.hashPW(words))){
                System.out.println("Found Password 1:"+words);
            }
        }
        for(String words : Words){
            if(pw2.equals(password.hashPW(words))){
                System.out.println("Found Password 2:"+words);
            }
        }
    }
}
