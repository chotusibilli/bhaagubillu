Skip to content
Search or jump to…

Pull requests
Issues
Marketplace
Explore
 
@chotusibilli 
buddy-works
/
simple-java-project
6
2106
 Code Issues 0 Pull requests 6 Actions Projects 0 Wiki Security Insights
simple-java-project/src/test/java/works/buddy/samples/WorksWithHerokuServletTest.java
 Kivlov84 simple java project
7b68101 on Jun 28, 2016
41 lines (31 sloc)  1.08 KB
  
package works.buddy.samples;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.ByteArrayOutputStream;
import java.io.PrintWriter;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.when;

public class WorksWithHerokuServletTest {

    private WorksWithHerokuServlet servlet;

    @Mock
    private HttpServletRequest request;

    @Mock
    private HttpServletResponse response;

    @Before
    public void setUp() throws Exception {
        MockitoAnnotations.initMocks(this);
        servlet = new WorksWithHerokuServlet();
    }

    @Test
    public void testDoGet() throws Exception {
        ByteArrayOutputStream out = new ByteArrayOutputStream();
        PrintWriter writer = new PrintWriter(out);
        when(response.getWriter()).thenReturn(writer);

        servlet.doGet(request, response);
        assertEquals("Buddy Works with Heroku", new String( out.toByteArray(), "UTF-8"));
    }
}
© 2020 GitHub, Inc.
Terms
Privacy
Security
Status
Help
Contact GitHub
Pricing
API
Training
Blog
About
