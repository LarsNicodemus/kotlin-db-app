package com.example.app_sql.data.esampledata

import com.example.app_sql.R
import com.example.app_sql.data.datamodels.BookData
import com.example.app_sql.data.datamodels.Status

object BookExampleData {


    val exampleBooks = mutableListOf(
        BookData(
            1,
            "1984",
            "George Orwell",
            "Dystopian Fiction",
            false,
            false,
            false,
            5,
            "Ein Klassiker der dystopischen Literatur. Beängstigend aktuell.",
            R.drawable._984_book
        ),
        BookData(
            2,
            "Der Herr der Ringe",
            "J.R.R. Tolkien",
            "Fantasy",
            false,
            false,
            false,
            5,
            "Episches Fantasywerk. Tolkiens Worldbuilding ist unübertroffen.",
            R.drawable.lord_of_the_rings_book
        ),
        BookData(
            3,
            "Harry Potter und der Stein der Weisen",
            "J.K. Rowling",
            "Young Adult Fantasy",
            false,
            false,
            false,
            3,
            "Der Beginn einer magischen Reise. Perfekt für Jung und Alt.",
             R.drawable.harry_potter_book
        ),
        BookData(
            4,
             "Die Verwandlung",
            "Franz Kafka",
             "Novelle",
             false,
             false,
             false,
             5,
            "Surreale und beunruhigende Geschichte. Noch nicht ganz durchgearbeitet.",
             R.drawable.verwandlung_buch
        ),
        BookData(
            5,
            "Der Alchimist",
            "Paulo Coelho",
             "Philosophischer Roman",
            false,
             false,
             false,
            4,
            "Wurde mir oft empfohlen. Steht auf meiner To-Read-Liste.",
             R.drawable.alchemist_book
        ),
        BookData(
            6,
             "Pride and Prejudice",
            "Jane Austen",
             "Klassischer Roman",
            false,
            false,
            false,
            4,
            "Zeitlose Liebesgeschichte mit scharfsinnigem Gesellschaftskommentar.",
             R.drawable.pride_and_prejudice_book
        ),
        BookData(
            7,
             "Die Physiker",
            "Friedrich Dürrenmatt",
             "Drama",
            false,
             false,
             false,
            0,
            "Faszinierende Auseinandersetzung mit Wissenschaftsethik und Verantwortung.",
             R.drawable.physiker_book
        ),
        BookData(
            8,
             "Der Name der Rose",
            "Umberto Eco",
             "Historischer Roman",
             false,
             false,
            false,
             0,
            "Komplexer historischer Krimi. Die mittelalterliche Atmosphäre ist fesselnd.",
             R.drawable.rose_book
        ),
        BookData(
            9,
             "Neuromancer",
             "William Gibson",
             "Science Fiction",
            false,
             false,
             false,
             0,
            "Gilt als Cyberpunk-Klassiker. Muss ich unbedingt lesen.",
             R.drawable.neuromancer_book
        ),
        BookData(
            10,
             "To Kill a Mockingbird",
            "Harper Lee",
             "Gesellschaftsroman",
            false,
             false,
            false,
             0,
            "Bewegende Geschichte über Rassismus und Gerechtigkeit. Ein Meisterwerk.",
             R.drawable.mockingbird_book
        )
    )
}