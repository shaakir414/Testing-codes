# 🧪 Web Application Automation Testing Framework

[![Java](https://img.shields.io/badge/Language-Java%2017+-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white)](https://www.oracle.com/java/)
[![Selenium](https://img.shields.io/badge/Tool-Selenium%20WebDriver%204.x-43B02A?style=for-the-badge&logo=selenium&logoColor=white)](https://www.selenium.dev/)
[![TestNG](https://img.shields.io/badge/Framework-TestNG-FF6F00?style=for-the-badge&logo=testng&logoColor=white)](https://testng.org/)
[![Maven](https://img.shields.io/badge/Build-Apache%20Maven-C71A36?style=for-the-badge&logo=apachemaven&logoColor=white)](https://maven.apache.org/)

---

## 📌 Project Overview
This repository contains an end-to-end web application automation testing suite built using **Java**, **Selenium WebDriver**, and **TestNG**. 

The framework is designed around industry standards—utilizing the **Page Object Model (POM)** architecture to maximize code reusability, maintainability, and clean separation of test scripts from web page locators.

---

## 🛠️ Tech Stack & Dependencies

* **Programming Language:** Java (JDK 17+)
* **Automation Tool:** Selenium WebDriver 4.x
* **Testing Framework:** TestNG
* **Build & Dependency Management:** Apache Maven
* **Design Pattern:** Page Object Model (POM)
* **Version Control:** Git & GitHub

---

## 🚀 Automated Test Scenarios & Components

This framework automates complex UI interactions across standard web applications (including [SauceDemo](https://www.saucedemo.com/) and [The Internet - Herokuapp](https://the-internet.herokuapp.com/)):

- [x] **Authentication & Flow Validation:** Login, logout, session persistence, and invalid credentials assertion.
- [x] **Dynamic Element Handling:** Explicit & Implicit Waits for asynchronous web elements (`WebDriverWait`, `ExpectedConditions`).
- [x] **User Interactions & Gestures:** Mouse Hover, Drag & Drop, Context Click (Right Click), Double Click using `Actions` class.
- [x] **Frames & Windows:** Switching between IFrames, pop-ups, and multiple browser tabs (`getWindowHandles`).
- [x] **Alerts & Modals:** Handling JavaScript alerts, prompts, and confirmation dialogs.
- [x] **Form Controls:** Checkboxes, Radio Buttons, Static & Dynamic Dropdowns (`Select` class), and File Upload automation.
- [x] **Assertions & Validations:** Hard & Soft Assertions via TestNG for precise failure reporting.

---

## 📂 Framework Architecture

```text
Testing-codes/
│
├── src/
│   ├── main/java/
│   │   ├── pages/            # Page Factory / Page Objects (Locators & User Actions)
│   │   └── utils/            # Reusable Utilities (Screenshots, Excel Readers, Config)
│   │
│   └── test/java/
│       ├── base/             # Driver Setup & Teardown (@BeforeMethod, @AfterMethod)
│       └── tests/            # TestNG Test Classes & Assertions
│
├── testng.xml                # TestNG Suite Execution File
├── pom.xml                   # Maven Dependencies & Plugins
└── README.md                 # Project Documentation
