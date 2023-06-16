# zippopotamapi

This repository contains an Java program that demonstrates how to integrate with an API using HttpURLConnection and process the response using the JSON library.

## Getting Started

To get started with this example, follow the instructions below.

### Prerequisites

Make sure you have the following software installed:

- Java Development Kit (JDK) version 8 or above
- Git (optional, for cloning the repository)

### Installation

1. Clone this repository using the following command:[zippopotam](https://github.com/ayaan097/zippopotamapi.git)
Alternatively, you can download the source code as a ZIP file from the repository's main page.

2. Open the project in your favorite Java IDE.

3. Build the project to compile the Java code.

4. Run the `Main` class, which contains the entry point for the program.

## Description

The Java program in this repository demonstrates how to make an API call to retrieve data from a specific URL. It uses the HttpURLConnection class to establish a connection, retrieve the response, and process the JSON data using the JSON library.

The program performs the following steps:

1. Creates a URL object with the specified URL string.
2. Opens a connection to the URL.
3. Retrieves the response code from the connection to check if the API call was successful.
4. If the response code is 200 (OK), reads the response from the API and stores it in a StringBuilder.
5. Converts the API response to a JSONObject and extracts specific information from it.
6. Prints the extracted information to the console.

Feel free to modify the URL and the processing logic according to your requirements.

## Resources

- [Java Documentation](https://docs.oracle.com/en/java/)
- [JSON Library Documentation](https://stleary.github.io/JSON-java/)

## License

This project is not licensed

