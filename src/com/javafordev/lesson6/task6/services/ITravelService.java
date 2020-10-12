package com.javafordev.lesson6.task6.services;

import com.javafordev.lesson6.task6.objects.travel.options.Nutrition;
import com.javafordev.lesson6.task6.objects.travel.options.Transport;
import com.javafordev.lesson6.task6.objects.travel.vouchers.TravelVoucher;

import java.util.List;


/**
 суперкласс TravelVoucherOption
 имя
 стоимость
 количество туристов
 подкласс Transport
 дни выезда (отправления)
 > AirTransport
 >>Plane
 номер реиса
 тип самолета
 тип салона
 >>AirBalloon
 тип шара
 тип корзины
 вместительность корзины
 > WaterTransport
 >>Ship
 тип судна
 номер палубы
 >>Kayak
 тип баидарки
 материал баидарки
 количество мест
 > LandTransport
 >>Bus
 марка автобуса
 этажность автобуса
 >>Train
 тип вагона
 >>Bike
 тип велосипеда
 подкласс TravelType
 длительность
 страна пребывания
 >Recreation
 расстояние до пляжа
 >Excursion
 тема экскурсии
 тип обьекта
 >Treatment
 тип лечебного заведения
 вид процедуры
 >Shopping
 список магазинов
 вид товаров
 >Cruise
 тип круиза
 регион круиза
 подкласс Nutrition
 тип питания
 вид кухни

 */

/**
 * Доп задание на интерфейс / абстрактный класс:
 * Создать консольное приложение, удовлетворяющее следующим требованиям:
 * • Использовать возможности ООП: классы, наследование, полиморфизм, инкапсуляция.
 * • Каждый класс должен иметь отражающее смысл название и информативный состав.
 * • Наследование должно применяться только тогда, когда это имеет смысл.
 * • При кодировании должны быть использованы соглашения об оформлении кода java code convention.
 * • Классы должны быть грамотно разложены по пакетам.
 * • Консольное меню должно быть минимальным.
 * • Для хранения параметров инициализации можно использовать файлы.
 * <p>
 * Туристические путевки.
 * 1) Сформировать набор предложений клиенту по выбору туристической путевки различного типа (отдых, экскурсии, лечение, шопинг, круиз и т. д.) для оптимального выбора.
 * 2) Учитывать возможность выбора транспорта, питания и числа дней.
 * 3) Реализовать выбор и сортировку путевок.
 */

public interface ITravelService<T> {

    List<TravelVoucher> findAllByTransport(Transport transport);

    List<TravelVoucher> findAllByNutrition(Nutrition nutrition);

    List<TravelVoucher> findAllByDuration(int duration);

    List<TravelVoucher> findAllByPrice(double price);

    List<TravelVoucher> sortByDuration();

    List<TravelVoucher> sortByPrice();

}
