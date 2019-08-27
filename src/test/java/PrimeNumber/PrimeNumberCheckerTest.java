package PrimeNumber;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameters;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class PrimeNumberCheckerTest {
    private Integer inputNumber;
    private Boolean expectedResult;
    private PrimeNumberChecker primeNumberChecker;

   @Before
   public void initialize(){
       primeNumberChecker = new PrimeNumberChecker();
   }

    public PrimeNumberCheckerTest( Integer number,Boolean expectedResult){
        this.inputNumber = number;
        this.expectedResult = expectedResult;

    }

    @Parameterized.Parameters
    public static Collection primeNumbers(){
       return Arrays.asList(new Object[][] {
               {6, false},
               {2, true},
               {19, false},
               {22, false},
               {23, true}
       });
   }


   @Test
    public void testPrimeNumber(){
       System.out.println("Parameterized Number is : " + inputNumber);
       assertEquals(expectedResult,
               primeNumberChecker.validate(inputNumber));
   }

}