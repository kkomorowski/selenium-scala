package pl.hiquality.seleniumscala

import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

trait Driver {
  implicit val webDriver: WebDriver = Driver.driver
}

object Driver {

  private var _driver: Option[WebDriver] = None

  def driver: WebDriver = {
    if (_driver.isEmpty) {
      _driver = Some(new ChromeDriver())
    }
    _driver.get
  }
}
