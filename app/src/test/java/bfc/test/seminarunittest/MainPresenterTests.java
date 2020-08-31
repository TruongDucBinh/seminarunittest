package bfc.test.seminarunittest;

import org.junit.Test;
import org.mockito.Mock;

import bfc.test.seminarunittest.models.Car;

import static org.mockito.Mockito.verify;

public class MainPresenterTests {

    @Mock
    private Car mCar;

    private MainPresenter mPresenter;

    @Test
    public void test_onClickButtonStartEngine_gasIsFull() {
        // Arrange
        mCar = new Car() {
            @Override
            public boolean hasGas() {
                return true;
            }

            @Override
            public void start() {
                // do nothing
            }

            @Override
            public void warning(String message) {
                // do nothing
            }
        };
        mPresenter = new MainPresenter(mCar);

        // Act
        mPresenter.onClickButtonStartEngine();
        // Assert
        verify(mCar).start();
    }

    @Test
    public void test_onClickButtonStartEngine_runOutOfGas() {
        // Arrange
        mCar = new Car() {
            @Override
            public boolean hasGas() {
                return false;
            }

            @Override
            public void start() {
                // do nothing
            }

            @Override
            public void warning(String message) {
                // do nothing
            }
        };
        mPresenter = new MainPresenter(mCar);
        // Act
        mPresenter.onClickButtonStartEngine();
        // Assert
        verify(mCar).warning("Out of gas");
    }
}
