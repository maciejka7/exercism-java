package com.exercism.learning.KarlsLanguages;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.*;

class LanguageListTest {

    LanguageList languageList = new LanguageList();

    @Test
    @Tag("task:1")
    @DisplayName("The isEmpty method returns true when the list contains no languages")
    void empty() {
        assertThat(languageList.isEmpty()).isTrue();
    }

    @Test
    @Tag("task:2")
    @DisplayName("The isEmpty method returns false after adding a language to the list")
    void nonEmpty() {
        languageList.addLanguage("Java");

        assertThat(languageList.isEmpty()).isFalse();
    }

    @Test
    @Tag("task:3")
    @DisplayName("The removeLanguage method correctly removes a language from the list")
    void removeLanguage() {
        languageList.addLanguage("Java");
        languageList.removeLanguage("Java");

        assertThat(languageList.isEmpty()).isTrue();
    }

    @Test
    @Tag("task:4")
    @DisplayName("The firstLanguage method returns the first language that was added to the list")
    void firstLanguage() {
        languageList.addLanguage("Java");
        languageList.addLanguage("Python");
        languageList.addLanguage("Ruby");

        assertThat(languageList.firstLanguage()).isEqualTo("Java");
    }

    @Test
    @Tag("task:5")
    @DisplayName("The count method returns the number of languages in the list")
    void countThree() {
        languageList.addLanguage("Java");
        languageList.addLanguage("Python");
        languageList.addLanguage("Ruby");

        assertThat(languageList.count()).isEqualTo(3);
    }

    @Test
    @Tag("task:5")
    @DisplayName("The count method returns 0 when the list is empty")
    void countEmpty() {
        assertThat(languageList.count()).isZero();
    }

    @Test
    @Tag("task:6")
    @DisplayName("The containsLanguage method returns true when the language is in the list")
    void containsLanguage() {
        languageList.addLanguage("Java");

        assertThat(languageList.containsLanguage("Java")).isTrue();
    }

    @Test
    @Tag("task:6")
    @DisplayName("The containsLanguage method returns false when the language is not in the list")
    void doesNotContainLanguage() {
        languageList.addLanguage("Kotlin");

        assertThat(languageList.containsLanguage("Java")).isFalse();
    }

    @Test
    @Tag("task:7")
    @DisplayName("The isExciting method returns true when the list contains Java")
    void excitingLanguageListWithJava() {
        languageList.addLanguage("Java");

        assertThat(languageList.isExciting()).isTrue();
    }

    @Test
    @Tag("task:7")
    @DisplayName("The isExciting method returns true when the list contains Kotlin")
    void excitingLanguageListWithKotlin() {
        languageList.addLanguage("Python");
        languageList.addLanguage("Kotlin");

        assertThat(languageList.isExciting()).isTrue();
    }

    @Test
    @Tag("task:7")
    @DisplayName("The isExciting method returns false when the list contains neither Java nor Kotlin")
    void boringLanguageList() {
        languageList.addLanguage("Python");
        languageList.addLanguage("Ruby");
        languageList.addLanguage("C++");

        assertThat(languageList.isExciting()).isFalse();
    }
}