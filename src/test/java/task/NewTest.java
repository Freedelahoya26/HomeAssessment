package task;

import org.testng.annotations.Test;

import base.BaseTest;
import pageEvents.LoadedPageEvents;
import pageEvents.TaskPageEvents;

public class NewTest extends BaseTest{
	
	LoadedPageEvents loadedPage = new LoadedPageEvents();
	TaskPageEvents taskPage = new TaskPageEvents();
	
  @Test
  public void targetTest() {
	  
	  loadedPage.taskPageLoaded();
	  taskPage.selectTopic();
	  loadedPage.contentLoaded();
	  taskPage.assignmentTask();
	  
  }
}
