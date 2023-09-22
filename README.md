# Vocabulary Practice Application

The Vocabulary Practice App is a JavaFX-based application designed to help users improve their vocabulary by providing features for entering new words and practicing them. This document provides an overview of the application, its functionality, and how to get started with it.

<a href="url"><img src="https://github.com/ken1009us/vocabulary-practice-app/blob/main/img/ui.png" height="350" width="350" ></a>

## Introduction

The Vocabulary Practice Application is a Java-based desktop application developed for vocabulary enthusiasts who want to expand their word knowledge. It offers a user-friendly interface for entering new words and practicing them through interactive exercises.

## Features

The Vocabulary Practice Application provides the following key features:

1. Enter New Words:

- Users can easily input new words and their definitions into the application.

2. Practice Mode:

- PracticeView allows users to test their knowledge by quizzing themselves on the words they've entered.

3. User-Friendly Interface:

- The application offers an intuitive and clean interface for a seamless user experience.

4. Switch Between Views:

- Users can switch between entering new words and practicing with a single click.

## Getting Started

To get started with the Vocabulary Practice Application, follow these steps:

1. Clone the Repository:

```bash
$ git clone https://github.com/ken1009us/vocabulary-practice-app.git
```

2. Prerequisites:

- Ensure you have Java Development Kit (JDK) installed on your system.

3. Compile and Run:

Navigate to the project directory and compile the application using the following command:

```bash
$ javac com/vocabularyapp/PracticeApplication.java
```

Run the application with:

```bash
$ java com.vocabularyapp.PracticeApplication
```

4. Usage:

Once the application window appears, you can start entering new words or switch to practice mode using the provided buttons.

## Application Structure

The application follows a basic structure with two main views: InputView for entering new words and PracticeView for practicing. The code structure is organized as follows:

- PracticeApplication: The main class that initializes the application and sets up the user interface.

- Dictionary: Represents the vocabulary dictionary and manages word data.

- PracticeView and InputView: Classes responsible for displaying the practice and input views, respectively.

- HBox, Button, and BorderPane: JavaFX components used for building the user interface.

## Dependencies

The Vocabulary Practice Application uses JavaFX for the graphical user interface. Ensure you have JavaFX installed and configured in your development environment.