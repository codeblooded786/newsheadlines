package com.example.demo.model;

import java.util.List;
import java.util.Objects;

/**
 * @project demo
 * Created by @author Rahul Dev Gupta on 08/03/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class MasterArticles {

    String status;
    Long totalResults;
    List<Article> articles;

    public String getStatus() {
        return status;
    }

    public Long getTotalResults() {
        return totalResults;
    }

    public List<Article> getArticles() {
        return articles;
    }

    @Override
    public String toString() {
        return "MasterArticles{" +
                "status='" + status + '\'' +
                ", totalResults=" + totalResults +
                ", articles=" + articles +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MasterArticles that = (MasterArticles) o;
        return Objects.equals(status, that.status) && Objects.equals(totalResults, that.totalResults) && Objects.equals(articles, that.articles);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, totalResults, articles);
    }
}
