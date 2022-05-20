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
WebUI.navigateToUrl("https://github.com/")


// menuju link web
WebUI.click(findTestObject('Object Repository/Page_github/Page_GitHub Where the world builds software  GitHub/a_Sign in'))

//mengisi text username
WebUI.setText(findTestObject('Object Repository/Page_github/Page_Sign in to GitHub  GitHub/input_Username or email address_login'),"muhammadyahdi4@gmail.com")

//mengis pasword
//encrypnya lewat menu --> help ->encryption text
WebUI.setEncryptedText(findTestObject('Object Repository/Page_github/Page_Sign in to GitHub  GitHub/input_Password_password'),"6GZ4hi53bvjKnnfLaTs/wA==")

// menuju login
WebUI.click(findTestObject('Object Repository/Page_github/Page_Sign in to GitHub  GitHub/input_Password_commit'))

//verify hasil login
WebUI.click(findTestObject('Object Repository/Page_github/Page_GitHub/summary_New project_Header-link'))

//verify hasil login
WebUI.click(findTestObject('Object Repository/Page_github/Page_GitHub/button_Sign out'))

//clos the browser
WebUI.closeBrowser()