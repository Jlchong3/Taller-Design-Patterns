package ec.edu.espol;

/**
 * MobileService
 */
public class MobileService implements Service {

    public MobileService(){ }

    @Override
    public boolean transaction(TransactionFacade tFacade) {
        return tFacade.makeTransaction();
    }

}
