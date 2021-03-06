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

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://vinagiay.vn/#social-login-popup')

WebUI.click(findTestObject('Page_Giay/Icon_XemGioHang'))

WebUI.waitForPageLoad(10)

WebUI.click(findTestObject('Page_Giay/a_Tao tai khoan'))

WebUI.waitForElementPresent(findTestObject('Page_DangKy/input_H_lastname'), 5)

WebUI.setText(findTestObject('Page_DangKy/input_H_lastname'), 'hoang')

WebUI.setText(findTestObject('Page_DangKy/input_Tn_firstname'), 'Men')

WebUI.setText(findTestObject('Page_DangKy/input_Email_email'), 'hoangmen200799@gmail.com')

WebUI.setText(findTestObject('Page_DangKy/input_telephone'), '0372671527')

WebUI.setText(findTestObject('Page_DangKy/input_Mt khu_password_ dk'), 'hoangmen99')

WebUI.setText(findTestObject('Page_DangKy/input_password_confirmation'), 'hoangmen99')

WebUI.click(findTestObject('Page_DangKy/button_dangky'))

WebUI.waitForPageLoad(10)

WebUI.verifyElementText(findTestObject('Page_Giay/a_Tao tai khoan'), 'Email ???? t???n t???i.')

WebUI.closeBrowser()

