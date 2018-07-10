package com.example.greenfoxacademy.restpractice;

import com.example.greenfoxacademy.restpractice.Controller.RestController;
import com.example.greenfoxacademy.restpractice.Model.Append;
import com.example.greenfoxacademy.restpractice.Service.AppendService;
import com.example.greenfoxacademy.restpractice.Service.DoUntilService;
import com.example.greenfoxacademy.restpractice.Service.NumberService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.TestExecutionListeners;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(RestController.class)
public class RestControllerTest {

  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  @Autowired
  private MockMvc mockMvc;

  @MockBean
  private AppendService appendService;

  @MockBean
  private DoUntilService doUntilService;

  @MockBean
  private NumberService numberService;

  @Test
  public void doubling_Succesfull() throws Exception{
    mockMvc.perform(get("/doubling?input=5")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.result", is(10)));
  }

  @Test
  public void doubling_Missing_Input() throws Exception{
    mockMvc.perform(get("/doubling?input=")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide an input!")));
  }

  @Test
  public void greeter_SuccessFul() throws Exception{
    mockMvc.perform(get("/greeter?name=Petike&title=Student")
             .contentType(MediaType.APPLICATION_JSON))
             .andExpect(status().isOk())
             .andExpect(content().contentType(contentType))
             .andExpect(jsonPath("$.welcome_message", is("Oh, hi there Petike, my dear Student!")));
  }
  @Test
  public void greeter_Missing_Name() throws Exception{
    mockMvc.perform(get("/greeter?title=Student")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide a name!")));
  }

  @Test
  public void greeter_Missing_Title() throws Exception{
    mockMvc.perform(get("/greeter?name=Petike")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.error", is("Please provide a title!")));
  }
  @Test
  public void appender_Success() throws Exception{
    when(appendService.appender(any())).thenReturn(new Append("kutya"));
    mockMvc.perform(get("/appenda/kuty")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isOk())
            .andExpect(content().contentType(contentType))
            .andExpect(jsonPath("$.appended", is("kutya")));
  }
  @Test
  public void appender_Missing_Argument() throws Exception{
    mockMvc.perform(get("/appenda/")
            .contentType(MediaType.APPLICATION_JSON))
            .andExpect(status().isNotFound());
  }
}
