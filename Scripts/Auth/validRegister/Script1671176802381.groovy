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

WebUI.callTestCase(findTestCase('Auth/Register - adminUser/validRegister -adminUser'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.setText(findTestObject('Register_Business/input_Ginap_Bussines_Name'), 'AVANGER')

WebUI.setText(findTestObject('Register_Business/input_Ginap_Address'), 'Indonesia pride')

String unique = System.currentTimeMillis().toString()

WebUI.setText(findTestObject('Register_Business/input_Ginap_No_Telp'), unique)

WebUI.selectOptionByValue(findTestObject('Register_Business/select_Jenis Bisnis'), 'Elektronik', true)

WebUI.selectOptionByValue(findTestObject('Object Repository/Register_Business/Page_React App/select_Bank002 - Bank BRI009 - Bank BNI'), 
    '1', true)

WebUI.setText(findTestObject('Register_Business/input_Ginap_Rekening'), unique)

WebUI.click(findTestObject('Register_Business/button_Mulai'))

WebUI.verifyElementVisible(findTestObject('Login/Logged in'))

WebUI.refresh()

