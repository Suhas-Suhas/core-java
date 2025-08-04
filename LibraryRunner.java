class LibraryRunner {
    public static void main(String[] args) {
        Library[] libraries = new Library[2];

        Library l1 = new Library();
        l1.setName("City Central Library");
        l1.setCity("Bangalore");
        libraries[0] = l1;
        Library l2 = new Library();
        l2.setName("Public Library");
        l2.setCity("Mangalore");
        libraries[1] = l2;

        for (int i = 0; i < libraries.length; i++) {
            System.out.println("Library " + (i + 1));
            System.out.println(libraries[i].getName());
            System.out.println(libraries[i].getCity());
            System.out.println();
        }
    }
}
