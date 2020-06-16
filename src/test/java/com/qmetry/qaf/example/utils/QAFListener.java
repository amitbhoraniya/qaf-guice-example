package com.qmetry.qaf.example.utils;

import com.qmetry.qaf.automation.step.ObjectFactory;
import org.testng.ISuite;
import org.testng.ISuiteListener;

public class QAFListener implements ISuiteListener {

    @Override
    public void onStart(ISuite suite) {
        ObjectFactory.INSTANCE.setFactory(new GuiceObjectFactory());
    }

    @Override
    public void onFinish(ISuite suite) {
    }
}
