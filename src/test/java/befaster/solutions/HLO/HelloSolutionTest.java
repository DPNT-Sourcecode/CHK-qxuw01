package befaster.solutions.HLO;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThat;

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
    assertThat(helloSolution.hello("World"), is("Hello, World!"));

  }

}