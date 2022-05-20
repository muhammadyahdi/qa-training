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

//GROOVY
// membuka halaman web
WebUI.openBrowser("")

//menuju link web
WebUI.navigateToUrl("https://katalon-demo-cura.herokuapp.com/")

// menuju link web
WebUI.click(findTestObject('Object Repository/page_cura/Page_CURA Healthcare Service/a_Make Appointment'))
	
//mengisi text username
WebUI.setText(findTestObject('Object Repository/page_cura/Page_CURA Healthcare Service/input_Username_username'),'John Doe')
	
//mengis pasword
//encrypnya lewat menu --> help ->encryption text
WebUI.setEncryptedText(findTestObject('Object Repository/page_cura/Page_CURA Healthcare Service/input_Password_password'),"g3/DOGG74jC3Flrr3yH+3D/yKbOqqUNM")	

//cklik tobol login
WebUI.click(findTestObject('Object Repository/page_cura/Page_CURA Healthcare Service/button_Login'))

//verify hasil login
WebUI.verifyTextPresent("Make Appointment", false)

//clos the browser
WebUI.closeBrowser()
	
	
	
	
	
	
	
	
	
	