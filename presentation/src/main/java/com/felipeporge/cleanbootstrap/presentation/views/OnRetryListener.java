package com.felipeporge.cleanbootstrap.presentation.views;

/**
 * This class represents an interface in which is described how to handle retry events.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 04/05/17
 */
public interface OnRetryListener {

    /**
     * On retry action requested.
     * @param requestCode   Request code.
     */
    void onRetry(int requestCode);
}
