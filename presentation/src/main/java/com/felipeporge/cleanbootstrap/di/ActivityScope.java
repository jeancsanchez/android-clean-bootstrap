package com.felipeporge.cleanbootstrap.di;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

import javax.inject.Scope;

/**
 * This class represents an annotation that specifies an Activity scope.
 * @author Felipe Porge Xavier - <a href="http://www.felipeporge.com/">www.felipeporge.com</a>
 * @since 23/11/16
 */
@Scope
@Retention(RetentionPolicy.RUNTIME)
public @interface ActivityScope {}
