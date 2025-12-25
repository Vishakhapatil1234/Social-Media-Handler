package social_media.social_media_handler.dto;

public class LoginResponse {

    private String message;
    private String email;

    public LoginResponse(String message, String email) {
        this.message = message;
        this.email = email;
    }

    public String getMessage() {
        return message;
    }

    public String getEmail() {
        return email;
    }
}
