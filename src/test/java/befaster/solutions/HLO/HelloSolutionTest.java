package befaster.solutions.HLO;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class HelloSolutionTest {
  private HelloSolution helloSolution;

  @Before
  public void setUp(){
    helloSolution = new HelloSolution();
  }

  @Test
  public void testHello(){
    assertEquals(helloSolution.hello("world"), "Hello world!" );

  }

}
