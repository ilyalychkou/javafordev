package com.javafordev.lesson7.task4.objects;

public class Doctor extends Entity {

    private String name;
    private Speciality speciality;

    public Doctor(int id, String name, Speciality speciality) {
        super(id);
        this.name = name;
        this.speciality = speciality;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Doctor doctor = (Doctor) o;

        if (name != null ? !name.equals(doctor.name) : doctor.name != null) return false;
        return speciality == doctor.speciality;
    }

    @Override
    public String toString() {
        return "Doctor{" +
                "name='" + name + '\'' +
                ", doctorSpeciality=" + speciality +
                '}';
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (speciality != null ? speciality.hashCode() : 0);
        return result;
    }

    public Speciality getSpeciality() {
        return speciality;
    }

    public void setSpeciality(Speciality speciality) {
        this.speciality = speciality;
    }

    @Override
    public String getName() {
        return name;
    }
}
