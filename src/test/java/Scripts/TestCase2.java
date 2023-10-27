package Scripts;

import org.testng.annotations.Test;

import POM.DemoSkillraryPage;
import POM.DownloadInvoicePage;
import POM.SkillraryHomePage;
import generic_Library.BaseClass;

public class TestCase2 extends BaseClass{
      @Test
      public void tc2() {
       SkillraryHomePage s=new SkillraryHomePage(driver);
   	   s.gearsButton();  //business library of gears from SkillraryHomePage
   	   s.skillraryDemoApp();  //business library of skillraryDemoApp from SkillraryHomePage
   	   utilities.childBrowser(driver);
   	   DemoSkillraryPage ds=new DemoSkillraryPage(driver);
   	   ds.feedbckbtn();       //business library of feedbckbtn from DemoSkillraryPage
   	   DownloadInvoicePage dI=new DownloadInvoicePage(driver);
   	   dI.downloadInvoiceButton();  //business library of download Invoice button from downloadInvoicePage
      }
}
