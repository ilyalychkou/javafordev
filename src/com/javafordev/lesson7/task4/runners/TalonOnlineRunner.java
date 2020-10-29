package com.javafordev.lesson7.task4.runners;

import com.javafordev.lesson7.task4.objects.Doctor;
import com.javafordev.lesson7.task4.objects.Hospital;
import com.javafordev.lesson7.task4.objects.Speciality;
import com.javafordev.lesson7.task4.objects.Talon;
import com.javafordev.lesson7.task4.utils.CommandLineUtils;
import com.javafordev.lesson7.task4.utils.TalonUtils;
import com.javafordev.lesson7.task4.objects.UserRequest;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Создать иерархию классов для заказа талонов к врачу онлаин - классы: Hospital, Doctor, Talon.
 *
 * 2. Все 3 класса должны быть унаследованы от абстрактного класса Entity,
 *    в котором есть только 1 метод public abstract String getName().
 * 3. После запуска программы, пользователю показывается список госпиталеи (минимум 2 госпиталя, заполнить по желанию)
 * 4. Пользователь выбирает госпиталь
 * 5. Показывается список докторов (Doctor), принадлежащих выбранному госпиталю
 * 6. Пользователь выбирает доктора.
 * 7. Создается объект Talon, в котором есть Hospital и Doctor и случаиное дата и время.
 * 8. Пользователю показываются данные созданного талона (Talon).
 */
public class TalonOnlineRunner {
    public static void main(String[] args) {

        List<Doctor> doctorsOfPolyclinicNumberOne = new ArrayList<>();
        doctorsOfPolyclinicNumberOne.add(new Doctor(1, "Шпак Алексей Викторович", Speciality.ANESTHETIST));
        doctorsOfPolyclinicNumberOne.add(new Doctor(2, "Ягужинская Анастасия Павловна", Speciality.TRAUMATOLOGIST));
        doctorsOfPolyclinicNumberOne.add(new Doctor(3, "Смирнов Андрей Валерьевич", Speciality.GYNECOLOGIST));
        doctorsOfPolyclinicNumberOne.add(new Doctor(4, "Працуто Михаил Павлович", Speciality.THERAPIST));


        List<Doctor> doctorsOfHospitalNumberNineteen = new ArrayList<>();
        doctorsOfHospitalNumberNineteen.add(new Doctor(1, "Мазуренок Иван Петрович", Speciality.ANESTHETIST));
        doctorsOfHospitalNumberNineteen.add(new Doctor(2, "Славная Елена Болеславовна", Speciality.THERAPIST));
        doctorsOfHospitalNumberNineteen.add(new Doctor(3, "Шевчук Екатерина Моисеевна", Speciality.GYNECOLOGIST));
        doctorsOfHospitalNumberNineteen.add(new Doctor(4, "Шварц Игорь Анатольевич", Speciality.CARDIOLOGIST));


        List<Doctor> doctorsOfMedicalCenter = new ArrayList<>();
        doctorsOfMedicalCenter.add(new Doctor(1, "Иванов Иван Иванович", Speciality.THERAPIST));
        doctorsOfMedicalCenter.add(new Doctor(2, "Красовская Наталья Викторовна", Speciality.CARDIOLOGIST));
        doctorsOfMedicalCenter.add(new Doctor(3, "Петров Петр Петрович", Speciality.TRAUMATOLOGIST));
        doctorsOfMedicalCenter.add(new Doctor(4, "Ильин Илья Ильч", Speciality.TRAUMATOLOGIST));

        List<Hospital> hospitals = new ArrayList<>();
        hospitals.add(new Hospital(1, "Больница № 19", doctorsOfHospitalNumberNineteen));
        hospitals.add(new Hospital(2, "Медцентр Нордин", doctorsOfMedicalCenter));
        hospitals.add(new Hospital(3, "Поликлиника № 1", doctorsOfPolyclinicNumberOne));

        System.out.println("Приложение по заказу талонов к врачу через командную строку v1.0...");

        UserRequest userRequest = CommandLineUtils.requestDataAndInputDataFromCommandLine(hospitals);
        Talon talon = CommandLineUtils.createTalon(userRequest, hospitals);
        CommandLineUtils.printTalonInfo(talon, hospitals);
        System.out.println();

        System.out.println("Проверка работы переопреденного метода getName в классах Hospital, Doctor, Talon");
        Doctor doctor = new Doctor(1, "Шпак Алексей Викторович", Speciality.ANESTHETIST);
        System.out.println(doctor.getName());

        Hospital hospital = new Hospital(5, "Грязелечебница МЧС", doctorsOfHospitalNumberNineteen);
        System.out.println(hospital.getName());

        Talon newTalon = new Talon(TalonUtils.generateRandomId(), hospital.getId(), doctor.getId(), TalonUtils.generateRandomDate());
        System.out.println(newTalon.getName());

    }
}
