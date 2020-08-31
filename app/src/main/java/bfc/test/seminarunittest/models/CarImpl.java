package bfc.test.seminarunittest.models;

import android.content.Context;
import android.widget.Toast;

import java.util.Random;

import androidx.annotation.NonNull;

import static androidx.core.util.Preconditions.checkNotNull;

public class CarImpl implements Car {

    private @NonNull Context mContext;

    public CarImpl(@NonNull Context context) {
        mContext = checkNotNull(context, "Context cannot be null");
    }

    @Override
    public boolean hasGas() {
        Random random = new Random();
        int randomValue = random.nextInt(10);
        return randomValue % 2 == 0;
    }

    @Override
    public void start() {
        Toast.makeText(mContext, "Start", Toast.LENGTH_SHORT).show();
    }

    @Override
    public void warning(String message) {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }
}
