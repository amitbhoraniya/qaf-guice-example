package com.qmetry.qaf.example.utils;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;
import com.qmetry.qaf.automation.core.ConfigurationManager;
import com.qmetry.qaf.automation.ui.WebDriverTestBase;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriver;
import com.qmetry.qaf.automation.util.PropertyUtil;

public class QAFModule extends AbstractModule {

    @Provides
    QAFWebDriver provideDriver() {
        return new WebDriverTestBase().getDriver();
    }

    @Provides
    PropertyUtil providePropertyUtil() {
        return ConfigurationManager.getBundle();
    }

    @Override
    protected void configure() {
    }
}
