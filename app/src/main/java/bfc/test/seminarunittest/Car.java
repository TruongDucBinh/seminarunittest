package bfc.test.seminarunittest;

import android.content.Context;
import android.widget.Toast;

import java.util.Random;

import androidx.annotation.NonNull;

import static androidx.core.util.Preconditions.checkNotNull;

public class Car {

    private @NonNull Context mContext;

    public Car(@NonNull Context context) {
        mContext = checkNotNull(context, "Context cannot be null");
    }

    public boolean hasGas() {
        Random random = new Random();
        int randomValue = random.nextInt(10);
        return randomValue % 2 == 0;
    }

    public void start() {
        Toast.makeText(mContext, "Start", Toast.LENGTH_SHORT).show();
    }

    public void warning(String message) {
        Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
    }
}
