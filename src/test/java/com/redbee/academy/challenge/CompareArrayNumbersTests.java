package com.redbee.academy.challenge;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

import static org.hamcrest.collection.IsIterableContainingInOrder.contains;
import static org.hamcrest.MatcherAssert.assertThat;

public class CompareArrayNumbersTests {

  @Test
  @DisplayName("Tests happy path")
  public void testHappyPath() {
    List<Integer> result = CompareArrayNumbers.max(List.of(1, 2, 4), List.of(5, 5, 5));
    assertNotNull(result, "The result cannot be null");
    assertEquals(5, result.get(0));
    assertEquals(5, result.get(1));
    assertEquals(5, result.get(2));
  }

  @Test
  @DisplayName("Tests happy path")
  public void testHappyPath2() {
    List<Integer> result = CompareArrayNumbers.max(List.of(5, 1, 5), List.of(1, 5, 1));
    assertNotNull(result, "The result cannot be null");
    assertEquals(5, result.get(0));
    assertEquals(5, result.get(1));
    assertEquals(5, result.get(2));
  }

  @Test
  @DisplayName("Tests happy path")
  public void testHappyPath3() {
    List<Integer> result = CompareArrayNumbers.max(List.of(5, 1), List.of(1, 5, 1));
    assertNotNull(result, "The result cannot be null");
    assertEquals(5, result.get(0));
    assertEquals(5, result.get(1));
    assertEquals(1, result.get(2));
  }

/**
* Added tests for challenge
**/
  @Test
  @DisplayName("Tests RedBee challenge")
  public void testRedBeeChallenge() {

    List<Integer> list1 = Arrays.asList(10, 8, 1, 3);
    List<Integer> list2 = Arrays.asList(4, 2, 0, 10);

    List<Integer> maxListResult = Arrays.asList(Collections.max(list1), Collections.max(list2));

    assertNotNull(maxListResult, "The result cannot be null");

    assertThat(maxListResult, contains(10,10));

    assertEquals(10, maxListResult.get(0));
    assertEquals(10, maxListResult.get(1));
  }
}
