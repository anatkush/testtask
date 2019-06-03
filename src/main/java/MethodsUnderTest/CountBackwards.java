package MethodsUnderTest;

public class CountBackwards {
    public void counterBackwards(){
        for(int i = 100; i >0; i--){
            if( i % 5 == 0 && i % 3 == 0){
                System.out.println(i + "::" + "Testing");
            }else if(i % 5 == 0 ){
                System.out.println(i + "::" + "Agile");
            }else if(i % 3 == 0 ){
                System.out.println(i + "::" + "Software");
            }else{
                System.out.println(i);
            }
        }
    }
}
