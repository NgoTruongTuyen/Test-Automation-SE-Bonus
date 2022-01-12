import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('http://localhost:81/')

WebUI.click(findTestObject('Object Repository/Login_2/Page_Software engineer bonus clc6/a_Log in'))

WebUI.setText(findTestObject('Object Repository/Login_2/Page_Software engineer bonus clc6 Log in to_4b17c1/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Login_2/Page_Software engineer bonus clc6 Log in to_4b17c1/input_Password_password'), 
    'HeCM15nHKBI=')

WebUI.click(findTestObject('Object Repository/Login_2/Page_Software engineer bonus clc6 Log in to_4b17c1/button_Log in'))

WebUI.click(findTestObject('Object Repository/Login_2/Page_Software engineer bonus clc6 Log in to_4b17c1/div_Invalid login, please try again'))

WebUI.closeBrowser()

