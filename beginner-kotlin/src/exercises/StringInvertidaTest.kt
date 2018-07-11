package exercises

import org.junit.Assert
import org.junit.Test

class StringInvertidaTest{

    @Test
    fun reverseUsingSB(){
        Assert.assertEquals("bs niltok etset",reverseUsingSB("teste kotlin sb"))
    }

    @Test
    fun reverseUsingLoop(){
        Assert.assertEquals("pool niltok",reverseUsingLoop("kotlin loop"))
    }

}