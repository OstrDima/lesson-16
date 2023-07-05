package ua.ostr_1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class Main {

	public static void main(String[] args) throws NoSuchMethodException, SecurityException, InstantiationException,
			IllegalAccessException, IllegalArgumentException, InvocationTargetException, NoSuchFieldException {
		Class commodity = Commodity.class;

		System.out.println("Ім'я класу: " + commodity.getName());
		System.out.println("Просте ім'я класу: " + commodity.getSimpleName());
		System.out.println("Модифікатор доступу класу: " + Modifier.toString(commodity.getModifiers()));
		System.out.println("Пакет поточного класу: " + commodity.getPackage());
		System.out.println("Суперклас: " + commodity.getSuperclass());
		System.out.println();

		System.out.println("Клас " + commodity.getSimpleName() + " має такий набір полів: ");
		Field[] commodityFields = commodity.getDeclaredFields();
		for (Field field : commodityFields) {
			System.out.println("Поле " + field);
		}
		System.out.println(
				"Загальна кількість усіх полів класу " + commodity.getSimpleName() + " - " + commodityFields.length);
		System.out.println();

		System.out.println("Клас " + commodity.getSimpleName() + " має такий набір public полів: ");
		Field[] commodityPublicFields = commodity.getFields();
		for (Field field : commodityPublicFields) {
			System.out.println("Поле " + field);
		}
		System.out.println("Загальна кількість public полів класу " + commodity.getSimpleName() + " - "
				+ commodityPublicFields.length);
		System.out.println();

		System.out.println("Класс " + commodity.getSimpleName() + " має такий набір конструкторів: ");
		Constructor[] commodityConstructors = commodity.getConstructors();
		for (Constructor constructor : commodityConstructors) {
			System.out.println("Конструктор " + constructor);
		}
		System.out.println("Загальна кількість конструкторів класу " + commodity.getSimpleName() + " - "
				+ commodityConstructors.length);
		System.out.println();

		System.out.println("Клас " + commodity.getSimpleName() + " має такий набір методів: ");
		Method[] commodityMethods = commodity.getMethods();
		for (Method method : commodityMethods) {
			System.out.println("Метод " + method);
		}
		System.out.println(
				"Загальна кількість методів класу " + commodity.getSimpleName() + " - " + commodityMethods.length);
		System.out.println();

	}

}
