package com.company;

import java.util.ArrayList;

public abstract class  User {


    ArrayList<Book> books= new ArrayList<>();
    public void showAllBooks() {

        books.add(new Book("Crime and punishment", "Freydor Dostoyevski",
                "Crime and Punishment is a novel by the Russian author Fyodor Dostoevsky. " +
                        "It was first published in the literary journal The Russian Messenger in twelve monthly installments during 1866. " +
                        "It was later published in a single volume." +
                        " It is the second of Dostoevsky's full-length novels following his return from ten years of exile in Siberia. ", true));


        books.add(new Book("Thus speaks Zarathustra", "Frederich Nistzche", "Thus Spoke Zarathustra: A Book for All and None is a philosophical novel by German philosopher" +
                " Friedrich Nietzsche, " +
                "composed in four parts written between 1883 and 1885 and published between 1883 and 1891", false));


        books.add(new Book("The selfish Gene", "Richard Dawkinns", "The Selfish Gene is a 1976 book on evolution by the biologist Richard Dawkins, " +
                "in which the author builds upon the principal theory of George C. Williams's Adaptation and Natural Selection." +
                " Dawkins uses the term selfish gene as a way of expressing the gene-centred view of evolution, popularising ideas developed during the 1960s", true));


        books.add(new Book("The Kama sutra", "unknown", "The Kama Sutra is an ancient Indian Sanskrit text on sexuality, " +
                "eroticism and emotional fulfillment in life." +
                " Attributed to Vātsyāyana, the Kama Sutra is neither exclusively nor predominantly a sex manual on sex positions," +
                " but written as a guide to the art-of-living well, the nature of love, finding a life partner," +
                " maintaining one's love life, and other aspects pertaining to pleasure-oriented faculties of human life." +
                " Kamasutra is the oldest surviving Hindu text on erotic love", true));

        books.add(new Book("The Bible", "unknown", "The Bible is a compilation of 66 books and letters written by more than 40 authors during a period of approximately 1,500 years. " +
                "Its original text was communicated in just three languages: Hebrew, koine or common Greek, and Aramaic. " +
                "The Old Testament was written for the most part in Hebrew, with a small percentage in Aramaic. " +
                "The New Testament was written in Greek.", true));


    }


}
