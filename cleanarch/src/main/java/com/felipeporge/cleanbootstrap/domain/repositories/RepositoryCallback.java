package com.felipeporge.cleanbootstrap.domain.repositories;

/**
 * This class represents the repository callback.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 23/11/2016
 */
public interface RepositoryCallback<RESULT> {

    /**
     * This method is called when the repository finishes correctly a task.
     * @param result    Task result.
     */
    void onRepoSuccess(RESULT result);

    /**
     * This method is called when the repository gets an error during a task execution.
     * @param exception     Exception.
     */
    void onRepoFailure(Exception exception);
}
