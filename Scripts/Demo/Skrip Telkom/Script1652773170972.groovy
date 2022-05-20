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

// membuka halaman web
WebUI.openBrowser("")

//menuju link web
WebUI.navigateToUrl("https://www.telkomsel.com/")

// clos pop up
WebUI.click(findTestObject('Object Repository/page_telkomsel/Page_Beranda  Telkomsel/iframe_PT Telekomunikasi Selular, 2022_sp-fancybox-iframe sp-fancybox-skin sp-fancybox-iframe-410 adaptive-resolution'))

//pilih produck
WebUI.click(findTestObject('Object Repository/page_telkomsel/Page_Beranda  Telkomsel/a_Pilihan Produk'))

WebUI.click(findTestObject('Object Repository/page_telkomsel/Page_Beranda  Telkomsel/li_by.U'))

WebUI.closeBrowser()