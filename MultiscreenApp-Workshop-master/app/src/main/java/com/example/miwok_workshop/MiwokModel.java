package com.example.miwok_workshop;

// creating a class

public class MiwokModel {
    String miwokWord , miwokTranslation;
    int imageResId = 0;

//Creating a method for MiwokModel for number

    public MiwokModel(String mMiwokTranslation, String mMiwokWord, int mImageResId){
        this.miwokWord = mMiwokWord;
        this.miwokTranslation = mMiwokTranslation;
        this.imageResId = mImageResId;
    }

//Creating a method for only colors

    public MiwokModel(String miwokWord, String miwokTranslation) {
        this.miwokWord = miwokWord;
        this.miwokTranslation = miwokTranslation;
    }

//Creating a getter and setter for all the three variables

    public String getMiwokWord() {
        return miwokWord;
    }

    public void setMiwokWord(String miwokWord) {
        this.miwokWord = miwokWord;
    }

    public String getMiwokTranslation() {
        return miwokTranslation;
    }

    public void setMiwokTranslation(String miwokTranslation) {
        this.miwokTranslation = miwokTranslation;
    }

    public int getImageResId() {
        return imageResId;
    }

    public void setImageResId(int imageResId)
    {
        this.imageResId = imageResId;
    }

    public boolean hasImage(){
        return imageResId != 0;

    }
}
