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

user = WS.sendRequest(findTestObject('API/get all users'))

for (i = 0; i < WS.getElementsCount(user, 'data', FailureHandling.STOP_ON_FAILURE); i++) {
    if(WS.getElementPropertyValue(user, "data[$i].name").startsWith('mg')) {
        email = WS.getElementPropertyValue(user, "data[$i].email")
		WS.comment(email)
		token = WS.sendRequest(findTestObject('Object Repository/API/login user', [('email'):email]),)
		userKey = WS.getElementPropertyValue(token, "data.token")
		WS.comment(userKey)
		result = WS.sendRequest(findTestObject('Object Repository/API/delete user', [('userKey'):userKey]),)
		WS.comment(WS.getElementPropertyValue(result, "message"))
    }
}

