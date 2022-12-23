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

WebUI.navigateToUrl(GlobalVariable.link)

WebUI.setViewPortSize(1366, 720)

String unique = System.currentTimeMillis().toString()

WebUI.click(findTestObject('Object Repository/Auth/Register/Daftar'))

WebUI.setText(findTestObject('Auth/Register/input_Ginap_Email'), ('mg' + unique) + '@gmail.com')

WebUI.setEncryptedText(findTestObject('Auth/Register/input_Ginap_Password'), 'GwweH0yE+9LB0jmG5uIxhxlv365DRkcq')

WebUI.click(findTestObject('Auth/Register/show_Hide_Password'))

WebUI.click(findTestObject('Auth/Register/button_Berikutnya'))

WebUI.verifyElementPresent(findTestObject('Auth/Register/p_This field is required'), 0)