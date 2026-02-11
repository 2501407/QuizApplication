package database;

/**
 * Utility class to seed the database with sample questions.
 * Run this class once to populate the questions table with initial data.
 */
public class QuestionSeeder {
    
    public static void main(String[] args) {
        System.out.println("Starting to seed questions...");
        int successCount = 0;
        int failCount = 0;
        
        // Beginner Questions
        successCount += insertQuestion("What does HTML stand for?", 
            "Hyper Text Markup Language", "High Tech Modern Language", 
            "Home Tool Markup Language", "Hyperlinks and Text Markup Language", 
            "A", "Beginner") > 0 ? 1 : 0;
            
        successCount += insertQuestion("Which programming language is known as the \"language of the web\"?", 
            "Python", "JavaScript", "Java", "C++", 
            "B", "Beginner") > 0 ? 1 : 0;
            
        successCount += insertQuestion("What does CSS stand for?", 
            "Computer Style Sheets", "Cascading Style Sheets", 
            "Creative Style Sheets", "Colorful Style Sheets", 
            "B", "Beginner") > 0 ? 1 : 0;
            
        successCount += insertQuestion("Which symbol is used for single-line comments in Java?", 
            "//", "/*", "#", "--", 
            "A", "Beginner") > 0 ? 1 : 0;
            
        successCount += insertQuestion("What is the correct file extension for Java files?", 
            ".java", ".class", ".jar", ".jav", 
            "A", "Beginner") > 0 ? 1 : 0;
        
        // Intermediate Questions
        successCount += insertQuestion("What is the time complexity of binary search?", 
            "O(n)", "O(log n)", "O(n^2)", "O(1)", 
            "B", "Intermediate") > 0 ? 1 : 0;
            
        successCount += insertQuestion("Which design pattern ensures a class has only one instance?", 
            "Factory", "Singleton", "Observer", "Strategy", 
            "B", "Intermediate") > 0 ? 1 : 0;
            
        successCount += insertQuestion("What is polymorphism in OOP?", 
            "Having multiple forms", "Data hiding", 
            "Code reusability", "Memory management", 
            "A", "Intermediate") > 0 ? 1 : 0;
            
        successCount += insertQuestion("Which HTTP method is used to update a resource?", 
            "GET", "POST", "PUT", "DELETE", 
            "C", "Intermediate") > 0 ? 1 : 0;
            
        successCount += insertQuestion("What is the default value of a boolean variable in Java?", 
            "true", "false", "null", "0", 
            "B", "Intermediate") > 0 ? 1 : 0;
        
        // Advanced Questions
        successCount += insertQuestion("What is the space complexity of merge sort?", 
            "O(1)", "O(log n)", "O(n)", "O(n^2)", 
            "C", "Advanced") > 0 ? 1 : 0;
            
        successCount += insertQuestion("Which SOLID principle states that classes should be open for extension but closed for modification?", 
            "Single Responsibility", "Open/Closed", 
            "Liskov Substitution", "Dependency Inversion", 
            "B", "Advanced") > 0 ? 1 : 0;
            
        successCount += insertQuestion("What is a deadlock in concurrent programming?", 
            "Two threads waiting for each other", "Thread termination", 
            "Memory leak", "Stack overflow", 
            "A", "Advanced") > 0 ? 1 : 0;
            
        successCount += insertQuestion("Which data structure is used to implement LRU cache efficiently?", 
            "Array", "Stack", 
            "HashMap + Doubly Linked List", "Binary Tree", 
            "C", "Advanced") > 0 ? 1 : 0;
            
        successCount += insertQuestion("What is the CAP theorem in distributed systems?", 
            "Consistency, Availability, Partition tolerance", "Cache, API, Performance", 
            "Code, Algorithm, Process", "Class, Abstract, Polymorphism", 
            "A", "Advanced") > 0 ? 1 : 0;
        
        System.out.println("\n=================================");
        System.out.println("Seeding completed!");
        System.out.println("Successfully inserted: " + successCount + " questions");
        System.out.println("Failed: " + failCount + " questions");
        System.out.println("=================================");
    }
    
    private static int insertQuestion(String question, String optA, String optB, 
                                      String optC, String optD, String correctOpt, 
                                      String difficulty) {
        return DBInsertion.insertQuestion(question, optA, optB, optC, optD, correctOpt, difficulty);
    }
}
