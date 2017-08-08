package pl.hiquality.seleniumscala

import net.serenitybdd.jbehave.SerenityStories
import net.thucydides.core.annotations.Managed
import org.openqa.selenium.WebDriver
import org.openqa.selenium.chrome.ChromeDriver

class HiQualityStories extends SerenityStories {
  findStoriesIn("stories/hiquality")
}