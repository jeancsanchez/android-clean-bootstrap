package com.felipeporge.cleanbootstrap.di;

/**
 * This class represents a component.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 23/11/2016
 */
public interface DaggerComponent {

    /**
     * Injects dependencies on this object.
     * @param obj   Object in which the dependencies will be injected.
     */
    void inject(Object obj);
}
