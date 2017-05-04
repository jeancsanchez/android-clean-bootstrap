package com.felipeporge.cleanbootstrap.di;

/**
 * This interface represents an object that has a component.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 23/11/16
 */
public interface HasComponent<COMPONENT> {

    /**
     * Gets component.
     * @return Component.
     */
    COMPONENT getComponent();
}
