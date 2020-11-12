package com.javafordev.lesson9.task2.runner;

import com.javafordev.lesson9.task2.objects.Participant;
import com.javafordev.lesson9.task2.objects.Participants;
import com.javafordev.lesson9.task2.services.RegistrationService;
import com.javafordev.lesson9.task2.util.RegistrationUtil;

import javax.xml.bind.JAXBException;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class RegistrationRunner {

    public static void main(String[] args) throws JAXBException, FileNotFoundException {

        List<Participant> participantList = new ArrayList<>();
        Participants participants = new Participants(participantList);
        RegistrationService registrationService = new RegistrationService(participants);
        //сегодня
//        Participant participantOne = RegistrationUtil.inputDataForParticipant();
//        Participant participantTwo = RegistrationUtil.inputDataForParticipant();
//        registrationService.registerParticipant(participantOne);
//        int count = registrationService.registerParticipant(participantTwo);
//        System.out.println("Текущее количество участников фестиваля: " + count);
//        registrationService.saveParticipantsToXMLFile();
//        registrationService.printParticipantsList();

        //на следующий день
        registrationService.readParticipantsFromFile();
        System.out.println("Количество участников после считывания из файла :" + registrationService.calculateExistingParticipants());
        Participant participantThree = RegistrationUtil.inputDataForParticipant();
        int countAfterAdding = registrationService.registerParticipant(participantThree);
        System.out.println("Количество после добавления нового участника: " + countAfterAdding);
        registrationService.saveParticipantsToXMLFile();
        registrationService.printParticipantsList();
    }
}
