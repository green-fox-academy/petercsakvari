package com.greenfoxacademy.restv2.controllers;

import com.greenfoxacademy.restv2.Restv2Application;
import com.greenfoxacademy.restv2.models.ErrorMessage;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

import java.nio.charset.Charset;

import static org.hamcrest.core.Is.is;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.webAppContextSetup;


@RunWith(SpringRunner.class)
@SpringBootTest(classes = Restv2Application.class)
@WebAppConfiguration
@EnableWebMvc
public class GuardianControllerTest {
  private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
          MediaType.APPLICATION_JSON.getSubtype(),
          Charset.forName("utf8"));

  private MockMvc mockMvc;

  @Autowired
  private WebApplicationContext webApplicationContext;

  @Before
  public void setup() throws Exception {
    this.mockMvc = webAppContextSetup(webApplicationContext).build();
  }

  @Test
  public void contextLoads() throws Exception {
  }

  @Test
  public void translateToGrootWithParamTest() throws Exception {
    String testMessage = "somemessage";
    mockMvc.perform(get("/groot")
            .param("message", testMessage))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.received", is(testMessage)))
            .andExpect(jsonPath("$.translated", is("I am Groot!")));
  }

  @Test
  public void translateToGrootErrorTest() throws Exception {
    mockMvc.perform(get("/groot"))
            .andExpect(status().isBadRequest())
            .andExpect(jsonPath("$.error", is("I am Groot!")));
  }
}