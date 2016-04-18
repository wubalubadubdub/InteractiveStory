package com.example.bearg.interactivestory.model;

/**
 * Created by bearg on 4/18/2016.
 */
public class Page {
    /* The Page class is the model in our MVC pattern.
    The data associated with a Page is a picture, a section of text,
    and two choices, so we create member variables for all those.
    Each page will also have two buttons that allow the user to choose,
    but the model doesn't care about this. That implementation detail is
    not the responsibility of the model component in MVC.
     */
    private int mImageId;
    private String mText;
    private Choice mChoice1;
    private Choice mChoice2;
    private boolean mIsFinal = false;

    public Page(int id, String text, Choice c1, Choice c2) {
        mImageId = id;
        mText = text;
        mChoice1 = c1;
        mChoice2 = c2;
    }

    public Page(int id, String text) {
        mImageId = id;
        mText = text;
        mChoice1 = null;
        mChoice2 = null;
        mIsFinal = true;
    }

    public boolean isFinal() {
        return mIsFinal;
    }

    public void setFinal(boolean aFinal) {
        mIsFinal = aFinal;
    }

    public int getImageId() {
        return mImageId;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

    public Choice getChoice1() {
        return mChoice1;
    }

    public void setChoice1(Choice choice1) {
        mChoice1 = choice1;
    }

    public Choice getChoice2() {
        return mChoice2;
    }

    public void setChoice2(Choice choice2) {
        mChoice2 = choice2;
    }

    public void setImageId(int id) {
        mImageId = id;
    }

}
