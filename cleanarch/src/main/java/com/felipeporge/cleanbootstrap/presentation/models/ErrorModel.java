package com.felipeporge.cleanbootstrap.presentation.models;

/**
 * This class represents an error on presentation layer.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 04/05/17
 */
public class ErrorModel {

    private boolean mAdvice = true;
    private boolean mRetry = false;
    private Runnable mRunnable = null;
    private String mMessage;

    /**
     * Constructor method.
     * @param message   Error mMessage.
     */
    public ErrorModel(boolean isAdvice, boolean retry, String message) {
        this.mAdvice = isAdvice;
        this.mRetry = retry;
        this.mMessage = message;
    }

    /**
     * Constructor method.
     * @param isAdvice  Is this error only an mAdvice?
     * @param message   Error mMessage.
     * @param runnable  Runnable to execute after show.
     */
    public ErrorModel(boolean isAdvice, String message, Runnable runnable) {
        this.mAdvice = isAdvice;
        this.mRetry = false;
        this.mMessage = message;
        this.mRunnable = runnable;
    }

    /**
     * Executes the mRunnable.
     */
    public void execute(){
        if(mRunnable != null)
            mRunnable.run();
    }

    /* Getters and Setters - BEGIN */

    public boolean isAdvice() {
        return mAdvice;
    }

    public String getMessage() {
        return mMessage;
    }

    public boolean isRetry() {
        return mRetry;
    }

    public Runnable getRunnable() {
        return mRunnable;
    }

    /* Getters and Setters - END */
}
