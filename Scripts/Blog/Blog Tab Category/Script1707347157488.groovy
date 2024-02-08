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

WebUI.navigateToUrl('https://higo.id/')

WebUI.click(findTestObject('Object Repository/Page_HIGO  WiFi Advertising Platform dengan_f9297b/div_Blog'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Lihat Update Lokasi Baru dan Pengemban_3249f5/p_HIGOes Update'), 
    0)

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Lihat Update Lokasi Baru dan Pengemban_3249f5/p_HIGOes Update'), 
    0)

url = WebUI.getUrl()

WebUI.click(findTestObject('Object Repository/Page_Lihat Update Lokasi Baru dan Pengemban_3249f5/a_Hangout'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Cek Lokasi Nongkrong Hits di Sekitarmu/p_Hangout'), 0)

url = WebUI.getUrl()

WebUI.doubleClick(findTestObject('Object Repository/Page_Cek Lokasi Nongkrong Hits di Sekitarmu/a_Lifestyle'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Artikel seputar lifestyle generasi milenial/p_Lifestyle'), 
    0)

url = WebUI.getUrl()

WebUI.click(findTestObject('Object Repository/Page_Artikel seputar lifestyle generasi milenial/a_Tech  Social Media'))

WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Artikel Seputar Teknologi untuk Milenial/p_Tech  Social Media'), 
    0)

url = WebUI.getUrl()

WebUI.click(findTestObject('Object Repository/Page_Artikel Seputar Teknologi untuk Milenial/a_Business Tips'))

