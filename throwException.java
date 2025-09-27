public class throwException {
    public void validate(int n) throws Exception {
        if (n >= 1 && n <= 10) {
            System.out.println(n + " is not a valid value");
        } else {
            throw new Exception(n + " is not valid value");
        }
    }

    public static void main(String[] args) {
        throwException obj = new throwException();

        try {
            obj.validate(85);
        } catch (Exception e) {
            System.out.println("Exception Message = " + e.getMessage());
        }
    }
}
