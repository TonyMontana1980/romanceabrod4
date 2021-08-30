import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class BlogTests extends BaseUI {
    String nameOfArticle;
    String titleOfArticle;

    @Test
    public void testArticlesAndTitles() {
        mainPage.clickTabBlog();
        List<WebElement> linksOfArticles = blogPage.collectAllLinksOfArticles();

        for (int i = 0; i < linksOfArticles.size(); i++) {
            WebElement link = linksOfArticles.get(i);
            nameOfArticle = link.getText();
            if (nameOfArticle.contains("How it works")) {
                Assert.assertEquals(nameOfArticle, "How it works" );
            }
            else if (nameOfArticle.contains("Kharkov dating agency")) {
                Assert.assertEquals(nameOfArticle, "Kharkov dating agency" );
            }
            else if (nameOfArticle.contains("Kiev dating agency")) {
                Assert.assertEquals(nameOfArticle, "Kiev dating agency" );

            } else {
                link.click();
                linksOfArticles = blogPage.collectAllLinksOfArticles();
            }
        }

    }
}




