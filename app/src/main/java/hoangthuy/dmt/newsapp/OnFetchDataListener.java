package hoangthuy.dmt.newsapp;

import java.util.List;

import hoangthuy.dmt.newsapp.Models.NewsHeadlines;

public interface OnFetchDataListener<NewsApiResponse>{
    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);
}
