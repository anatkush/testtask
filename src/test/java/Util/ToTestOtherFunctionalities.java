package Util;

import MethodsUnderTest.CountBackwards;
import org.junit.Assert;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

public class ToTestOtherFunctionalities {

    CountBackwards classUnderTest = new CountBackwards();

    public void countBackwardsTest(){
        ByteArrayOutputStream output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        classUnderTest.counterBackwards();
        String [] initialArr = output.toString().split("\n");
        List<String> outPut = new ArrayList<String>();
        // I reverse my array for assertion
        for(int j = initialArr.length - 1; j >= 0; j--){
            outPut.add(initialArr[j]);
        }

        for(int i = 0; i < outPut.size(); i++){
            String value = outPut.get(i);
            if ((i + 1) % 3 == 0 && (i + 1) % 5 == 0){
                Assert.assertTrue(value.equalsIgnoreCase((i + 1) + "::" + "Testing"));
            }else if((i + 1) % 3 == 0){
                Assert.assertTrue(value.equalsIgnoreCase((i + 1) + "::Software"));
            }else if((i +1 ) % 5 == 0){
                Assert.assertTrue(value.equalsIgnoreCase((i + 1) + "::Agile"));
            }else{
                Assert.assertTrue(value.equalsIgnoreCase("" + (i + 1) ));
            }
        }
    }
}
