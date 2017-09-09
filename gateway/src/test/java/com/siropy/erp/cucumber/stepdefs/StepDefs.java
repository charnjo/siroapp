package com.siropy.erp.cucumber.stepdefs;

import com.siropy.erp.SiroappApp;

import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.test.web.servlet.ResultActions;

import org.springframework.boot.test.context.SpringBootTest;

@WebAppConfiguration
@SpringBootTest
@ContextConfiguration(classes = SiroappApp.class)
public abstract class StepDefs {

    protected ResultActions actions;

}
