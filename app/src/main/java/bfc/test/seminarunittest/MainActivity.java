package bfc.test.seminarunittest;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {
    private Car mCar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mCar = new Car(this);

        findViewById(R.id.startEngineButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                onClickButtonStartEngine();
            }
        });
    }

    public void onClickButtonStartEngine() {
        if (mCar.hasGas()) {
            mCar.start();
        } else {
            mCar.warning("Out of gas");
        }
    }
}
