package com.qmetry.qaf.example.steps;

import com.google.inject.Inject;
import com.qmetry.qaf.automation.step.QAFTestStep;
import com.qmetry.qaf.automation.ui.webdriver.QAFWebDriver;
import com.qmetry.qaf.automation.util.PropertyUtil;

public class StepsLibrary {

    @Inject
    private QAFWebDriver driver;

    @Inject
    private PropertyUtil propertyUtil;

    @QAFTestStep(description = "user opens application")
    public void openURL() {
        String baseUrl = propertyUtil.getString("env.baseurl");
        driver.get(baseUrl);
    }
}
