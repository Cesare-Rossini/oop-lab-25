package it.unibo.constructors;

class UseConstructors {

    void main() {
        // NB: Per verificare la correttezza dei costruttori implementati
        // stampare a video le informazioni relative agli studenti (metodo
        // printStudentInfo) e ai treni (a tal fine implementare un metodo
        // printTrainInfo nella classe Train).

        // 1) Creare lo studente Mario Rossi, matricola 1014, anno
        // immatricolazione 2013

        // 2) Creare lo studente Luca Bianchi, matricola 1018, anno
        // immatricolazione 2010

        // 3) Creare lo studente Peppino Vitiello, matricola 1019, anno
        // immatricolazione 2012

        // 4) Creare lo studente Luca Verdi, matricola 1020, anno
        // immatricolazione 2013

        // 5) Creare un treno con 300 posti di cui 100 in prima classe 200 in
        // seconda classe

        // 6) Creare un treno con 1200 posti di cui 50 in prima classe 1050 in
        // seconda classe

        // 7) Creare un treno con 500 posti, tutti di seconda classe

        // 8) Creare un treno con numero di posti di default

        // 9) Verificare che il numero di posti
        // di default sia consistente (ossia che ci sia un numero positivo di
        // posti totali, e che la somma dei posti in prima e seconda classe dia
        // il totale dei posti sul treno).

        Student marioRossi = new Student (1014, "Mario", "Rossi" , 2013);
        Student lucaBianchi = new Student(1018, "Luca", "Bianchi", 2010);
        Student peppinoVitiello = new Student(1019, "Peppino", "Vitiello", 2012);
        Student lucaVerdi = new Student(1020, "Luca", "Verdi", 2013);

        marioRossi.printStudentInfo();
        lucaBianchi.printStudentInfo();
        peppinoVitiello.printStudentInfo();
        lucaVerdi.printStudentInfo();

        Train primoTreno = new Train(300, 100, 200);
        Train secondoTreno = new Train(1200, 50, 1050);
        Train terzoTreno = new Train(500, 0, 500);
        Train defaultTreno = new Train();

        primoTreno.printTrainInfo();
        secondoTreno.printTrainInfo();
        terzoTreno.printTrainInfo();
        defaultTreno.printTrainInfo();

        IO.println(primoTreno.getTotalSeats() == primoTreno.getFirstClassSeats() + primoTreno.getSecondClassSeats());
        IO.println(secondoTreno.getTotalSeats() == secondoTreno.getFirstClassSeats() + secondoTreno.getSecondClassSeats());
        IO.println(terzoTreno.getTotalSeats() == terzoTreno.getFirstClassSeats() + terzoTreno.getSecondClassSeats());
        IO.println(defaultTreno.getTotalSeats() == defaultTreno.getFirstClassSeats() + defaultTreno.getSecondClassSeats());
    }
}
