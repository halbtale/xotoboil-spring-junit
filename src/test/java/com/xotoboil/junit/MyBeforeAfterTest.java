package com.xotoboil.junit;

import org.junit.jupiter.api.*;

public class MyBeforeAfterTest {
    @BeforeAll
    static void beforeAll() {
        System.out.println("BEFORE ALL");
    }

    @BeforeEach
    void beforeEach() {
        System.out.println("BEFORE EACH");
    }

    @Test
    void test1() {
        System.out.println("Test 1");
    }

    @Test
    void test2() {
        System.out.println("Test 2");
    }

    @Test
    void test3() {
        System.out.println("Test 3");
    }

    @AfterEach
    void afterEach() {
        System.out.println("AFTER EACH");
    }

    @AfterAll
    static void afterAll() {
        System.out.println("AFTER ALL");
    }
}
