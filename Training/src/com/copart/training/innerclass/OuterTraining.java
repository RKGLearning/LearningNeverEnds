package com.copart.training.innerclass;

public final class OuterTraining {
    private int data = 30;

    private class Inner{
        public void msg(int data) {
            System.out.println("Data is " + data);
        }
    }
    public static void main(String args[]) {
        OuterTraining outerTraining = new OuterTraining();
        OuterTraining.Inner in = outerTraining.new Inner();
        in.msg(50);
    }
}
