package com.felipeporge.cleanbootstrap.presentation.views.dialogs;

/**
 * This class represents the dialog result listener
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 04/05/17
 */
public interface OnDialogResultListener<RESULT> {

    /**
     * Handles when the dialog is finishing.
     * @param result Result.
     */
    void onResult(RESULT result);
}
