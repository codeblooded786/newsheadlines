package com.example.demo.model;

import java.util.List;
import java.util.Objects;

/**
 * @project demo
 * Created by @author Rahul Dev Gupta on 08/03/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class NewsSourcesResponse {

    String status;
    List<Source> sources;

    public String getStatus() {
        return status;
    }

    public List<Source> getSources() {
        return sources;
    }

    @Override
    public String toString() {
        return "NewsSourcesResponse{" +
                "status='" + status + '\'' +
                ", sources=" + sources +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsSourcesResponse that = (NewsSourcesResponse) o;
        return Objects.equals(status, that.status) && Objects.equals(sources, that.sources);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, sources);
    }
}
