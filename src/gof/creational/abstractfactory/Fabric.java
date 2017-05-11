package gof.creational.abstractfactory;

import gof.creational.abstractfactory.citilink.CitilinkExchangeFactory;
import org.reflections.Reflections;

import java.util.Set;

/**
 * @author michael.malevannyy@gmail.com, 24.03.2017
 *
 *    Фабричный метод, порождаем объект конкретного класса на основе внешенй информации
 *    особенности реализации
 *    1) можем дернуть конкретный класс через жосткую связь
 *    2) можем использовать интроспекцию (рефлекшн)
 *    3) можем импользовать бины (в преедлах контейнера) - здесь не показано
 */

public class Fabric {
    public static final String SUPPLIER_ONE = "Citilink";
    public static final String SUPPLIER_TWO = "Ulmart";

    // создать объект реализующий известный клиенту интерфейс на основе внешней информации, как именнно - это уже детали реализации
    public ExchangeFactory createFactory(String name) throws IllegalAccessException, InstantiationException {
        switch (name) {
            case SUPPLIER_ONE:
                // 1) вариант - с жёсткой зависимостью
                return new CitilinkExchangeFactory();
            default:
                // 2) вариант - с интроспекцией
                Package aPackage = Fabric.class.getPackage();
                Reflections reflections = new Reflections(aPackage);
                Set<Class<? extends ExchangeFactory>> typesOf = reflections.getSubTypesOf(ExchangeFactory.class);
                for (Class<? extends ExchangeFactory> aClass : typesOf) {
                    if (aClass.getSimpleName().contains(SUPPLIER_TWO)) {
                        return aClass.newInstance();
                    }
                }
        }
        return null;
    }

    private static Fabric instance = new Fabric();

    public static Fabric getInstance() {
        return instance;
    }

    private Fabric(){}
}
