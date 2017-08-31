package com.felipeporge.cleanbootstrap.presentation.views.dialogs;

import android.os.Bundle;
import android.support.v4.app.DialogFragment;

import com.felipeporge.cleanbootstrap.presentation.presenters.Presenter;
import com.felipeporge.cleanbootstrap.presentation.views.PresenterView;

import javax.inject.Inject;

/**
 * This class represents a base dialog.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 04/05/17
 */
public abstract class PresenterDialog<PRESENTER extends Presenter> extends DialogFragment implements PresenterView<PRESENTER> {

    private PRESENTER mPresenter;

    @Override
    public void onActivityCreated(Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);

        if(mPresenter != null) {
            mPresenter.setView(this);
            mPresenter.onViewCreated();
        }
    }

    @Override
    public void onResume() {
        super.onResume();

        if(mPresenter != null)
            mPresenter.resume();
    }

    @Override
    public void onPause() {
        super.onPause();

        if(mPresenter != null)
            mPresenter.pause();
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if(mPresenter != null)
            mPresenter.destroy();
    }

    @Override
    public PRESENTER getPresenter() {
        return mPresenter;
    }

    @Inject
    @Override
    public void setPresenter(PRESENTER presenter) {
        this.mPresenter = presenter;
    }

    @Override
    public boolean isValid() {
        return !isDetached() && !isRemoving() && getContext() != null;
    }
}
