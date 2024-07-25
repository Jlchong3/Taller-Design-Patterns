package ec.edu.espol;

/**
 * TelephoneService
 */
public class TelephoneService implements Service {

    public TelephoneService() { }

    @Override
    public boolean transaction(TransactionFacade tFacade) {
        return tFacade.makeTransaction();
    }

}
