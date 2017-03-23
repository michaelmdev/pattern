package gof.creational.abstractfactory;

import gof.creational.abstractfactory.citilink.CitilinkExchangeFactory;
import org.reflections.Reflections;

import java.util.Set;

/**
 * @author michael.malevannyy@gmail.com, 24.03.2017
 *         <p>
 *         Фабричный метод, порождаем объект конкретного класса на основе внешенй информации
 */

public class Fabric {
    private static Fabric instance = new Fabric();

    public static Fabric getInstance() {
        return instance;
    }

    // в данной реализации используем конмтанты, но можно использовать конфигурационные файлы
    // и например искать класс в classpath или создавть класс по имени
    // и т.п.
    public static final String citilink = "Citilink";
    public static final String ulmart = "Ulmart";


    public ExchangeFactory createFactory(String name) throws IllegalAccessException, InstantiationException {


        switch (name) {
            case citilink:
                // вариант с зависимостью
                return new CitilinkExchangeFactory();
            default:
                // вариант с интроспекцией
                Package aPackage = Fabric.class.getPackage();
                Reflections reflections = new Reflections(aPackage);
                Set<Class<? extends ExchangeFactory>> typesOf = reflections.getSubTypesOf(ExchangeFactory.class);

                for (Class<? extends ExchangeFactory> aClass : typesOf) {
                    if (aClass.getSimpleName().contains(ulmart)) {
                        return aClass.newInstance();
                    }
                }
        }

        return null;

    }
}
