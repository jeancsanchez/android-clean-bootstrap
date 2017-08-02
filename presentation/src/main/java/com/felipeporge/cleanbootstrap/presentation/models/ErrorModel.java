package com.felipeporge.cleanbootstrap.presentation.models;

/**
 * This class represents an error on presentation layer.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 04/05/17
 */
public class ErrorModel {

    private String message = "";
    private boolean allowRetry = false;
    private boolean isWarning = false;
    private Runnable requiredAction = null;

    /**
     * Constructor method.
     * @param message   Error message.
     * @param allowRetry    Allows retry.
     * @param isWarning Is warning.
     */
    public ErrorModel(
            String message,
            boolean allowRetry,
            boolean isWarning
    ){
        this.message = message;
        this.allowRetry = allowRetry;
        this.isWarning = isWarning;
    }


    /**
     * Constructor method.
     * @param message   Error message.
     * @param allowRetry    Allows retry.
     * @param isWarning Is warning.
     * @param requiredAction    Required action to run.
     */
    public ErrorModel(
            String message,
            boolean allowRetry,
            boolean isWarning,
            Runnable requiredAction
    ){
        this.message = message;
        this.allowRetry = allowRetry;
        this.isWarning = isWarning;
        this.requiredAction = requiredAction;
    }

    /**
     * Executes the runnable.
     */
    public void execute(){
        if(requiredAction != null)
            requiredAction.run();
    }

    /* Getters and Setters - BEGIN */

    public String getMessage() {
        return message;
    }

    public boolean isAllowRetry() {
        return allowRetry;
    }

    public boolean isWarning() {
        return isWarning;
    }

    public Runnable getRequiredAction() {
        return requiredAction;
    }

    /* Getters and Setters - END */
}
