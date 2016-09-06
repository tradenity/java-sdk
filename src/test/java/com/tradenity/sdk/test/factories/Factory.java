package com.tradenity.sdk.test.factories;

/**
 * Created by joseph
 * on 1/11/16.
 */
public interface Factory {
    <M> M build(Class<M>cls, String label);
}
