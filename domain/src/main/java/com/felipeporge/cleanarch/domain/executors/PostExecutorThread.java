package com.felipeporge.cleanarch.domain.executors;

/**
 * This class represents an post executor thread.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 23/11/2016
 */
public interface PostExecutorThread {

    /**
     * Posts a runnable.
     * @param runnable Runnable to post.
     */
    void post(Runnable runnable);
}
