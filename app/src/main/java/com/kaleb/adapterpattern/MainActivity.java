package com.kaleb.adapterpattern;

import com.kaleb.adapterpattern.R;
import com.kaleb.adapterpattern.adapter.DuckAdapter;
import com.kaleb.adapterpattern.adapter.HumanInterfaces;
import com.kaleb.adapterpattern.adapter.TalkingDuckObject;
import com.kaleb.adapterpattern.adapter.TalkingHumanObject;
import com.kaleb.adapterpattern.adapter.TotalFacade;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TalkingDuckObject duckObject = new TalkingDuckObject();
        TalkingHumanObject humanObject = new TalkingHumanObject();

        TotalFacade totalFacade = new TotalFacade(humanObject, duckObject);

        HumanInterfaces duckAdapter = new DuckAdapter(duckObject);

        sayGoodbye(humanObject, duckAdapter);

        totalFacade.morningConversation();
    }


    private void sayHello(HumanInterfaces humanInterfaces1, HumanInterfaces humanInterfaces2) {
        System.out.println("First Human :");
        humanInterfaces1.sayHello();
        System.out.println("Second Human :");
        humanInterfaces2.sayHello();
    }

    private void sayGoodnight(HumanInterfaces humanInterfaces, HumanInterfaces humanInterfaces2) {
        System.out.println("First Human :");
        humanInterfaces.sayGoodnight();
        System.out.println("Second Human :");
        humanInterfaces2.sayGoodnight();
    }

    private void sayGoodbye(HumanInterfaces humanInterfaces, HumanInterfaces humanInterfaces2) {
        System.out.println("First Human :");
        humanInterfaces.sayGoodbye();
        System.out.println("Second Human :");
        humanInterfaces2.sayGoodbye();
    }
}
