import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.driver.DriverFactory
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import io.appium.java_client.remote.AppiumCommandExecutor

Mobile.startApplication('D:\\Appium\\AndriodApp\\ApiDemos-debug.apk', true)

Mobile.tap(findTestObject('APIDemo/View/Views'), 0)

Mobile.tap(findTestObject('APIDemo/View/Date Widgets'), 0)

Mobile.tap(findTestObject('APIDemo/View/DateWidgets/Inline'), 0)

String TimeDisplay = Mobile.getText(findTestObject('APIDemo/View/DateWidgets/InlineMenu/TimeClock/TimeDisplay'), 0)
println TimeDisplay


//AppiumCommandExecutor ACE= DriverFactory.getAppiumExecutorForRemoteDriver("http://localhost:64485/wd/hub")
//ACE.execute(null)
Mobile.tap(findTestObject('APIDemo/View/DateWidgets/InlineMenu/TimeClock/Number1'), 0)

Mobile.delay(5)
Mobile.closeApplication()

