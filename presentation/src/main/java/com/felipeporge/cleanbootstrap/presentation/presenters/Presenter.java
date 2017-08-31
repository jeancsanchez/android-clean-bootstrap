package com.felipeporge.cleanbootstrap.presentation.presenters;


import com.felipeporge.cleanbootstrap.presentation.views.PresenterView;


/**
 * This class represents a base presenter.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 23/11/2016
 */
public abstract class Presenter<VIEW extends PresenterView> {

    private VIEW mView;

    /**
     * Notifies that the presenter view was created.
     */
    public abstract void onViewCreated();

    /**
     * Resumes this presenter.
     */
    public abstract void resume();

    /**
     * Pauses this presenter.
     */
    public abstract void pause();

    /**
     * Destroys this presenter.
     */
    public abstract void destroy();

    /**
     * Gets presenter view.
     * @return {@link PresenterView} instance.
     */
    public VIEW getView(){
        return mView;
    }

    /**
     * Sets presenter view.
     * @return {@link PresenterView} instance.
     */
    public void setView(VIEW view){
        mView = view;
    }

    /**
     * Returns if the view is valid.
     * @return True (if the view is valid) or false (otherwise).
     */
    public boolean isViewValid(){
        return getView() != null && getView().isValid();
    }
}