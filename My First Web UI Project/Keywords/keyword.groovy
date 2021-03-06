import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords

import internal.GlobalVariable
import java.text.DecimalFormat
import org.openqa.selenium.WebElement
import org.openqa.selenium.By.ByXPath
import org.openqa.selenium.chrome.ChromeDriver
import org.openqa.selenium.interactions.Actions
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By
import org.openqa.selenium.JavascriptExecutor
import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.sun.org.apache.bcel.internal.generic.RETURN
import com.kms.katalon.core.webui.exception.WebElementNotFoundException


class keyword {
	/**
	 * Login
	 */
	@Keyword
	def Login(String user, String pass) {
		WebUI.openBrowser('')
		WebUI.navigateToUrl('https://vinagiay.vn/#social-login-popup')
		WebUI.maximizeWindow()
		WebUI.click(findTestObject('Page_Giay/Icon_XemGioHang'))
		WebUI.click(findTestObject('Page_Giay/a_DangNhap'))
		WebUI.waitForElementVisible(findTestObject("Page_Login/input_Email_username"), 5)
		WebUI.setText(findTestObject('Page_Login/input_Email_username'), user)
		WebUI.setText(findTestObject('Page_Login/input_MatKhau_pass'), pass)
		WebUI.click(findTestObject('Page_Login/button_DangNhap'))
		if(WebUI.waitForElementPresent(findTestObject('Page_Giay/Icon_XemGioHang'), 5)) {

			WebUI.verifyElementPresent(findTestObject('Page_Giay/Icon_XemGioHang'), 3)
		}
		else {
			KeywordUtil.markPassed("Login Failed")
		}
	}
	//nhan vao 1 text
	@Keyword
	def ClickByText(String text) {
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement element = driver.findElement(ByXPath.xpath("//*[text()='"+ text +"']"))
		element.click()
	}
	@Keyword
	def MouseOverByText(String text) {
		WebDriver driver = DriverFactory.getWebDriver()
		WebElement element = driver.findElement(ByXPath.xpath("//*[text()='"+ text +"']"))
		Actions action = new Actions(driver);
		action.moveToElement(element).perform();
	}

	@Keyword //chuy???n ti???n v??? d???ng s???
	def String ChuyenTienVeDangSo(String tien) {
		String Gia = tien.replaceAll(",", "").replaceAll("??", "")//c???t d???u , v?? '??'
		return Gia
	}

	@Keyword //t??nh ti???n
	def String TinhGiaTien(String sl, String GiaGoc) {
		int soLuong = sl.toInteger()
		int Gia = ChuyenTienVeDangSo(GiaGoc).toInteger()//x??? l?? gi?? ban ?????u ch???a , '??'
		int tongTien =  (Gia*soLuong)
		return tongTien.toString()
	}

}