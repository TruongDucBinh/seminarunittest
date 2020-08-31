package bfc.test.seminarunittest;

import androidx.appcompat.app.AppCompatActivity;
import bfc.test.seminarunittest.models.Car;
import bfc.test.seminarunittest.models.CarImpl;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private MainPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Car car = new CarImpl(this);
        mPresenter = new MainPresenter(car);

        findViewById(R.id.startEngineButton).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mPresenter.onClickButtonStartEngine();
            }
        });
    }

}
