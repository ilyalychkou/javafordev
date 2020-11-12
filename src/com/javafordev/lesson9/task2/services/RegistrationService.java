package com.javafordev.lesson9.task2.services;

import com.javafordev.lesson9.task2.objects.Participant;
import com.javafordev.lesson9.task2.objects.Participants;
import com.javafordev.lesson9.task2.util.RegistrationUtil;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.xml.DOMConfigurator;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.util.Scanner;

public class RegistrationService {

    static {
        new DOMConfigurator().doConfigure("/Users/Admin/Documents/javafordev/log4j.xml", LogManager.getLoggerRepository());
    }

    final static Logger logger = Logger.getLogger(RegistrationUtil.class);

    private Participants participants;

    public RegistrationService(Participants participants) {
        this.participants = participants;
    }

    public Participants getParticipants() {
        return participants;
    }

    public void setParticipants(Participants participants) {
        this.participants = participants;
    }

    public int registerParticipant(Participant participant) {
        Participants currentParticipantList = this.getParticipants();
        currentParticipantList.getParticipants().add(participant);
        logger.info("учасник " + participant.getName() + " успешно зарегистрирован!");
        return currentParticipantList.getParticipants().size();
    }

    public void saveParticipantsToXMLFile() {

        System.out.print("Сохранить список участников в файл?");
        Scanner scan = new Scanner(System.in);
        scan.useDelimiter(" ");
        String answer = scan.nextLine().trim();
        if (answer.equalsIgnoreCase("да")) {
            String pathToXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task2/data/participants.xml";
            try {
                JAXBContext context = JAXBContext.newInstance(Participants.class);
                Marshaller m = context.createMarshaller();
                m.marshal(this.participants, new FileOutputStream(pathToXML));
            } catch (JAXBException | FileNotFoundException exception) {
                logger.error("error occurred " + exception.getMessage());
            }
            logger.info("Список участников успешно сохранен в файл " + pathToXML);
        } else {
            logger.info("Список участников не был сохранен в файл");
        }

    }

    public void printParticipantsList() {
        for (Participant participant : this.participants.getParticipants()) {
            System.out.println(participant);
        }
    }


    public Participants readParticipantsFromFile() throws JAXBException, FileNotFoundException {

        String pathToXML = "/Users/Admin/Documents/javafordev/src/com/javafordev/lesson9/task2/data/participants.xml";
        JAXBContext jc = JAXBContext.newInstance(Participants.class);
        Unmarshaller u = jc.createUnmarshaller();
        FileReader reader = new FileReader(pathToXML);
        this.setParticipants((Participants) u.unmarshal(reader));
        return this.participants;
    }

    public int calculateExistingParticipants() {
        return this.getParticipants().getParticipants().size();
    }

}
