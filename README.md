# BDD Cucumber Maven Framework

A simple Java-based BDD test automation framework using **Cucumber**, **JUnit**, and **Maven**.

## 📚 Overview

This project follows the principles of **Behavior-Driven Development (BDD)** using:

- **Cucumber**: To write test cases in plain English (Gherkin syntax)
- **JUnit**: To execute the tests
- **Maven**: To manage project dependencies and builds

## 🧠 How It Works

1. Test scenarios are written in `.feature` files using Gherkin.
2. Each step in the feature file is implemented in Java under `stepdefinitions`.
3. A test runner (`@RunWith(Cucumber.class)`) is used to glue features and steps.
4. Hooks (`@Before`, `@After`) handle setup and teardown.
5. Maven runs the tests via the `mvn test` command.
