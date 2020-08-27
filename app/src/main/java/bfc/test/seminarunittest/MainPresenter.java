package bfc.test.seminarunittest;

public class MainPresenter {
    private Car mCar;

    public MainPresenter(Car car) {
        mCar = car;
    }

    public void onClickButtonStartEngine() {
        if (mCar.hasGas()) {
            mCar.start();
        } else {
            mCar.warning("Out of gas");
        }
    }
}
