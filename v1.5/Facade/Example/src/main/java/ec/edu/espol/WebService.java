package ec.edu.espol;

/**
 * WebService
 */
public class WebService implements Service{

    public WebService(){ }

    @Override
    public boolean transaction(TransactionFacade tFacade) {
        return tFacade.makeTransaction();
    }

}
