package com.kaleb.adapterpattern.adapter;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version DuckAdapter, v 0.1 2019-09-02 15:03 by Billy Kaleb Hananto
 */
public class DuckAdapter implements HumanInterfaces {

    private final TalkingDuckObject talkingDuckObject;

    public DuckAdapter(TalkingDuckObject talkingDuckObject) {
        this.talkingDuckObject = talkingDuckObject;
    }

    @Override
    public void sayHello() {
        talkingDuckObject.kwek();
        talkingDuckObject.kwock();
    }

    @Override
    public void sayGoodbye() {
        talkingDuckObject.quack();
        talkingDuckObject.quack();
    }

    @Override
    public void sayGoodnight() {
        talkingDuckObject.peck();
        talkingDuckObject.weck();
    }
}
