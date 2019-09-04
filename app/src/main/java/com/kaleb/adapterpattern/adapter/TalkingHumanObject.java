package com.kaleb.adapterpattern.adapter;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version TalkingHumanObject, v 0.1 2019-09-02 15:03 by Billy Kaleb Hananto
 */
public class TalkingHumanObject implements HumanInterfaces {

    @Override
    public void sayHello() {
        System.out.println("Hello");
    }

    @Override
    public void sayGoodbye() {
        System.out.println("Goodbye");
    }

    @Override
    public void sayGoodnight() {
        System.out.println("Goodnight");
    }
}
