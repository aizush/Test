$(document).ready(function() {var formatter = new CucumberHTML.DOMFormatter($('.cucumber-report'));formatter.uri("C:/Users/Sovet/home/src/test/java/features/book.feature");
formatter.feature({
  "name": "HTML Title",
  "description": "",
  "keyword": "Feature",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.scenarioOutline({
  "name": "Test html title",
  "description": "",
  "keyword": "Scenario Outline"
});
formatter.step({
  "name": "User can see the page",
  "keyword": "Given "
});
formatter.step({
  "name": "The title is \"\u003ctitle text\u003e\"",
  "keyword": "Then "
});
formatter.examples({
  "name": "",
  "description": "",
  "keyword": "Examples",
  "rows": [
    {
      "cells": [
        "title text"
      ]
    },
    {
      "cells": [
        "apple"
      ]
    }
  ]
});
formatter.scenario({
  "name": "Test html title",
  "description": "",
  "keyword": "Scenario Outline",
  "tags": [
    {
      "name": "@Test"
    }
  ]
});
formatter.step({
  "name": "User can see the page",
  "keyword": "Given "
});
formatter.match({
  "location": "TitleVerify.user_can_see_the_page()"
});
formatter.result({
  "status": "passed"
});
formatter.step({
  "name": "The title is \"apple\"",
  "keyword": "Then "
});
formatter.match({
  "location": "TitleVerify.the_title_is(String)"
});
formatter.result({
  "error_message": "java.lang.AssertionError\r\n\tat org.junit.Assert.fail(Assert.java:86)\r\n\tat org.junit.Assert.assertTrue(Assert.java:41)\r\n\tat org.junit.Assert.assertTrue(Assert.java:52)\r\n\tat steps.TitleVerify.the_title_is(TitleVerify.java:25)\r\n\tat ✽.The title is \"apple\"(C:/Users/Sovet/home/src/test/java/features/book.feature:6)\r\n",
  "status": "failed"
});
});