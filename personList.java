public class personList {
    String[] person = new String[]{"ali", "jawad", "ahmed ","Zain", "sohail"};

    public String checkName() {
        String temp = null;
        for (int i = 0; i < person.length; i++) {
            if (person[i] == "zain" || person[i] == "Zain") {
                temp = person[i];
            }
        }
        return "Name you are looking for is " + temp;
    }

    public static void main(String[] args) {
      personList obj = new personList();
      System.out.println(obj.checkName());
    }
}
