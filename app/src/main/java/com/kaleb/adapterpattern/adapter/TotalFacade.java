package com.kaleb.adapterpattern.adapter;

/**
 * @author Billy Kaleb Hananto (billy.hananto@dana.id)
 * @version TotalFacade, v 0.1 2019-09-02 15:11 by Billy Kaleb Hananto
 */
public class TotalFacade {

    private final TalkingHumanObject humanObject;

    private final TalkingDuckObject duckObject;

    public TotalFacade(TalkingHumanObject humanObject,
        TalkingDuckObject duckObject) {
        this.humanObject = humanObject;
        this.duckObject = duckObject;
    }

    public void morningConversation() {
        humanObject.sayHello();
        duckObject.kwek();
        duckObject.peck();
        duckObject.quack();
    }

    public void finishedConversation() {
        humanObject.sayGoodbye();
        duckObject.quack();
        duckObject.kwek();
        humanObject.sayGoodnight();
        duckObject.kwock();
        duckObject.weck();
    }
}
