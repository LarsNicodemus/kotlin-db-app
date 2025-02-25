# Kotlin DB App

This project is a Kotlin-based Android app that demonstrates how to work with a local database using **Room** and **SQLite**. It integrates **HttpLoggingInterceptor** for monitoring HTTP requests and responses, providing a full solution for data management, local storage, and networking.

## About the App

The **Kotlin DB App** stores and retrieves data from a local database using **Room** (an abstraction layer over SQLite). The app also includes networking functionality, which utilizes **HttpLoggingInterceptor** to log and monitor network requests. This makes it a comprehensive example of combining local and remote data management in an Android app.

Key features include:
- **Room Database**: Efficient storage and retrieval of data locally.
- **SQLite**: Underlying database system used by Room for local storage.
- **HttpLoggingInterceptor**: Logs HTTP requests and responses for debugging and monitoring network activity.
- **CRUD Operations**: Ability to create, read, update, and delete data stored in the local database.

## Features

- **Room Database**: A powerful database abstraction layer that simplifies database management and operations.
- **SQLite**: Uses SQLite as the underlying database engine with Room as an interface.
- **HttpLoggingInterceptor**: Logs network calls to monitor and debug API requests and responses.
- **CRUD Operations**: Full support for creating, reading, updating, and deleting data in the local database.

## Technologies and Concepts

- **Kotlin**: The programming language used for Android development.
- **Room Database**: An Android persistence library that provides an abstraction layer over SQLite to allow for more robust database access.
- **SQLite**: The database engine used by Room for local data storage.
- **HttpLoggingInterceptor**: A logging mechanism to log HTTP requests and responses for network calls, useful for debugging.
- **LiveData**: Observes data changes and updates the UI automatically.
- **ViewModel**: Manages UI-related data in a lifecycle-conscious way.
- **Retrofit**: HTTP client for making network requests (optional, if used for networking).
- **Android Studio**: The official IDE for Android development.

## Installation

1. Clone the repository:
   ```bash
   git clone https://github.com/LarsNicodemus/kotlin-db-app.git
Open the project in Android Studio.

Build the app and run it on an emulator or physical device.

### Usage
The app allows you to store data in the local Room Database.
It supports basic CRUD operations for adding, updating, and deleting records.
If integrated, network requests can be monitored using HttpLoggingInterceptor, providing real-time logs of API calls and responses.
SQLite serves as the backend for Room, handling all database operations in the app.

### Contributing
Contributions are welcome! Please create a pull request or open an issue to suggest improvements or report bugs.

### License
This project is licensed under the MIT License. See the LICENSE file for more information.

Note: This app demonstrates the integration of Room Database, SQLite, and HttpLoggingInterceptor in Android development. It was created to illustrate how to handle local storage, network requests, and data management in Kotlin-based Android apps.
