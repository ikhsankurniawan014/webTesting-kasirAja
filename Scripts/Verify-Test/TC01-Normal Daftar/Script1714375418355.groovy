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

WebUI.navigateToUrl('https://kasirdemo.belajarqa.com/')

WebUI.verifyElementText(findTestObject('Fitur Onboarding/Login/headerh2_hai, kasirAja_homepage'), 'hai, kasirAja')

WebUI.click(findTestObject('Object Repository/Fitur Onboarding/Daftar/a_ingin mencoba, daftar'))

WebUI.verifyElementText(findTestObject('Fitur Onboarding/Daftar/label_nama toko'), 'nama toko')

WebUI.setText(findTestObject('Object Repository/Fitur Onboarding/Daftar/input_nama toko_name'), 'Katalon')

WebUI.setText(findTestObject('Object Repository/Fitur Onboarding/Daftar/input_email_email'), 'testkatalon@gmail.com')

WebUI.setEncryptedText(findTestObject('Object Repository/Fitur Onboarding/Daftar/input_password_password'), 'vOoj4tQjAWVV9mKJ1JcWEw==')

WebUI.click(findTestObject('Object Repository/Fitur Onboarding/Daftar/btn hide password'))

WebUI.click(findTestObject('Object Repository/Fitur Onboarding/Daftar/btn unhide password'))

WebUI.click(findTestObject('Object Repository/Fitur Onboarding/Daftar/button_daftar'))

WebUI.verifyElementPresent(findTestObject('Fitur Onboarding/Daftar/Alert daftar berhasil'), 60)

WebUI.verifyElementText(findTestObject('Fitur Onboarding/Login/headerh2_hai, kasirAja_homepage'), 'hai, kasirAja')

WebUI.closeBrowser()

