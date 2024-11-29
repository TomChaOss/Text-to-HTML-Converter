# Webify

A Java program that converts text files into HTML format, making them web-ready with proper HTML formatting and structure.

## Description

Webify is a simple text-to-HTML converter that reads from a text file and generates an HTML file with appropriate tags and formatting. The program recognizes special syntax in the input text file and converts it to corresponding HTML elements:

- Lines enclosed in `#` symbols are converted to HTML headers (`<h1>`)
- Bullet points starting with `-` are converted to unordered lists (`<ul>` and `<li>`)
- Links in the format `[[URL][Text]]` are converted to HTML anchor tags (`<a href="">`)
- Empty lines are converted to paragraph breaks
- Regular text is wrapped in paragraph tags (`<p>`)

## Getting Started

### Prerequisites

- Java Development Kit (JDK) installed on your system
- A text editor or IDE
- Basic understanding of how to run Java programs from the command line

### Installation

1. Clone this repository to your local machine:
```bash
git clone [your-repository-url]
```

2. Navigate to the project directory:
```bash
cd webify
```

### Usage

1. Compile the Java file:
```bash
javac Webify.java
```

2. Run the program:
```bash
java Webify
```

3. When prompted, enter the name of your input text file (including the .txt extension)

The program will generate an HTML file named "sample text.html" in the same directory.

## Input Format Specifications

Your input text file should follow these formatting rules:

- Headers: Enclose text in `#` symbols
  ```
  #This is a header#
  ```

- Bullet points: Start lines with `-`
  ```
  - This is a bullet point
  ```

- Links: Use the format `[[URL][Display Text]]`
  ```
  [[https://example.com][Click here]]
  ```

## Example

Input text file:
```text
#Assignment 7 header, this contains hashtag symbols#

I don't know what to put here so here are my top 3 bands of all time in no particular order:
- Metallica.
- Guns n' Roses.
- Arctic Monkeys.

This album is what got me into rock: [[https://open.spotify.com/album/28yHV3Gdg30AiB8h8em1eW?si=41ec166c7a334a9e][Appetite for Destruction]]
```

Output HTML will include proper HTML tags and formatting.

## Contributing

Feel free to fork this repository and submit pull requests with improvements.

## License

This project is open source and available under the [MIT License](https://opensource.org/licenses/MIT).
