package pl.hiquality.seleniumscala

import org.jbehave.core.annotations.{AfterStories, Then, When}
import pl.hiquality.seleniumscala.pages.HiQualityPage

class HiQualitySteps extends Driver {

  @AfterStories
  def tearDown(): Unit = {
    Driver.driver.close()
  }

  @When("I open the page")
  def iOpenThePage(): Unit =
    HiQualityPage.open()

  @Then("the page title is \"$title\"")
  def thePageTitleIs(title: String): Unit =
    assert(HiQualityPage.pageTitle == title, s"The page title is ${HiQualityPage.pageTitle}, expected: $title")

}
