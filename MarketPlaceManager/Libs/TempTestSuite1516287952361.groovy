import com.kms.katalon.core.logging.KeywordLogger
import com.kms.katalon.core.exception.StepFailedException
import com.kms.katalon.core.reporting.ReportUtil
import com.kms.katalon.core.main.TestCaseMain
import com.kms.katalon.core.testdata.TestDataColumn
import groovy.lang.MissingPropertyException
import com.kms.katalon.core.testcase.TestCaseBinding
import com.kms.katalon.core.driver.internal.DriverCleanerCollector
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.configuration.RunConfiguration
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData



def static runTestCase_0() {
    TestCaseMain.runTestCase('Test Cases/login2', new TestCaseBinding('Test Cases/login2 - Iteration 1',  [ 'password' : 'MPM_admin@2017' , 'username' : 'info@macro.it' ,  ]), FailureHandling.STOP_ON_FAILURE)
    
}

def static runTestCase_1() {
    TestCaseMain.runTestCase('Test Cases/login2', new TestCaseBinding('Test Cases/login2 - Iteration 2',  [ 'password' : 'aaa' , 'username' : 'aaa' ,  ]), FailureHandling.STOP_ON_FAILURE)
    
}


Map<String, String> suiteProperties = new HashMap<String, String>();


suiteProperties.put('id', 'Test Suites/login-excel')

suiteProperties.put('name', 'login-excel')

suiteProperties.put('description', '')
 

DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.webui.contribution.WebUiDriverCleaner())
DriverCleanerCollector.getInstance().addDriverCleaner(new com.kms.katalon.core.mobile.contribution.MobileDriverCleaner())



RunConfiguration.setExecutionSettingFile("C:\\Users\\Win8.1\\Katalon Studio\\MarketPlaceManager\\Reports\\login-excel\\20180118_160552\\execution.properties")

TestCaseMain.beforeStart()

KeywordLogger.getInstance().startSuite('login-excel', suiteProperties)

TestCaseMain.invokeStartSuite('Test Suites/login-excel')

(0..1).each {
    "runTestCase_${it}"()
}

DriverCleanerCollector.getInstance().cleanDrivers()

TestCaseMain.invokeEndSuite('Test Suites/login-excel')

KeywordLogger.getInstance().endSuite('login-excel', null)
