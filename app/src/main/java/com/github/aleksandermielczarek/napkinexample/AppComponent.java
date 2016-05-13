package com.github.aleksandermielczarek.napkinexample;

import com.github.aleksandermielczarek.napkin.scope.AppScope;

import dagger.Component;

/**
 * Created by Aleksander Mielczarek on 13.05.2016.
 */
@Component(modules = AppModule.class)
@AppScope
public interface AppComponent {

    String getNapkinString();
}