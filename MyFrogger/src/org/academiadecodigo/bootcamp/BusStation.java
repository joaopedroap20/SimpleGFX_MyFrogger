package org.academiadecodigo.bootcamp;

public class BusStation {

    public BusStation() {
    }
    public Bus bus2 = new Bus(-560,585, 0);
    public Bus bus1 = new Bus(-770,100, 0); //perfect
    public Bus bus3 = new Bus(-560,290, 0);
    public Bus bus8 = new Bus(-700,455, 0); //To much clutter
    public Bus bus9 = new Bus(-660,100, 0);
    public Bus bus4 = new Bus(-560, 645, 0); //perfect
    public Bus bus5 = new Bus(-560, 100, 0);
    public Bus bus6 = new Bus(-870, 100, 0);
    public Bus bus7 = new Bus(-760, 230, 0);
    public void Threads() {

        bus1.thread3.start();
        bus2.thread2.start();
        bus3.thread2.start();
        bus4.thread1.start();
        bus5.thread3.start();
        bus6.thread3.start();
        bus7.thread2.start();
        bus8.thread2.start();
        bus9.thread3.start();
    }
}


