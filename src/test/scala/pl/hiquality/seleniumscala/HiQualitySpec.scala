package pl.hiquality.seleniumscala

import org.junit.runner.RunWith
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver
import org.scalatest.junit.JUnitRunner
import org.scalatest.selenium.WebBrowser
import org.scalatest.{Matchers, WordSpec}

@RunWith(classOf[JUnitRunner])
class HiQualitySpec extends WordSpec with Matchers with WebBrowser {
  implicit val webDriver: WebDriver = new ChromeDriver()

  "The Blog home page" should {
    "have correct title" in {
      go to "http://hiquality.pl"
      pageTitle should be("Hi, Quality!")
      webDriver.close()
    }
  }
}