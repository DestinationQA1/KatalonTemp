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

Mobile.tap(findTestObject('APIDemo/View/Views'), 0)

Mobile.tap(findTestObject('APIDemo/View/Expandable Lists'), 0)

Mobile.tap(findTestObject('APIDemo/View/ExpandableLists/1. Custom Adapter'), 0)

Mobile.tapAndHold(findTestObject('APIDemo/View/ExpandableLists/CustomeAdapter/People Names'), 0, 0)

String SampleActionMenu = Mobile.getText(findTestObject('APIDemo/View/ExpandableLists/CustomeAdapter/Sample action'), 0)
println SampleActionMenu

Mobile.closeApplication()

