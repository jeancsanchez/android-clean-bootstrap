package com.felipeporge.cleanbootstrap.presentation.exceptions;

import android.content.Context;

import com.felipeporge.cleanbootstrap.presentation.models.ErrorModel;

/**
 * This class represents an error model factory.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 04/05/17
 */
public interface ErrorFactory {

    /**
     * Create an error model based on an exception.
     * @param context           The context.
     * @param defaultMsgResId   Default message string resource id.
     * @param exception         Exception to treat.
     * @return                  Error model instance.
     */
    ErrorModel create(Context context, int defaultMsgResId, Exception exception);
}
