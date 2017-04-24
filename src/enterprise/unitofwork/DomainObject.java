package enterprise.unitofwork;

/**
 * супертип слоя, базовый супертип объектов модели поддерживающий общеи для всех тиопв операции
 * например опреации с идентификатором
 */
public abstract class DomainObject {
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
}
