package com.felipeporge.cleanbootstrap.domain.executors;

/**
 * This class represents a task executor.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 23/11/2016
 */
public interface TaskExecutor {

    /**
     * Runs a runnable.
     * @param runnable Runnable to execute.
     */
    void execute(Runnable runnable);
}
