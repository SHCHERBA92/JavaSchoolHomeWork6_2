import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.lang.annotation.Documented;
import java.util.ArrayList;
import java.util.Iterator;

public class test {
    //@DisplayName("Test MyStringClass.MySum")
    @Test
    public  void test(){
        Assertions.assertEquals(4,new MyStringClass().MySum(2,2),"Миша, Всё х*йня, давай оп новой");

    }
    @Test
    public void EqTest()
    {
        String source = "Hello";
        String dest = "Hello";
        MyStringClass myStringClass = new MyStringClass();
        Assertions.assertTrue(myStringClass.Eq(source,dest));
        Assertions.assertFalse(myStringClass.Eq("",dest));
        //Assertions.assertNotNull(myStringClass.Eq(null,null));
    }


    /**
     *  Тестирование моего итератор, который итеррирует список только тех обьектов, которые начинаются с буквы "А"
     * */
    @Test
    public void myIteratorTest()
    {
        int count = 0;
        MyList<String> stringsSource = new MyList<String>(new String[]{"hello","Alert","Assembler","Mouse"});
        String[] resArr = {null,"Alert","Assembler",null};
        ArrayList<String> strings = new ArrayList<>(4);

        /*
        * Хот у меня и Юпитер, но я попытался раелизовать тест итератора без
        * метода assertIterable();
        * */

        Iterator iterator = stringsSource.iterator();
        while (iterator.hasNext())
        {
            Assertions.assertEquals(resArr[count],iterator.next());
            count++;
        }


    }
}
