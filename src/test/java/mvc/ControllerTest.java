package mvc;

import org.junit.Test;
import org.springframework.ui.ModelMap;

import static org.hamcrest.CoreMatchers.is;
import static org.junit.Assert.assertThat;

public class ControllerTest {

	@Test
	public void shouldReturnRightViewAndModel() throws Exception {
		ModelMap model = new ModelMap();
		String returnView = new HelloController().printWelcome(model);

		assertThat(returnView, is("hello"));
		assertThat(model.get("message").toString(), is("Hello world!"));

	}
}
