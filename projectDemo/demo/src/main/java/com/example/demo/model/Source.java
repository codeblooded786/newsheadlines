package com.example.demo.model;

import java.util.Objects;

/**
 * @project demo
 * Created by @author Rahul Dev Gupta on 08/03/21
 * Time Complexity: O()    |   Auxiliary Space: O()
 */
public class Source {

    String id;
    String name;
    String description;
    String url;
    String category;
    String language;
    String country;

    public String getId() {
        return id;
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

    public String getCategory() {
        return category;
    }

    public String getLanguage() {
        return language;
    }

    public String getCountry() {
        return country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Source source = (Source) o;
        return Objects.equals(id, source.id) && Objects.equals(name, source.name) && Objects.equals(description, source.description) && Objects.equals(url, source.url) && Objects.equals(category, source.category) && Objects.equals(language, source.language) && Objects.equals(country, source.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, description, url, category, language, country);
    }

    @Override
    public String toString() {
        return "Source{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", url='" + url + '\'' +
                ", category='" + category + '\'' +
                ", language='" + language + '\'' +
                ", country='" + country + '\'' +
                '}';
    }
}
