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

WebUI.callTestCase(findTestCase('Test Scenario Login/TC01-Normal Login'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Fitur Onboarding/Fitur - Pelanggan/div_pelanggan'))

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Fitur Onboarding/Fitur - Pelanggan/a_tambah'))

WebUI.takeFullPageScreenshot()

WebUI.setText(findTestObject('Object Repository/Fitur Onboarding/Fitur - Pelanggan/input_keterangan_keterangan'), 'Pelanggan baru')

WebUI.takeFullPageScreenshot()

WebUI.click(findTestObject('Object Repository/Fitur Onboarding/Fitur - Pelanggan/button_simpan'))

WebUI.verifyElementPresent(findTestObject('Fitur Onboarding/Fitur - Pelanggan/div_name is not allowed to be empty - alert field nama tidak diinput'), 
    0)

WebUI.takeFullPageScreenshot()

