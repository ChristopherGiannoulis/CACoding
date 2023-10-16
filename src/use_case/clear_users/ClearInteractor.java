package use_case.clear_users;

// TODO Complete me

import use_case.signup.SignupUserDataAccessInterface;

public class ClearInteractor implements ClearInputBoundary{

    final SignupUserDataAccessInterface userDataAccessObject;
    final ClearOutputBoundary userPresenter;

    public ClearInteractor(SignupUserDataAccessInterface userDataAccessObject, ClearOutputBoundary userPresenter) {
        this.userDataAccessObject = userDataAccessObject;
        this.userPresenter = userPresenter;
    }

    @Override
    public void execute(boolean hm) {
        String s = userDataAccessObject.clear();
        ClearOutputData easy = new ClearOutputData(s);
        userPresenter.prepareSuccessView(easy);

    }

}
