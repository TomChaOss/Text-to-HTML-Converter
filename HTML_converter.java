import java.io.*;
import java.util.Scanner;
public class HTML_converter {
    public static void main (String[] args) throws FileNotFoundException{
        Scanner scanner = new Scanner(System.in); // Create a Scanner to read user input
        System.out.println("Enter the name of the file to read from, don't forget to include the .txt");
        String file_name = scanner.nextLine(); // Get the file name from the user
        scanner.close();
        System.out.println();

        File user_file = new File(file_name); // Create a File object from the file name given by the user
        Scanner scan = new Scanner(user_file); // Create a Scanner to read from the given file

        PrintStream html_file = new PrintStream(new File("sample text.html")); // Create an html output file
        html_file.println("<html>");
        html_file.println("<body>");

        while (scan.hasNextLine()) {
            String line = scan.nextLine();
            if (!line.isEmpty() && line.charAt(0) == '#' && line.charAt(line.length() - 1) == '#') {
                html_file.printf("<h1>%s</h1>\n",line.replace("#",""));

            } else if (line.equals("")) {
                html_file.print("<P>");

            } else if (!line.isEmpty() && line.charAt(0) == '-') {
                html_file.println("<ul>");
                html_file.printf("<li>%s</li>\n",line.substring(1));
                html_file.println("</ul>");

            } else if (line.contains("[") && line.contains("]")) {
                html_file.printf("<p>%s</p>",line.substring(0, line.indexOf("[[")));
                String url_link = line.substring(line.indexOf("[[") + 2, line.indexOf("]["));
                String url_text = line.substring(line.indexOf("][") + 2, line.indexOf("]]"));
                html_file.printf("<a href=\"%s\"> %s</a>", url_link, url_text);
    
            }else {
                html_file.printf("<p>%s</p>\n",line);
            }
        }
        html_file.println("</html>");
        html_file.println("</body>");
        html_file.close();
        scan.close();
    }
}