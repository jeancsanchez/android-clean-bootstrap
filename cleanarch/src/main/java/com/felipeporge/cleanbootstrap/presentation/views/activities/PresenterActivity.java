package com.felipeporge.cleanbootstrap.presentation.views.activities;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;

import com.felipeporge.cleanbootstrap.presentation.presenters.Presenter;
import com.felipeporge.cleanbootstrap.presentation.views.PresenterView;

import javax.inject.Inject;


/**
 * This class represents a base {@link AppCompatActivity}.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 22/11/16
 */
public abstract class PresenterActivity<PRESENTER extends Presenter> extends AppCompatActivity implements PresenterView<PRESENTER> {

    private PRESENTER mPresenter;

    @Override
    protected void onStart() {
        super.onStart();

        if(mPresenter != null) {
            mPresenter.setView(this);
            mPresenter.onViewCreated();
        }
    }

    @Override
    protected void onResume() {
        super.onResume();

        if(mPresenter != null)
            mPresenter.resume();
    }

    @Override
    protected void onPause() {
        super.onPause();

        if(mPresenter != null)
            mPresenter.pause();
    }

    @Override
    protected void onDestroy() {
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
        return !isFinishing() && !isDestroyed();
    }

    @Override
    public Context getViewContext() {
        return this;
    }

}