package a16team1.virtualwallet.models.dtos;

import a16team1.virtualwallet.utilities.FieldMatch;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import static a16team1.virtualwallet.utilities.Constants.INVALID_PASSWORD_LENGTH;
import static a16team1.virtualwallet.utilities.Constants.VALUE_CANNOT_BE_EMPTY;

@FieldMatch(first = "newPassword", second = "confirmNewPassword", message = "Passwords do not match")
public class ChangePasswordDto {

    private int userId;

    @NotEmpty(message = VALUE_CANNOT_BE_EMPTY)
    private String currentPassword;

    @NotEmpty(message = VALUE_CANNOT_BE_EMPTY)
    @Size(min = 6, max = 60, message = INVALID_PASSWORD_LENGTH)
    private String newPassword;

    @NotEmpty(message = VALUE_CANNOT_BE_EMPTY)
    private String confirmNewPassword;

    public ChangePasswordDto() {
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getCurrentPassword() {
        return currentPassword;
    }

    public void setCurrentPassword(String currentPassword) {
        this.currentPassword = currentPassword;
    }

    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    public String getConfirmNewPassword() {
        return confirmNewPassword;
    }

    public void setConfirmNewPassword(String confirmNewPassword) {
        this.confirmNewPassword = confirmNewPassword;
    }
}
