public class Main {
    public static void main(String[] args) {

        Assistant assistant = new Assistant("Mehmet", "4442121", "mehmet@mehmet.com",
                "CENG", "Professor", "13.00-15.30");

        LabAssistant labAssistant = new LabAssistant("Maria", "4442135", "maria@maria.com",
                "CENG", "Associate Professor", "14.00-16.00");

        Prelector prelector = new Prelector("Tesla", "4442100", "tesla@tesla.com",
                "CENG", "Prelector", 21);

        Computing computing = new Computing("Darwin", "4442121", "darvin@darvin.com",
                "CENG", "Twice a week", "Computing");

        SecurityGuard securityGuard = new SecurityGuard("Einstein", "4442189", "einstein@einstein.com",
                "CENG", "Three days a week", "Entry and exit documents");

        assistant.attendClass("11.00-14.00.");
        labAssistant.attendClass("13.00-15.00");
        prelector.attendClass("09.00-16.00");

        assistant.getInfo();
        labAssistant.getInfo();
        prelector.getInfo();
        computing.getInfo();
        securityGuard.getInfo();
    }
}