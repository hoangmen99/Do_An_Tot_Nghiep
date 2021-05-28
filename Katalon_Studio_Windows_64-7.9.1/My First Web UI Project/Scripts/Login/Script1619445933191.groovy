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

WebUI.navigateToUrl('https://vinagiay.vn/#social-login-popup')

WebUI.maximizeWindow()

WebUI.click(findTestObject('Page_Giay/Icon_XemGioHang'))

WebUI.click(findTestObject('Page_Giay/a_DangNhap'))

WebUI.waitForElementVisible(findTestObject("Page_Login/input_Email_username"), 5)

WebUI.setText(findTestObject('Page_Login/input_Email_username'), username)

WebUI.setText(findTestObject('Page_Login/input_MatKhau_pass'), password)

WebUI.click(findTestObject('Page_Login/button_DangNhap'))

if(WebUI.waitForElementNotPresent(findTestObject('Page_Login/button_DangNhap', 3))) {	
	WebUI.verifyElementPresent(findTestObject('Page_Giay/Icon_XemGioHang'), 3)
}
else {
	WebUI.verifyTextPresent(thongBao, false)	
}
