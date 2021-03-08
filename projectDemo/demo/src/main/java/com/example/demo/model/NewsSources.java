package com.example.demo.model;

import java.util.Objects;

/**
 * @project demo
 * Created by @author Rahul Dev Gupta on 08/03/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class NewsSources {

    String name;
    String url;
    String description;

    public NewsSources(String name, String url, String description) {
        this.name = name;
        this.url = url;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        NewsSources that = (NewsSources) o;
        return Objects.equals(name, that.name) && Objects.equals(url, that.url) && Objects.equals(description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, url, description);
    }

    @Override
    public String toString() {
        return "NewsSources{" +
                "name='" + name + '\'' +
                ", url='" + url + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
