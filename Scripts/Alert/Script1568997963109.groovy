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
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

Mobile.startApplication('D:\\Appium\\AndriodApp\\ApiDemos-debug.apk', true)
//Mobile.startApplication('D:\\Appium\\AndriodApp\\APIDemos.apk', true)

Mobile.tap(findTestObject('APIDemo/App'), 0)

Mobile.tap(findTestObject('APIDemo/Alert Dialogs/Alert Dialogs'), 0)

Mobile.tap(findTestObject('APIDemo/Alert Dialogs/Ok Cancel Dialog with Traditional Theme/OK CANCEL DIALOG WITH TRADITIONAL THEME'), 0)

String AlertText = Mobile.getText(findTestObject('APIDemo/Alert Dialogs/Ok Cancel Dialog with Traditional Theme/AlertText'), 
    0)
println AlertText
Mobile.tap(findTestObject('APIDemo/Alert Dialogs/Ok Cancel Dialog with Traditional Theme/AlertOKButton'), 0)

Mobile.closeApplication()

