package com.freddy.rxbaby;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.freddy.babylib.http.entry.BResponse;
import com.freddy.babylib.http.subcribers.NoProgressSubscriber;
import com.freddy.babylib.http.subcribers.SubscriberOnNextListener;
import com.freddy.rxbaby.http.HttpMethod;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn1 = (Button) this.findViewById(R.id.btn1);
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                HttpMethod.requestBSPayQueryHisAddList(new NoProgressSubscriber<BResponse>(new SubscriberOnNextListener() {
                    @Override
                    public void onNext(Object o) {

                    }
                }));
            }
        });

    }
}
