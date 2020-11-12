package com.javafordev.lesson9.task2.objects;


import javax.xml.bind.annotation.*;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
        "participants"
})
@XmlRootElement(name = "Participants")
public class Participants {

    @XmlElement(name = "Participant")
    private List<Participant> participants;

    public Participants() {
    }

    public Participants(List<Participant> participants) {
        this.participants = participants;
    }


    public List<Participant> getParticipants() {
        return participants;
    }

    public void setParticipants(List<Participant> participants) {
        this.participants = participants;
    }

    @Override
    public String toString() {
        return "Participants{" +
                "participants=" + participants +
                '}';
    }
}
