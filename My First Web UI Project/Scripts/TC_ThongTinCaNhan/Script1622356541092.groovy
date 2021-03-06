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

	CustomKeywords.'keyword.Login'('hoangmen200799@gmail.com', 'hoangmen99')
	
	WebUI.click(findTestObject('Page_TrangChu/icon_User'))
	
	WebUI.click(findTestObject('Page_TrangChu/span_ThongTinCaNhan'))
	
	'Đợi đối tượng input họ xuất hiện mới làm bước tiếp theo\r\n\r\n'
	WebUI.waitForElementPresent(findTestObject('Page_TaiKhoan/input_Ho'), 3)
	
	WebUI.setText(findTestObject('Page_TaiKhoan/input_Ho'), Ho)
	
	WebUI.setText(findTestObject('Page_TaiKhoan/input_Ten'), Ten)
	
	WebUI.setText(findTestObject('Page_TaiKhoan/input_SoDT'), Sodt)
		
	WebUI.selectOptionByLabel(findTestObject('Page_TaiKhoan/select_GioiTinh'), GioiTinh, true)
	
	WebUI.selectOptionByValue(findTestObject('Page_TaiKhoan/select_NgaySinh'), NgaySinh, true)
	
	WebUI.selectOptionByValue(findTestObject('Page_TaiKhoan/select_ThangSinh'), ThangSinh, true)
	
	WebUI.selectOptionByValue(findTestObject('Page_TaiKhoan/select_NamSinh'), NamSinh, true)
	
	WebUI.setText(findTestObject('Page_TaiKhoan/input_Masothue'), MaSoThue)
	
	WebUI.setText(findTestObject('Page_TaiKhoan/input_TenDonVi'), TenDonVi)
	
	WebUI.setText(findTestObject('Page_TaiKhoan/input_DiaChi'), DiaChi)
	
	WebUI.click(findTestObject('Page_TaiKhoan/span_CapNhat'))
	
	if (WebUI.waitForElementPresent(findTestObject('Page_TaiKhoan/popup_error'), 1)) {
	    'Kiểm tra text có hiển thị trên màn hình không\r\n'
	    WebUI.verifyTextPresent(KetQua, false)
	} else {
	    'Kiểm tra text có hiển thị trên màn hình không\r\n'
	    WebUI.verifyTextPresent(KetQua, false)
	
	    WebUI.refresh()
	
	    'Kiểm tra value của attribute của 1 element'
	    WebUI.verifyElementAttributeValue(findTestObject('Page_TaiKhoan/input_Ho'), 'value', Ho, 1)
	
	    WebUI.verifyElementAttributeValue(findTestObject('Page_TaiKhoan/input_Ten'), 'value', Ten, 0)
	
	    WebUI.verifyElementAttributeValue(findTestObject('Page_TaiKhoan/input_DiaChi'), 'value', DiaChi, 0)
	
	    WebUI.verifyElementAttributeValue(findTestObject('Page_TaiKhoan/input_SoDT'), 'value', Sodt.trim(), 0)
	
	    WebUI.verifyElementAttributeValue(findTestObject('Page_TaiKhoan/input_MaSoThue'), 'value', MaSoThue, 0)
	
	    WebUI.verifyElementAttributeValue(findTestObject('Page_TaiKhoan/input_TenDonVi'), 'value', TenDonVi, 0)
	
	    WebUI.verifyOptionSelectedByLabel(findTestObject('Page_TaiKhoan/select_GioiTinh'), GioiTinh, false, 0)
	
	    WebUI.verifyElementAttributeValue(findTestObject('Page_TaiKhoan/select_NgaySinh'), 'value', NgaySinh, 0)
	
	    WebUI.verifyElementAttributeValue(findTestObject('Page_TaiKhoan/select_ThangSinh'), 'value', ThangSinh, 0)
	
	    WebUI.verifyElementAttributeValue(findTestObject('Page_TaiKhoan/select_NamSinh'), 'value', NamSinh, 0)
	}