package hoangthuy.dmt.newsapp.Models;

import java.util.List;

public class NewsApiResponse {
    String status;
    int totalResults;
    List<NewsApiResponse> articles;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getTotalResults() {
        return totalResults;
    }

    public void setTotalResults(int totalResults) {
        this.totalResults = totalResults;
    }

    public List<NewsApiResponse> getArticles() {
        return articles;
    }

    public void setArticles(List<NewsApiResponse> articles) {
        this.articles = articles;
    }
}
