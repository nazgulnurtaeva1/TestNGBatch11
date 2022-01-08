package class01;

import org.testng.annotations.Test;

public class HWClass01 {
    @Test
    public void Method1() {
        System.out.println("I am first Method but I will be executed SECOND!");
    }

    @Test
    public void NMethod2() {
        System.out.println("I am second Method but will be executed third");
    }
    @Test
    public void LMethod3() {
        System.out.println("I am a third Method but will execute first!");
    }
}
