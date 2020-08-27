package bfc.test.seminarunittest;

import android.content.Context;
import android.widget.Toast;

import java.util.Random;

class Car {

    private Context mContext;

    public Car(Context context) {
        mContext = context;
    }

    boolean hasGas() {
        Random random = new Random();
        int randomValue = random.nextInt(10);
        return randomValue % 2 == 0;
    }

    void start() {
        Toast.makeText(mContext, "Start", Toast.LENGTH_SHORT).show();
    }

    void warning(String message) {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }
}
