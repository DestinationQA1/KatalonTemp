import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import org.stringtemplate.v4.compiler.STParser.element_return

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

Mobile.startApplication('D:\\Appium\\AndriodApp\\APIDemos.apk', true)

//Mobile.tap(findTestObject('APIDemo/App'), 0)
Mobile.tap(findTestObject('APIDemo/View/Views'), 0)

'Scroll to WebView text'
Mobile.scrollToText('WebView', FailureHandling.STOP_ON_FAILURE)

Mobile.tap(findTestObject('APIDemo/View/WebView'), 0)
Mobile.delay(2)
eleHeight = Mobile.getElementHeight(findTestObject('APIDemo/View/Web View/HelloWorld'), 30)

eleWidth = Mobile.getElementWidth(findTestObject('APIDemo/View/Web View/HelloWorld'), 30)
println eleHeight
println eleWidth
Mobile.pinchToZoomInAtPosition(378, 52, 40)

'Get Element Height of  Zoom In "Hello World" Element'
zoom_ele_Height = Mobile.getElementHeight(findTestObject('APIDemo/View/Web View/HelloWorld'), 30)

'Get Element Width of Zoom In "Hello World" Element'
zoom_ele_Width = Mobile.getElementWidth(findTestObject('APIDemo/View/Web View/HelloWorld'), 30)

'Verify the Element Height of Zoom In greater than normal Element height'
Mobile.verifyGreaterThan(zoom_ele_Height, eleHeight)

'Verify the Element Width of Zoom In greater than normal Element Width'
Mobile.verifyGreaterThan(zoom_ele_Width, eleWidth)
