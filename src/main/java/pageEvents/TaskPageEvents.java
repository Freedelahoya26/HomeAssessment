/**
 * 
 */
package pageEvents;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import base.BaseTest;
import pageObjects.TaskPageElements;

/**
 * 
 */
public class TaskPageEvents extends BaseTest {

	public void selectTopic() {

		WebElement ele = driver.findElement(By.xpath(TaskPageElements.selection));

		ele.click();
	}

	public void assignmentTask() {


		WebElement titleSection = driver.findElement(By.xpath(TaskPageElements.title));

		WebElement contentElement = titleSection.findElement(By.xpath(TaskPageElements.content));

		String content = contentElement.getText();
 
		Map<String, Integer> wordOccurrences = countWordOccurrences(content);


        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
	}

	private static Map<String, Integer> countWordOccurrences(String content) {

		String[] words = content.toLowerCase().replaceAll("[.,;:\\[\\]]", "").split("\\s+");
		Map<String, Integer> wordOccurrences = new HashMap<>();
		for (String word : words) {
			if (!word.isEmpty()) {
				wordOccurrences.put(word, wordOccurrences.getOrDefault(word, 0) + 1);
			}
		}
		return wordOccurrences;
	}

}
