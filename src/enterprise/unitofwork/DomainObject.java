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

    protected void markNew() {
        UnitOfWork.getCurrent().registerNew(this);
    }
    protected void markClean() {
        UnitOfWork.getCurrent().registerClean(this);
    }
    protected void markDirty() {
        UnitOfWork.getCurrent().registerDirty(this);
    }
    protected void markRemoved() {
        UnitOfWork.getCurrent().registerRemoved(this);
    }
}
