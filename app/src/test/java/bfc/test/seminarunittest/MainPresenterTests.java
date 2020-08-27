package bfc.test.seminarunittest;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;

public class MainPresenterTests {

    @Mock
    private Car mCar;

    private MainPresenter mPresenter;

    @Before
    public void setup() {
        // Mockito has a very convenient way to inject mocks by using the @Mock annotation. To
        // inject the mocks in the test the initMocks method needs to be called.
        MockitoAnnotations.initMocks(this);

        mPresenter = new MainPresenter(mCar);
    }

    @Test
    public void test_onClickButtonStartEngine_gasIsFull() {
        // Arrange
        when(mCar.hasGas()).thenReturn(true);
        // Act
        mPresenter.onClickButtonStartEngine();
        // Assert
        verify(mCar).start();
    }

    @Test
    public void test_onClickButtonStartEngine_runOutOfGas() {
        // Arrange
        when(mCar.hasGas()).thenReturn(false);
        // Act
        mPresenter.onClickButtonStartEngine();
        // Assert
        verify(mCar).warning("Out of gas");
    }
}
