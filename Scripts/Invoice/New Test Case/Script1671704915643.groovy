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

WebUI.navigateToUrl('http://localhost:3000/login')

WebUI.setText(findTestObject('Object Repository/Invoice/input_Ginap_email'), 'WebUI.refresh()')

WebUI.click(findTestObject('Object Repository/Invoice/div_GinapLupa kata sandiMasukAtau masuk den_fd6c4c'))

WebUI.setText(findTestObject('Object Repository/Invoice/input_Ginap_email'), 'NoGameNoLife177')

WebUI.click(findTestObject('Object Repository/Invoice/div_GinapLupa kata sandiMasukAtau masuk den_fd6c4c'))

WebUI.setEncryptedText(findTestObject('Object Repository/Invoice/input_Ginap_password'), 'AIGyRavOUV1SQI3AJOt0qQ==')

WebUI.click(findTestObject('Object Repository/Invoice/div_GinapLupa kata sandiMasukAtau masuk den_fd6c4c'))

WebUI.setText(findTestObject('Object Repository/Invoice/input_Ginap_email'), 'mg1671687299954@gmail.com')

WebUI.click(findTestObject('Object Repository/Invoice/div_GinapLupa kata sandiMasukAtau masuk den_fd6c4c'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Masuk'))

WebUI.click(findTestObject('Object Repository/Invoice/div_Invoice'))

WebUI.click(findTestObject('Object Repository/Invoice/div_Invoice'))

WebUI.click(findTestObject('Object Repository/Invoice/p_Buat Invoice'))

WebUI.click(findTestObject('Object Repository/Invoice/check_email'))

WebUI.click(findTestObject('Object Repository/Invoice/date_now'))

WebUI.setText(findTestObject('Object Repository/Invoice/input__userid'), '4')

WebUI.click(findTestObject('Object Repository/Invoice/chose_userID'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Item'))

WebUI.setText(findTestObject('Object Repository/Invoice/input_Tambah Item_name'), 'nama item')

WebUI.setText(findTestObject('Object Repository/Invoice/input_Tambah Item_amount'), '5')

WebUI.setText(findTestObject('Object Repository/Invoice/input_Tambah Item_unit_price'), '10000')

WebUI.setText(findTestObject('Object Repository/Invoice/input_Tambah Item_total_price'), '40000')

WebUI.click(findTestObject('Object Repository/Invoice/button_Tambahkan'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Tambahkan'))

WebUI.click(findTestObject('Object Repository/Invoice/div_success create new item'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Batal'))

WebUI.click(findTestObject('Object Repository/Invoice/i_Rp40.000,00_bi bi-trash3-fill delete-icon__item'))

WebUI.setText(findTestObject('Object Repository/Invoice/input_Catatan'), 'test catatan')

WebUI.setText(findTestObject('Object Repository/Invoice/input_Send Notification_title'), 'test title')

WebUI.setText(findTestObject('Object Repository/Invoice/input_Send Notification_body'), 'test body')

WebUI.click(findTestObject('Object Repository/Invoice/button_Item'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Tambahkan'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Batal'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Diskon'))

WebUI.setText(findTestObject('Object Repository/Invoice/input_Diskon_diskon'), '90')

WebUI.click(findTestObject('Object Repository/Invoice/price_total_bfrDisc'))

WebUI.click(findTestObject('Object Repository/Invoice/price_total_aftrDisc'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Kirim Invoice'))

WebUI.click(findTestObject('Object Repository/Invoice/div_Riwayat'))

WebUI.click(findTestObject('Object Repository/Invoice/div_Mmanusia'))

WebUI.click(findTestObject('Object Repository/Invoice/check_email'))

WebUI.click(findTestObject('Object Repository/Invoice/h6_2022-12-22'))

WebUI.click(findTestObject('Object Repository/Invoice/h6_manusia ( 34)'))

WebUI.click(findTestObject('Object Repository/Invoice/td_nama item'))

WebUI.click(findTestObject('Object Repository/Invoice/td_10000'))

WebUI.click(findTestObject('Object Repository/Invoice/td_5'))

WebUI.click(findTestObject('Object Repository/Invoice/td_40000'))

WebUI.click(findTestObject('Object Repository/Invoice/div_Rp. 80000'))

WebUI.click(findTestObject('Object Repository/Invoice/div_90'))

WebUI.click(findTestObject('Object Repository/Invoice/div_Rp. 8000'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Review'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Review'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Kirim Email'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Lunas'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Review'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Gagal'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Review'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Lunas'))

WebUI.click(findTestObject('Object Repository/Invoice/div_Riwayat'))

WebUI.click(findTestObject('Object Repository/Invoice/div_Berhasil'))

WebUI.click(findTestObject('Object Repository/Invoice/div_Berhasil'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Review'))

WebUI.click(findTestObject('Object Repository/Invoice/button_Gagal'))

WebUI.click(findTestObject('Object Repository/Invoice/div_Gagal'))

