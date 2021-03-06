import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class Login {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("I am on 'Login' site")
	def on_Login_site() {
		WebUI.openBrowser(null)
		WebUI.maximizeWindow()
		WebUI.navigateToUrl("https://vinagiay.vn/")
		WebUI.click(findTestObject("Page_Giay/Icon_XemGioHang"))
		WebUI.click(findTestObject("Page_Giay/a_DangNhap"))
	}

	@When("I input email '(.*)'")
	def input_Email(String email) {
		WebUI.waitForElementVisible(findTestObject("Page_Login/input_Email_username"), 5)
		WebUI.setText(findTestObject("Page_Login/input_Email_username"), email)
		println email
	}

	@And("I input pass '(.*)'")
	def input_Pass(String pass) {
		WebUI.waitForElementVisible(findTestObject("Page_Login/input_MatKhau_pass"), 5)
		WebUI.setText(findTestObject("Page_Login/input_MatKhau_pass"), pass)
		println pass
	}
	@And("I click 'Login'")
	def clickLogin() {
		WebUI.waitForElementVisible(findTestObject("Page_Login/button_DangNhap"), 5)
		WebUI.click(findTestObject("Page_Login/button_DangNhap"))
	}
	@Then("I will navigate to Home page")
	def I_verify_the_status_in_step(String status) {
		WebUI.waitForElementVisible(findTestObject("Page_Login/input_MatKhau_pass"), 5)
		println status
	}
}