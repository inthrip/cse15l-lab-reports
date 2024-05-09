# Lab Report 3 - Bugs and Commands
Derrick Burton

## Part 1: Bugs
1. Failure inducing input:
  ~~~
  @Test
  public void testAverageWithoutLowestBugged(){
    double[] toTest = {6.0,4.0,4.0};
    double expected = 5.0;
    double actual = ArrayExamples.averageWithoutLowest(toTest);
    assertEquals(expected, actual, 0.01);
  }
~~~
2. Input without failure:
~~~
@Test
  public void testAverageWithoutLowestWorks(){
    double[] toTest = {9.0,7.0,5.0,3.0};
    double expected = 7.0;
    double actual =  ArrayExamples.averageWithoutLowest(toTest);
    assertEquals(expected, actual, 0.01);
  }
~~~
3. 

  
