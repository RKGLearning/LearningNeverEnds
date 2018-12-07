package com.copart.training.innerclass;

public abstract class AnonymousParent {

    abstract void eat();
}

class TestAnonymous {

    public static void main(String args[]) {
        AnonymousParent anonymousParent = new AnonymousParent() {
            @Override
            void eat() {
                System.out.println("Result From Anonymous");
            }
        };
        anonymousParent.eat();
    }
}

