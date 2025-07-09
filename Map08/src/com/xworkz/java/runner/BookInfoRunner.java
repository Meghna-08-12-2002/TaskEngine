package com.xworkz.java.runner;

import com.xworkz.java.dto.AuthorDto;
import com.xworkz.java.dto.BookInfoDto;

import java.time.LocalDate;
import java.util.*;

public class BookInfoRunner {
    public static void main(String[] args) {
        Map<BookInfoDto, List<AuthorDto>> map = new HashMap<>();
        BookInfoDto book1 = new BookInfoDto("Java Basics", "Programming", LocalDate.of(2020, 3, 1), 300, 450.0,
                Arrays.asList(new AuthorDto("John Doe", "john@example.com", 9876543210L)));

        BookInfoDto book2 = new BookInfoDto("Advanced Java", "Programming", LocalDate.of(2021, 5, 10), 450, 550.0,
                Arrays.asList(new AuthorDto("Jane Smith", "jane@example.com", 9876500000L)));

        BookInfoDto book3 = new BookInfoDto("Spring Boot", "Framework", LocalDate.of(2022, 2, 15), 350, 600.0,
                Arrays.asList(new AuthorDto("Raj Patel", "raj@gmail.com", 9876567890L)));

        BookInfoDto book4 = new BookInfoDto("Hibernate ORM", "Framework", LocalDate.of(2020, 11, 5), 320, 480.0,
                Arrays.asList(new AuthorDto("Anjali Rao", "anjali@code.com", 9876001111L)));

        BookInfoDto book5 = new BookInfoDto("Data Structures", "CS", LocalDate.of(2019, 8, 25), 400, 499.0,
                Arrays.asList(new AuthorDto("Amit Kumar", "amit@ds.com", 9001234567L)));

        BookInfoDto book6 = new BookInfoDto("Machine Learning", "AI", LocalDate.of(2021, 12, 20), 420, 700.0,
                Arrays.asList(new AuthorDto("Kavya N", "kavya@ml.com", 9012345678L)));

        BookInfoDto book7 = new BookInfoDto("Python Basics", "Programming", LocalDate.of(2018, 4, 18), 280, 300.0,
                Arrays.asList(new AuthorDto("Vikram S", "vikram@py.com", 9877777777L)));

        BookInfoDto book8 = new BookInfoDto("Web Development", "Web", LocalDate.of(2019, 7, 30), 360, 420.0,
                Arrays.asList(new AuthorDto("Sneha R", "sneha@web.com", 9988776655L)));

        BookInfoDto book9 = new BookInfoDto("Cloud Computing", "IT", LocalDate.of(2022, 3, 14), 310, 390.0,
                Arrays.asList(new AuthorDto("Gokul", "gokul@cloud.com", 9900112233L)));

        BookInfoDto book10 = new BookInfoDto("DevOps Handbook", "IT", LocalDate.of(2021, 6, 5), 370, 510.0,
                Arrays.asList(new AuthorDto("Neha S", "neha@devops.com", 9111122233L)));

        BookInfoDto book11 = new BookInfoDto("Algorithms", "CS", LocalDate.of(2020, 1, 15), 430, 580.0,
                Arrays.asList(new AuthorDto("Pranav", "pranav@algo.com", 9445566778L)));

        BookInfoDto book12 = new BookInfoDto("System Design", "CS", LocalDate.of(2022, 8, 10), 500, 750.0,
                Arrays.asList(new AuthorDto("Divya M", "divya@design.com", 9556677889L)));

        BookInfoDto book13 = new BookInfoDto("React.js Guide", "Frontend", LocalDate.of(2021, 10, 3), 310, 400.0,
                Arrays.asList(new AuthorDto("Rakesh", "rakesh@react.com", 9222333444L)));

        BookInfoDto book14 = new BookInfoDto("Angular Deep Dive", "Frontend", LocalDate.of(2020, 9, 17), 380, 450.0,
                Arrays.asList(new AuthorDto("Aarthi", "aarthi@angular.com", 9111222333L)));

        BookInfoDto book15 = new BookInfoDto("Node.js Essentials", "Backend", LocalDate.of(2021, 1, 11), 340, 410.0,
                Arrays.asList(new AuthorDto("Kiran B", "kiran@node.com", 9333444555L)));

        BookInfoDto book16 = new BookInfoDto("C++ Primer", "Programming", LocalDate.of(2019, 3, 28), 460, 580.0,
                Arrays.asList(new AuthorDto("Ravi K", "ravi@cpp.com", 9666777888L)));

        BookInfoDto book17 = new BookInfoDto("Kotlin for Android", "Mobile Dev", LocalDate.of(2022, 4, 5), 390, 620.0,
                Arrays.asList(new AuthorDto("Bhavya S", "bhavya@kotlin.com", 9788990001L)));

        BookInfoDto book18 = new BookInfoDto("iOS Swift Guide", "Mobile Dev", LocalDate.of(2020, 5, 6), 350, 590.0,
                Arrays.asList(new AuthorDto("Sathish", "sathish@swift.com", 9012341111L)));

        BookInfoDto book19 = new BookInfoDto("Cybersecurity", "Security", LocalDate.of(2021, 2, 22), 370, 530.0,
                Arrays.asList(new AuthorDto("Lavanya", "lavanya@cyber.com", 9111990000L)));

        BookInfoDto book20 = new BookInfoDto("Ethical Hacking", "Security", LocalDate.of(2022, 9, 9), 410, 670.0,
                Arrays.asList(new AuthorDto("Harish", "harish@hack.com", 9001231234L)));

        BookInfoDto book21 = new BookInfoDto("Blockchain Basics", "Tech", LocalDate.of(2021, 6, 19), 290, 520.0,
                Arrays.asList(new AuthorDto("Megha", "megha@block.com", 9888777666L)));

        BookInfoDto book22 = new BookInfoDto("Crypto Explained", "Finance", LocalDate.of(2022, 10, 1), 330, 480.0,
                Arrays.asList(new AuthorDto("Yogesh", "yogesh@crypto.com", 9445566000L)));


        BookInfoDto book23 = new BookInfoDto("AI & Robotics", "AI", LocalDate.of(2020, 12, 12), 410, 730.0,
                Arrays.asList(new AuthorDto("Charan", "charan@ai.com", 9877654321L)));

        BookInfoDto book24 = new BookInfoDto("Big Data", "Data", LocalDate.of(2022, 11, 11), 470, 690.0,
                Arrays.asList(new AuthorDto("Shreya", "shreya@data.com", 9123456789L)));

        BookInfoDto book25 = new BookInfoDto("Data Analytics", "Data", LocalDate.of(2021, 7, 7), 390, 620.0,
                Arrays.asList(new AuthorDto("Surya", "surya@analytics.com", 9988991122L)));

        map.put(book1, book1.getAuthors());
        map.put(book2, book2.getAuthors());
        map.put(book3, book3.getAuthors());
        map.put(book4, book4.getAuthors());
        map.put(book5, book5.getAuthors());
        map.put(book6, book6.getAuthors());
        map.put(book7, book7.getAuthors());
        map.put(book8, book8.getAuthors());
        map.put(book9, book9.getAuthors());
        map.put(book10, book10.getAuthors());
        map.put(book11, book11.getAuthors());
        map.put(book12, book12.getAuthors());
        map.put(book13, book13.getAuthors());
        map.put(book14, book14.getAuthors());
        map.put(book15, book15.getAuthors());
        map.put(book16, book16.getAuthors());
        map.put(book17, book17.getAuthors());
        map.put(book18, book18.getAuthors());
        map.put(book19, book19.getAuthors());
        map.put(book20, book20.getAuthors());
        map.put(book21, book21.getAuthors());
        map.put(book22, book22.getAuthors());
        map.put(book23, book23.getAuthors());
        map.put(book24, book24.getAuthors());
        map.put(book25, book25.getAuthors());

        Set<Map.Entry<BookInfoDto, List<AuthorDto>>> entrySet = map.entrySet();
        entrySet.forEach(e -> {
            BookInfoDto book = e.getKey();
            List<AuthorDto> authors = e.getValue();
            System.out.println(book);
            System.out.println(authors);
        });
    }
}
