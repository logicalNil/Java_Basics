class F_Lname {

    static void printInitials(String name) {
        String firstName = "nilay";
        String lastName = "ranjan";
    }

    public static String main(String[] args) {
        String firstName = "nilay";
        String lastName = "ranjan";
        String username = firstName.substring(0, 1).toLowerCase() + lastName.toLowerCase();
        return username;
    }
}