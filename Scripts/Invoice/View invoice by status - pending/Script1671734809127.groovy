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

WebUI.click(findTestObject('a_Riwayat'))

WebUI.click(findTestObject('Object Repository/Invoice/Page_React App/div_Riwayat'))

WebUI.click(findTestObject('Invoice/Page_React App/status_pending'))

//check ia card with that status is available or not
if (WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice/Page_React App/invoice card'), 0, FailureHandling.OPTIONAL) == 
true) {
    WebUI.verifyElementPresent(findTestObject('Invoice/status', [('txt') : 'tunggu', ('Txt') : 'Menunggu Konfirmasi']), 
        0)
} else {
    WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice/span_Belum Ada Invoice Yang Dibuat'), 0)
}

