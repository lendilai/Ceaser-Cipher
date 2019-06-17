package models;

public class Caesar {
    // Class properties
    private String mSentence;
    private int mKey;

    // Caesar constructor
    public Caesar(String sentence, int key){
        mSentence = sentence;
        mKey = key;
    }

    // Getter method for the sentence
    public String getmSentence() {
        return mSentence;
    }

    // Getter method for the key
    public int getmKey() {
        return mKey;
    }

    // Encrypt method
    public String encrypt(){
        String encryptedWord = "";

        for (int i = 0; i < mSentence.length(); i++){
          char userChar = mSentence.charAt(i);
          char shiftedChar = (char) (userChar + mKey);
          encryptedWord += shiftedChar;
        }
        return encryptedWord;
    }

}
