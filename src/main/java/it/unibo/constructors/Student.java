package it.unibo.constructors;

class Student {

    String name;
    String surname;
    int id;
    int matriculationYear;

    Student(final int id, final String name, final String surname, final int matriculationYear){
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.matriculationYear = matriculationYear;
    }

    /*void build(final int id, final String name, final String surname, final int matriculationYear) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.matriculationYear = matriculationYear;
    }*/

    void printStudentInfo() {
        IO.println("Student id: " + this.id);
        IO.println("Student name: " + this.name);
        IO.println("Student surname: " + this.surname);
        IO.println("Student matriculationYear: " + this.matriculationYear + "\n");
    }

    public static void main(final String[] args) {
        final Student marioRossi = new Student(1014, "Mario", "Rossi", 2013);
        marioRossi.printStudentInfo();

        final Student luigiGentile = new Student(1015, "Luigi", "Gentile", 2012);
        luigiGentile.printStudentInfo();

        final Student simoneBianchi = new Student(1016, "Simone", "Bianchi", 2010);
        simoneBianchi.printStudentInfo();

        final Student andreaBracci = new Student(1017, "Andrea", "Bracci", 2012);
        andreaBracci.printStudentInfo();
    }
}
