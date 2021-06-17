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

WebUI.click(findTestObject('Object Repository/Page_TimKiem/Page_TrangChu/icon_User'))

WebUI.click(findTestObject('Object Repository/Page_TimKiem/Page_TrangChu/span_ThongTinCaNhan'))

WebUI.openBrowser('')

WebUI.navigateToUrl('https://vinagiay.vn/')

WebUI.click(findTestObject('Object Repository/Page_TimKiem/Page_Giy nam giy n cng s cao cp/i_Lin h_ico ico-search'))

WebUI.click(findTestObject('Object Repository/Page_TimKiem/Page_Giy nam giy n cng s cao cp/i_Lin h_ico ico-search_1'))

WebUI.click(findTestObject('Object Repository/Page_TimKiem/Page_Giy nam giy n cng s cao cp/i_Lin h_ico ico-search'))

WebUI.click(findTestObject('Object Repository/Page_TimKiem/Page_Giy nam giy n cng s cao cp/i_Lin h_ico ico-search_1'))

WebUI.click(findTestObject('Object Repository/Page_TimKiem/Page_Giy nam giy n cng s cao cp/i_Lin h_ico ico-search'))

WebUI.rightClick(findTestObject('Object Repository/Page_TimKiem/Page_Giy nam giy n cng s cao cp/input_Bn mun tm g _q'))

WebUI.click(findTestObject('Object Repository/Page_TimKiem/Page_Giy nam giy n cng s cao cp/input_Bn mun tm g _q'))

WebUI.click(findTestObject('Object Repository/Page_TimKiem/Page_Giy nam giy n cng s cao cp/input_Bn mun tm g _q'))

WebUI.setText(findTestObject('Object Repository/Page_TimKiem/Page_Giy nam giy n cng s cao cp/input_Bn mun tm g _q'), 's')

WebUI.click(findTestObject('Object Repository/Page_TimKiem/Page_Giy nam giy n cng s cao cp/i_Lin h_ico ico-search_1'))

WebUI.click(findTestObject('Page_Giy nam giy n cng s cao cp/a_1900636562'))

WebUI.click(findTestObject('Object Repository/Page_TimKiem/Page_Giy nam giy n cng s cao cp/i_Lin h_ico ico-search'))

WebUI.setText(findTestObject('Object Repository/Page_TimKiem/Page_Giy nam giy n cng s cao cp/input_Bn mun tm g _q'), '')

WebUI.click(findTestObject('Object Repository/Page_TimKiem/Page_Giy nam giy n cng s cao cp/input_Bn mun tm g _q'))

WebUI.click(findTestObject('Object Repository/Page_TimKiem/Page_Giy nam giy n cng s cao cp/input_Bn mun tm g _q'))

WebUI.click(findTestObject('Object Repository/Page_TimKiem/Page_Giy nam giy n cng s cao cp/input_Bn mun tm g _q'))

WebUI.setText(findTestObject('Object Repository/Page_TimKiem/Page_Giy nam giy n cng s cao cp/input_Bn mun tm g _q'), '')

