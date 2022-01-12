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

WebUI.click(findTestObject('Object Repository/CreateUser_6/Page_Software engineer bonus clc6/a_Log in'))

WebUI.setText(findTestObject('Object Repository/CreateUser_6/Page_Software engineer bonus clc6 Log in to_4b17c1/input_Username_username'), 
    'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/CreateUser_6/Page_Software engineer bonus clc6 Log in to_4b17c1/input_Password_password'), 
    'YaaZ55zPeD2b3ZDZXEM02A==')

WebUI.click(findTestObject('Object Repository/CreateUser_6/Page_Software engineer bonus clc6 Log in to_4b17c1/button_Log in'))

WebUI.click(findTestObject('Object Repository/CreateUser_6/Page_Dashboard/a_Site administration'))

WebUI.click(findTestObject('Object Repository/CreateUser_6/Page_SE_bonus Administration Search/a_Users'))

WebUI.click(findTestObject('Object Repository/CreateUser_6/Page_SE_bonus Administration Search/a_Add a new user'))

WebUI.setText(findTestObject('Object Repository/CreateUser_6/Page_SE_bonus Administration Users Accounts_7a62be/input_Username_username'), 
    'nttuyen1234')

WebUI.click(findTestObject('Object Repository/CreateUser_6/Page_SE_bonus Administration Users Accounts_7a62be/em_Click to enter text'))

WebUI.setEncryptedText(findTestObject('Object Repository/CreateUser_6/Page_SE_bonus Administration Users Accounts_7a62be/input_New password_newpassword'), 
    'Oe2/0OiRV69nifOuHx7nsg==')

WebUI.setText(findTestObject('Object Repository/CreateUser_6/Page_SE_bonus Administration Users Accounts_7a62be/input_First name_firstname'), 
    'nttuyen1234')

WebUI.setText(findTestObject('Object Repository/CreateUser_6/Page_SE_bonus Administration Users Accounts_7a62be/input_Surname_lastname'), 
    'hcmus')

WebUI.setText(findTestObject('Object Repository/CreateUser_6/Page_SE_bonus Administration Users Accounts_7a62be/input_Email address_email'), 
    'nttuyen1234@gmail.com')

WebUI.click(findTestObject('Object Repository/CreateUser_6/Page_SE_bonus Administration Users Accounts_7a62be/input_Address_submitbutton'))

WebUI.click(findTestObject('Object Repository/CreateUser_6/Page_SE_bonus Administration Users Accounts_7a62be/div_Passwords must have at least 1 lower ca_156739'))

WebUI.closeBrowser()

