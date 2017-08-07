package pl.hiquality.seleniumscala

import org.openqa.selenium.WebDriver
import org.openqa.selenium.firefox.FirefoxDriver
import org.scalatest.selenium.WebBrowser
import org.scalatest.{WordSpec, Matchers}

object HiQualitySpec extends WordSpec with Matchers with WebBrowser {
  implicit val webDriver: WebDriver = new FirefoxDriver()

  "The Blog home page" should {
    "have correct title" in {
      go to "http://hiquality.pl"
      pageTitle should be ("Hi, Quality!")
    }
  }
}