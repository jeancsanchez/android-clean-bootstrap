package com.felipeporge.cleanbootstrap.presentation.views;

import android.content.Context;

import com.felipeporge.cleanbootstrap.presentation.presenters.Presenter;

/**
 * This class represents a base view.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 23/11/2016
 */
public interface PresenterView<P> {

    /**
     * Gets the view presenter.
     * @return {@link Presenter} instance.
     */
    P getPresenter();

    /**
     * Sets the view presenter.
     * @return {@link Presenter} instance.
     */
    void setPresenter(P presenter);

    /**
     * Returns if this view is valid.
     * @return True (if this view is valid) or false (otherwise).
     */
    boolean isValid();


    /**
     * Gets the view context.
     * @return View context.
     */
    Context getViewContext();
}