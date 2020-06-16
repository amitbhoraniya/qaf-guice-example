package com.qmetry.qaf.example.utils;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.qmetry.qaf.automation.step.DefaultObjectFactory;

public class GuiceObjectFactory extends DefaultObjectFactory {

    private static final Injector injector = Guice.createInjector(new QAFModule());

    public <T> T getObject(Class<T> cls) throws Exception {
        T obj = injector.getInstance(cls);
        return obj;
    }
}
