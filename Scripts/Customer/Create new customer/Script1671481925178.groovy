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

WebUI.callTestCase(findTestCase('Auth/validLogin'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.refresh()

WebUI.click(findTestObject('Customer/a_Pelanggan'))

WebUI.verifyElementPresent(findTestObject('Customer/p_Pelanggan'), 0)

WebUI.click(findTestObject('Customer/button_Customer'))

WebUI.verifyElementPresent(findTestObject('Customer/modal'), 0)

Random rnd = new Random()

int ID = 4

WebUI.setText(findTestObject('Customer/input_User ID_input'), "$ID")

int i = 1

WebUI.click(findTestObject('Customer/UserID', [('id') : i]))

WebUI.click(findTestObject('Customer/button_Tambahkan'))

while (WebUI.verifyElementPresent(findTestObject('Object Repository/ERROR'), 5, FailureHandling.OPTIONAL) == true) {

    WebUI.comment("ID("+ID+")"+"\tRow("+i+")")
	
    WebUI.setText(findTestObject('Customer/input_User ID_input'), "$ID")

    i++

    if (WebUI.verifyElementClickable(findTestObject('Customer/UserID', [('id') : i]), FailureHandling.OPTIONAL)) {
        WebUI.click(findTestObject('Customer/UserID', [('id') : i]))
    } else {
        i = 1
		ID--
		if(ID<0) {
			break;
		}
		WebUI.setText(findTestObject('Customer/input_User ID_input'), "$ID")
		
		WebUI.click(findTestObject('Customer/UserID', [('id') : i]))
    }
    
    WebUI.click(findTestObject('Customer/button_Tambahkan'))
}

WebUI.verifyElementPresent(findTestObject('SUCCESS'), 0)

//WebUI.verifyElementNotPresent(findTestObject('Customer/modal'), 0)

