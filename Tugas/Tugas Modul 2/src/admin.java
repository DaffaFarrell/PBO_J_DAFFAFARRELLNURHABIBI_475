public class admin{
    public static class Admin {
        String username = "admin475";
        String password = "password475";

        public boolean login(String inputUsername, String inputPassword) {
            return inputUsername.equals(username) && inputPassword.equals(password);
        }
    }
}
