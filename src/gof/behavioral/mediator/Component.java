package gof.behavioral.mediator;

// общий интерфейс компонентов (клоллег) взаимодействием которых занимается медиатор
public interface Component {
    void setMediator(Mediator mediator);
}
