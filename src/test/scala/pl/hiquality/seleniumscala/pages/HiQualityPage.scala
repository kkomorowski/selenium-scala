package pl.hiquality.seleniumscala.pages

import org.scalatest.selenium.WebBrowser
import pl.hiquality.seleniumscala.Driver

object HiQualityPage extends WebBrowser with Driver {

  def open(): Unit = go to "http://hiquality.pl"

}
