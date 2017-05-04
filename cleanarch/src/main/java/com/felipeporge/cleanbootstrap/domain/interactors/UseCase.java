package com.felipeporge.cleanbootstrap.domain.interactors;


import com.felipeporge.cleanbootstrap.domain.executors.PostExecutorThread;
import com.felipeporge.cleanbootstrap.domain.executors.TaskExecutor;

/**
 * This class represents a basic user case.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 22/11/16
 */
public abstract class UseCase<REPO, PARAM, RESULT> implements Runnable {

    private TaskExecutor mExecutor;
    private PostExecutorThread mPostExecutor;
    private REPO mRepository;
    private UseCaseCallback<RESULT> mCallback;
    private PARAM mParams;

    /**
     * Constructor method.
     * @param executor Executor thread.
     * @param postExecutor Post mExecutor thread.
     * @param repository Repository.
     */
    public UseCase(TaskExecutor executor, PostExecutorThread postExecutor, REPO repository) {
        this.mExecutor = executor;
        this.mPostExecutor = postExecutor;
        this.mRepository = repository;
    }

    /**
     * Gets the use case mRepository.
     * @return Use case mRepository.
     */
    public REPO getmRepository(){
        return this.mRepository;
    }

    /**
     * Gets the use case mParams.
     * @return Use case mParams.
     */
    public PARAM getmParams(){
        return this.mParams;
    }

    /**
     * Executes this use case.
     * @param param Use case param.
     * @param callback Use case mCallback.
     */
    public void execute(PARAM param, UseCaseCallback<RESULT> callback){
        mCallback = callback;
        mParams = param;
        mExecutor.execute(this);
    }

    /**
     * Notifies post mExecutor thread of the success.
     * @param result Use case result.
     */
    public void notifySuccess(final RESULT result){
        if(mCallback != null) {
            mPostExecutor.post(new Runnable() {
                @Override
                public void run() {
                    mCallback.onSuccess(result);
                }
            });
        }
    }

    /**
     * Notifies post mExecutor thread of a failure.
     * @param exception Occurred exception.
     */
    public void notifyFailure(final Exception exception){
        if(mCallback != null) {
            mPostExecutor.post(new Runnable() {
                @Override
                public void run() {
                    mCallback.onFailure(exception);
                }
            });
        }
    }
}
