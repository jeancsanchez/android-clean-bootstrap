package com.felipeporge.cleanbootstrap.presentation.views;

import android.support.v4.app.DialogFragment;
import android.view.View;

import com.felipeporge.cleanbootstrap.presentation.models.ErrorModel;

/**
 * This class describes an Model-View-Presenter architecture pattern View object.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 04/05/17
 */
public interface MvpView {

    /**
     * Gets base activity {@link View}.
     * @return {@link View} instance.
     */
    View getBaseView();



    /**
     * Shows the loading view.
     * @param message Message to show.
     */
    void showLoading(String message);

    /**
     * Shows the loading view.
     * @param messageStringResId Message to show.
     */
    void showLoading(int messageStringResId);

    /**
     * Shows the loading view.
     */
    void showLoading();

    /**
     * Hides the loading view.
     */
    void hideLoading();



    /**
     * Shows a dialog.
     * @param dialog - {@link DialogFragment} instance.
     */
    void showDialog(DialogFragment dialog);


    /**
     * Shows a toast message.
     * @param message Toast message.
     */
    void showToast(String message);

    /**
     * Shows a toast message.
     * @param stringResId String resource id.
     */
    void showToast(int stringResId);




    /**
     * Shows an error.
     * @param error Error to show.
     */
    void showError(ErrorModel error);

    /**
     * Shows an error.
     * @param error         Error to show.
     * @param retryListener On retry listener.
     */
    void showError(ErrorModel error, OnRetryListener retryListener);

    /**
     * Shows an error.
     * @param error         Error to show.
     * @param retryListener On retry listener.
     * @param requestCode   Request code to retry.
     */
    void showError(ErrorModel error, OnRetryListener retryListener, int requestCode);



    /**
     * Hides the keyboard.
     */
    void hideSoftKeyboard();

}
