/*
 * Copyright (c) 2016.
 */

package edu.iis.mto.bdd.trains.cucumber.steps;

import cucumber.api.PendingException;
import cucumber.api.java.pl.Gdy;
import cucumber.api.java.pl.I;
import cucumber.api.java.pl.Wtedy;
import cucumber.api.java.pl.Zakładając;


public class EstimateSteps {
    @Zakładając("^, że chcę się dostać z \"([^\"]*)\" do \"([^\"]*)\"$")
    public void givenTrainFromTo(String from, String to) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @I("^następny pociąg odjeżdża o (\\d+):(\\d+) na linii \"([^\"]*)\"$")
    public void nextTrainLeavesOn(int startTimeHours, int startTimeMinutes, String line) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Gdy("^zapytam o godzinę przyjazdu$")
    public void askForArrivingTime() throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }

    @Wtedy("^powinienem uzyskać następujący szacowany czas przyjazdu: (\\d+):(\\d+)$")
    public void shouldGetNextEstimatedArrivingTime(int timeHours, int timeMinutes) throws Throwable {
        // Write code here that turns the phrase above into concrete actions
        throw new PendingException();
    }
}
