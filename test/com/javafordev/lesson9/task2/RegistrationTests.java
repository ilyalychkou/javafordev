package com.javafordev.lesson9.task2;

import com.javafordev.lesson9.task2.objects.Participant;
import com.javafordev.lesson9.task2.objects.Participants;
import com.javafordev.lesson9.task2.services.RegistrationService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

@RunWith(JUnit4.class)
public class RegistrationTests {

    @Test
    public void testCountOfExistingParticipants() throws JAXBException, FileNotFoundException {

        int expectedCount = 3;
        List<Participant> participantList = new ArrayList<>();
        Participants participants = new Participants(participantList);
        RegistrationService registrationService = new RegistrationService(participants);
        registrationService.readParticipantsFromFile();
        int actualCount = registrationService.calculateExistingParticipants();

        Assert.assertEquals("Количество участников в файле XML не соответствует ожидаемому", expectedCount, actualCount);
    }

}
