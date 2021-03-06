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
import org.openqa.selenium.By as By
import org.openqa.selenium.By.ByXPath as ByXPath
import org.openqa.selenium.WebDriver as WebDriver
import org.openqa.selenium.WebElement as WebElement
import org.openqa.selenium.WebElement as Keys
import com.kms.katalon.core.webui.driver.DriverFactory as DriverFactory

CustomKeywords.'keyword.Login'('hoangmen200799@gmail.com', 'hoangmen99')

WebUI.navigateToUrl('https://vinagiay.vn/checkout/cart/')

WebUI.waitForPageLoad(30)

WebUI.waitForElementPresent(findTestObject('Page_TrangChu/icon_User'), 5)

WebDriver driver = DriverFactory.getWebDriver()

List<WebElement> listSp = driver.findElements(ByXPath.xpath('//a[@class=\'action action-delete\']'))

println(listSp.size())

// xóa lần lượt các sản phẩn trong giỏ hàng từ dưới lên trên 
for (int i = listSp.size(); i >= 1; i--) {
    WebUI.click(WebUI.convertWebElementToTestObject(listSp.get(i - 1)))

    WebUI.waitForElementNotPresent(WebUI.convertWebElementToTestObject(listSp.get(i - 1)), 5)
}

CustomKeywords.'keyword.MouseOverByText'(Loai1)

CustomKeywords.'keyword.ClickByText'(TenSP1)

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Page_TrangChu/first_product'))

WebUI.waitForPageLoad(30)

masp = WebUI.getText(findTestObject('Page_TrangChu/maSP'))

tensp = WebUI.getText(findTestObject('Page_TrangChu/tenSP'))

giasp = WebUI.getText(findTestObject('Page_TrangChu/giaSP'))

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Page_TrangChu/Button_MuaNgay'))

//while (WebUI.waitForElementPresent(findTestObject('Page_TrangChu/load'), 3)) {
//    WebUI.click(findTestObject('Page_TrangChu/Button_MuaNgay')) //WebUI.click(findTestObject('Page_TrangChu/Button_MuaNgay'))
//}
WebUI.waitForPageLoad(30)

WebUI.verifyTextPresent(masp, false)

//WebUI.verifyElementText(findTestObject('Page_GioHang/maSP1'), masp)
WebUI.verifyElementText(findTestObject('Page_GioHang/tenSP1'), tensp)

WebUI.verifyElementText(findTestObject('Page_GioHang/giaSP1'), giasp)

soLuong1 = WebUI.getAttribute(findTestObject('Page_GioHang/inputSL1'), 'value' //lấy ra số lượng mặc định
    )

WebUI.verifyMatch(soLuong1, '1', false)

CustomKeywords.'keyword.MouseOverByText'(Loai2)

CustomKeywords.'keyword.ClickByText'(TenSP2)

WebUI.waitForPageLoad(30)

WebUI.click(findTestObject('Page_TrangChu/first_product'))

WebUI.waitForPageLoad(30)

masp2 = WebUI.getText(findTestObject('Page_TrangChu/maSP'))

tensp2 = WebUI.getText(findTestObject('Page_TrangChu/tenSP'))

giasp2 = WebUI.getText(findTestObject('Page_TrangChu/giaSP'))

WebUI.waitForJQueryLoad(10)

WebUI.click(findTestObject('Page_TrangChu/Button_MuaNgay'))

//while (WebUI.waitForElementPresent(findTestObject('Page_TrangChu/load'), 3)) {
//    WebUI.click(findTestObject('Page_TrangChu/Button_MuaNgay')) //WebUI.click(findTestObject('Page_TrangChu/Button_MuaNgay'))
//}
WebUI.waitForPageLoad(30)

WebUI.verifyTextPresent(masp2, false)

//WebUI.verifyElementText(findTestObject('Page_GioHang/maSP1'), masp)
WebUI.verifyElementText(findTestObject('Page_GioHang/tenSP2'), tensp2)

WebUI.verifyElementText(findTestObject('Page_GioHang/giaSP2'), giasp2)

soLuong2 = WebUI.getAttribute(findTestObject('Page_GioHang/inputSL2'), 'value' //lấy ra số lượng mặc định
    )

WebUI.verifyMatch(soLuong2, '1', false)

