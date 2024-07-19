package com.example.app_sql.data.esampledata

import com.example.app_sql.R
import com.example.app_sql.data.datamodels.BookData
import com.example.app_sql.data.datamodels.Status

object BookExampleData {


    val exampleBooks = mutableListOf(
        BookData(

            title = "1984",
            author = "George Orwell",
            genre = "Dystopian Fiction",
            finished = false,
            wantToRead = false,
            isReading = false,
            review = 0,
            note = "Ein Klassiker der dystopischen Literatur. Beängstigend aktuell.",
            image = R.drawable._984_book
        ),
        BookData(

            title = "Der Herr der Ringe",
            author = "J.R.R. Tolkien",
            genre = "Fantasy",
            finished = false,
            wantToRead = false,
            isReading = false,
            review = 5,
            note = "Episches Fantasywerk. Tolkiens Worldbuilding ist unübertroffen.",
            image = R.drawable.lord_of_the_rings_book
        ),
        BookData(

            title = "Harry Potter und der Stein der Weisen",
            author = "J.K. Rowling",
            genre = "Young Adult Fantasy",
            finished = false,
            wantToRead = false,
            isReading = false,
            review = 3,
            note = "Der Beginn einer magischen Reise. Perfekt für Jung und Alt.",
            image = R.drawable.harry_potter_book
        ),
        BookData(

            title = "Die Verwandlung",
            author = "Franz Kafka",
            genre = "Novelle",
            finished = false,
            wantToRead = false,
            isReading = false,
            review = 5,
            note = "Surreale und beunruhigende Geschichte. Noch nicht ganz durchgearbeitet.",
            image = R.drawable.verwandlung_buch
        ),
        BookData(

            title = "Der Alchimist",
            author = "Paulo Coelho",
            genre = "Philosophischer Roman",
            finished = false,
            wantToRead = false,
            isReading = false,
            review = 4,
            note = "Wurde mir oft empfohlen. Steht auf meiner To-Read-Liste.",
            image = R.drawable.alchemist_book
        ),
        BookData(

            title = "Pride and Prejudice",
            author = "Jane Austen",
            genre = "Klassischer Roman",
            finished = false,
            wantToRead = false,
            isReading = false,
            review = 4,
            note = "Zeitlose Liebesgeschichte mit scharfsinnigem Gesellschaftskommentar.",
            image = R.drawable.pride_and_prejudice_book
        ),
        BookData(

            title = "Die Physiker",
            author = "Friedrich Dürrenmatt",
            genre = "Drama",
            finished = false,
            wantToRead = false,
            isReading = false,
            review = 0,
            note = "Faszinierende Auseinandersetzung mit Wissenschaftsethik und Verantwortung.",
            image = R.drawable.physiker_book
        ),
        BookData(

            title = "Der Name der Rose",
            author = "Umberto Eco",
            genre = "Historischer Roman",
            finished = false,
            wantToRead = false,
            isReading = false,
            review = 0,
            note = "Komplexer historischer Krimi. Die mittelalterliche Atmosphäre ist fesselnd.",
            image = R.drawable.rose_book
        ),
        BookData(

            title = "Neuromancer",
            author = "William Gibson",
            genre = "Science Fiction",
            finished = false,
            wantToRead = false,
            isReading = false,
            review = 0,
            note = "Gilt als Cyberpunk-Klassiker. Muss ich unbedingt lesen.",
            image = R.drawable.neuromancer_book
        ),
        BookData(

            title = "To Kill a Mockingbird",
            author = "Harper Lee",
            genre = "Gesellschaftsroman",
            finished = false,
            wantToRead = false,
            isReading = false,
            review = 0,
            note = "Bewegende Geschichte über Rassismus und Gerechtigkeit. Ein Meisterwerk.",
            image = R.drawable.mockingbird_book
        )
    )
}