package d12_1_2023;

import org.w3c.dom.ls.LSOutput;

//Kreirati klasu ZeleniKarton koja ima:
//ime i prezime studenta
//broj indeksa
//naziv predmeta
//ime i prezime profesora
//ocenu - od 5 do 10
//gettere i settere
//konstruktore
//metodu koja vraca da li je ispit polozen ili ne
// (ispit je polozen ako je ocena veca od 5)
//metodu stampaj koja stampa podatke u formatu:
//		(naziv predmeta) - (ocena)
//		Student: ime i prezime, broj indeksa
//		Profesor: ime i prezime
public class ZeleniKarton {
        private String studentImePrezime;
        private String studentIndex;
        private String nazivPredmeta;
        private String profesorImePrezime;
        private int ocena;

        // Konstruktori
        public ZeleniKarton(String anitaNestorovic) {}
        public ZeleniKarton(String studentImePrezime, String studentIndex, String nazivPredmeta,
                            String profesorImePrezime, int ocena) {
            this.studentImePrezime = studentImePrezime;
            this.studentIndex = studentIndex;
            this.nazivPredmeta = nazivPredmeta;
            this.profesorImePrezime = profesorImePrezime;
            this.ocena = ocena;
        }

        // Getteri i setteri
        public String getStudentImePrezime() {
            return studentImePrezime; }
        public void setStudentImePrezime(String studentImePrezime) {
            this.studentImePrezime = ZeleniKarton.this.studentImePrezime; }
        public String getStudentIndex() {
            return studentIndex; }
        public void setStudentIndex(String studentIndex) {
            this.studentIndex = studentIndex; }
        public String getNazivPredmeta() {
            return nazivPredmeta; }
        public void setNazivPredmeta(String nazivPredmeta) {
            this.nazivPredmeta = ZeleniKarton.this.nazivPredmeta; }
        public String getProfesorImePrezime() {
            return profesorImePrezime; }
        public void setProfesorImePrezime(String profesorImePrezime) {
            this.profesorImePrezime = ZeleniKarton.this.profesorImePrezime; }
        public int getOcena() {
            return ocena; }
        public void setOcena(int ocena) {
            this.ocena = ocena; }

        // Metoda da li je polozio
        public String jePolozio() {
            if (this.ocena > 5) {
                return "Polozio";
            } else {
                return "Nije polozio";
            }
        }

        // Metoda stampanje
        public void stampaj() {
            System.out.println(this.nazivPredmeta + " - " + this.ocena);
            System.out.println("Student: " + this.studentImePrezime + ", " + this.studentIndex);
            System.out.println("Professor: " + this.profesorImePrezime);
        }
}