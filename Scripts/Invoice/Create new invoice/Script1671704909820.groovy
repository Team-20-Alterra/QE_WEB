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

WebUI.click(findTestObject('a_Invoice'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice/p_Buat Invoice'), 0)

WebUI.verifyElementText(findTestObject('Object Repository/Invoice/check_email'), GlobalVariable.email)

// Get date untuk memvalidasi apakah date yang ditampilkan sudah sesuai dengan date hari ini
def now = new Date().format('MM/dd/yyyy')

WebUI.verifyElementText(findTestObject('Object Repository/Invoice/date_now'), now)

Random rnd = new Random()

//Generate random number untuk memilih userID
def ID = rnd.nextInt(4)

WebUI.setText(findTestObject('Object Repository/Invoice/input__userid'), "$ID")

WebUI.click(findTestObject('Object Repository/Invoice/chose_userID'))

def addItem = rnd.nextInt(4)

// plus 1 agar tidak mendapatkan value 0
addItem++

// variable total untuk menampung harga total item yang di tambahkan dan akan digunakan untuk memvalidasi harga totalnya nanti
def total = 0

while (addItem > 0) {
    WebUI.click(findTestObject('Object Repository/Invoice/button_Item'))

    WebUI.verifyElementPresent(findTestObject('Customer/modal'), 0)

    WebUI.setText(findTestObject('Object Repository/Invoice/input_Tambah Item_name'), 'nama item')

	//Menggunakan random character lalu ditambah 1 agar9 mendapatkan nilai lebih dari 0
    def amount = rnd.nextInt(4)
    amount++

    
    WebUI.setText(findTestObject('Object Repository/Invoice/input_Tambah Item_amount'), "$amount")
	
	//Menggunakan random character lalu ditambah 1 agar9 mendapatkan nilai lebih dari 0
    def price = rnd.nextInt(9999999)
    price++

    WebUI.setText(findTestObject('Object Repository/Invoice/input_Tambah Item_unit_price'), "$price")
	
	//Menggunakan random character lalu ditambah 1 agar9 mendapatkan nilai lebih dari 0
    def sub_total = amount * price
    
    WebUI.setText(findTestObject('Object Repository/Invoice/input_Tambah Item_total_price'), "$sub_total")

    WebUI.click(findTestObject('Object Repository/Invoice/button_Tambahkan'))

    WebUI.verifyElementPresent(findTestObject('Object Repository/Invoice/div_success create new item'), 0)

    WebUI.verifyElementNotVisible(findTestObject('Customer/modal'), FailureHandling.STOP_ON_FAILURE)
	
	//menampung harga total
    total = (total + sub_total)

    addItem--
}

WebUI.setText(findTestObject('Object Repository/Invoice/input_Catatan'), 'test catatan')

WebUI.setText(findTestObject('Object Repository/Invoice/input_Send Notification_title'), 'test title')

WebUI.setText(findTestObject('Object Repository/Invoice/input_Send Notification_body'), 'test body')

WebUI.click(findTestObject('Object Repository/Invoice/button_Diskon'))

def disc = 90

//variable priceDisc merupakan variable yang akan digunakan untuk memvalidasi total
def priceDisc = total - (total * (disc / 100))

disc = disc.toString()

//priceDisc = priceDisc.toString()

WebUI.comment(priceDisc.toString())

WebUI.setText(findTestObject('Object Repository/Invoice/input_Diskon_diskon'), "$disc")

WebUI.verifyElementAttributeValue(findTestObject('Object Repository/Invoice/price_total_bfrDisc'), 'value', "$total", 10)


price_aftr_disc = WebUI.getAttribute(findTestObject('Invoice/price_total_aftrDisc'), 'value')

price_aftr_disc = Float.parseFloat(price_aftr_disc)

WebUI.verifyEqual(price_aftr_disc.round(2), priceDisc)

WebUI.click(findTestObject('Object Repository/Invoice/button_Kirim Invoice'))

WebUI.click(findTestObject('a_Riwayat'))

