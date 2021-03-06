import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory as CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as MobileBuiltInKeywords
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testcase.TestCaseFactory as TestCaseFactory
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testdata.TestDataFactory as TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository as ObjectRepository
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WSBuiltInKeywords
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUiBuiltInKeywords
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Common/GoToUrl'), [('url') : GlobalVariable.homeUrl + '?controller=addresses'])

WebUI.click(findTestObject('Page_Addresses - My Store/span_Add a new address'))

WebUI.navigateToUrl('http://automationpractice.com/index.php?controller=address')

WebUI.setText(findTestObject('Page_Address - My Store/input__address1'), adress)

WebUI.setText(findTestObject('Page_Address - My Store/input__city'), city)

WebUI.selectOptionByValue(findTestObject('Page_Address - My Store/select_-AlabamaAlaskaArizonaAr'), '32', true)

WebUI.setText(findTestObject('Page_Address - My Store/input__postcode'), postcode)

WebUI.setText(findTestObject('Page_Address - My Store/input__phone'), phone)

WebUI.setText(findTestObject('Page_Address - My Store/input__phone_mobile'), phone_mobile)

WebUI.setText(findTestObject('Page_Address - My Store/input__alias'), alias)

WebUI.click(findTestObject('Page_Address - My Store/span_Save'))

/*if (WebUI.verifyElementPresent(findTestObject('Object Repository/Page_Address - My Store/div_There is 1 errorThe alias'), 
    0)) 
{
    WebUI.setText(findTestObject('Page_Address - My Store/input__alias'), "nouvelleAdress")

    WebUI.click(findTestObject('Page_Address - My Store/span_Save'))
}*/

