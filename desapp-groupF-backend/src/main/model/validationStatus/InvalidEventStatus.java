package model.validationStatus;

import model.Party;
import model.User;
import model.exceptions.DeadlineToConfirmAttendanceHasPassed;


public class InvalidEventStatus implements ValidationStatus {

    public boolean isValid(Party party) {
        return false;
    }

    public boolean isInvalid(Party party){
        return true;
    }

    public void acceptAttendee(User person, Party party) {
        throw new DeadlineToConfirmAttendanceHasPassed("Deadline to confirm attendance has already passed.");
    }
}


