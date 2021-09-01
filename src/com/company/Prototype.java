package com.company;

public class Prototype {
    interface Clone {
        Object clone();
    }

    static class Book implements Clone {
        String name;
        String author;


        public Book(String name, String author) {
            this.name = name;
            this.author = author;
        }

        public Object clone() {
            Book clone = new Book(name, author);
            return clone;
        }

        public String toString() {
            return "Book name:\t" + name + "\nBook author:\t" + author;
        }
    }


}
