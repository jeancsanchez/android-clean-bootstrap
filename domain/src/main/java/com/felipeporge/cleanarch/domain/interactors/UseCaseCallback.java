package com.felipeporge.cleanarch.domain.interactors;

/**
 * This class represents an use case callback.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 23/11/2016
 */
public interface UseCaseCallback<RESULT> {

    /**
     * Called when an use case was successfully finished.
     * @param result Use case result.
     */
    void onSuccess(RESULT result);

    /**
     * Called when an exception occurred.
     * @param exception Occurred exception.
     */
    void onFailure(Exception exception);
}
