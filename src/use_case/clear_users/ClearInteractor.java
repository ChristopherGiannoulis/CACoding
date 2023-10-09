package use_case.clear_users;

// TODO Complete me

public class ClearInteractor implements ClearInputBoundary{

    final ClearUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(ClearUserDataAccessInterface userDataAccessObject, ClearOutputBoundary userPresenter) {
        this.userDataAccessObject = userDataAccessObject;
        this.userPresenter = userPresenter;
    }

    @Override
    public void execute(boolean hm) {
        userDataAccessObject.clear();
        ClearOutputData easy = new ClearOutputData();
        userPresenter.prepareSuccessView(easy);

    }

}
